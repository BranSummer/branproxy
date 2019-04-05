package org.bran.branproxy.service.impl;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dao.ResourceModelMapper;
import org.bran.branproxy.dao.ResourceTypeMapper;
import org.bran.branproxy.dao.RoleResourceModelMapper;
import org.bran.branproxy.dto.permission.AddPermissionDto;
import org.bran.branproxy.dto.permission.UpdatePermissionDto;
import org.bran.branproxy.model.ResourceModel;
import org.bran.branproxy.model.ResourceType;
import org.bran.branproxy.model.RoleResourceModel;
import org.bran.branproxy.service.IPermissionService;
import org.bran.branproxy.vo.BasePageVo;
import org.bran.branproxy.vo.permission.PermissionVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PermissionService implements IPermissionService {

    @Resource
    private ResourceModelMapper resourceModelMapper;
    @Resource
    private RoleResourceModelMapper roleResourceModelMapper;
    @Resource
    private ResourceTypeMapper resourceTypeMapper;

    @Override
    public ResultResponse addPermission(AddPermissionDto dto) {
        ResourceModel resourceModel = ResourceModel.Build().code(dto.getCode()).pid(dto.getPid()).title(dto.getTitle())
                .build();
        ResourceModel oldModel = resourceModelMapper.queryResourceModelLimit1(ResourceModel.QueryBuild()
                .code(dto.getCode()).isDelete(CommonContransts.NOT_DELETE));
        if (Objects.nonNull(oldModel)) {
            return ResultResponse.buildFail("权限code已存在");
        }
        resourceModelMapper.insertResourceModel(resourceModel);
        return ResultResponse.buildSuccess();
    }

    @Override
    public ResultResponse removePermission(long id) {
        List<RoleResourceModel> resourceModels = roleResourceModelMapper.queryRoleResourceModel(RoleResourceModel.QueryBuild()
                .resourceId(id).isDelete(CommonContransts.NOT_DELETE).build());
        if (CollectionUtils.isNotEmpty(resourceModels)) {
            return ResultResponse.buildFail("此权限与角色存在绑定，不可删除");
        }
        resourceModelMapper.update(ResourceModel.UpdateBuild()
                .set(ResourceModel.Build().isDelete(CommonContransts.DELETE).build())
                .where(ResourceModel.ConditionBuild().idList(id).isDeleteList(CommonContransts.NOT_DELETE)));
        return ResultResponse.buildSuccess();
    }

    @Override
    public ResultResponse updatePermission(UpdatePermissionDto dto) {
        resourceModelMapper.update(ResourceModel.UpdateBuild()
                .set(ResourceModel.Build().pid(dto.getPid()).title(dto.getTitle()).code(dto.getCode()).build())
                .where(ResourceModel.ConditionBuild().idList(dto.getId()).isDeleteList(CommonContransts.NOT_DELETE)));
        return ResultResponse.buildSuccess();
    }

    @Override
    public List<PermissionVo> listPermission() {
        List<ResourceType> resourceTypeList = resourceTypeMapper.queryResourceType(ResourceType.QueryBuild()
                .isDelete(CommonContransts.NOT_DELETE).build());
        Map<Long, String> typeIdTitleMap = resourceTypeList.stream().collect(Collectors.toMap(ResourceType::getId,
                ResourceType::getTitle));
        List<ResourceModel> resourceModels = resourceModelMapper.queryResourceModel(ResourceModel.QueryBuild()
                .isDelete(CommonContransts.NOT_DELETE).build());
        return resourceModels.stream().map(e -> {
            PermissionVo vo = new PermissionVo();
            vo.setCode(e.getCode());
            vo.setId(e.getId());
            vo.setTitle(e.getTitle());
            vo.setTypeName(typeIdTitleMap.get(e.getPid()));
            return vo;
        }).collect(Collectors.toList());
    }
}
