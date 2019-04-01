package org.bran.branproxy.service.impl;

import org.apache.commons.collections.CollectionUtils;
import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dao.ResourceModelMapper;
import org.bran.branproxy.dao.RoleResourceModelMapper;
import org.bran.branproxy.dto.permission.AddPermissionDto;
import org.bran.branproxy.model.ResourceModel;
import org.bran.branproxy.model.RoleResourceModel;
import org.bran.branproxy.service.IPermissionService;
import org.bran.branproxy.vo.BasePageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author lizhle
 */
@Service
public class PermissionService implements IPermissionService {

    @Resource
    private ResourceModelMapper resourceModelMapper;
    @Resource
    private RoleResourceModelMapper roleResourceModelMapper;

    @Override
    public ResultResponse addPermission(AddPermissionDto dto) {
        ResourceModel resourceModel = ResourceModel.Build().code(dto.getCode()).pid(dto.getPid()).title(dto.getTitle())
                .build();
        ResourceModel oldModel = resourceModelMapper.queryResourceModelLimit1(ResourceModel.QueryBuild()
                .code(dto.getCode()).isDelete(CommonContransts.NOT_DELETE));
        if(Objects.nonNull(oldModel)){
            return ResultResponse.buildFail("权限code已存在");
        }
        resourceModelMapper.insertResourceModel(resourceModel);
        return ResultResponse.buildSuccess();
    }

    @Override
    public ResultResponse removePermission(long id) {
        List<RoleResourceModel> resourceModels = roleResourceModelMapper.queryRoleResourceModel(RoleResourceModel.QueryBuild()
                .resourceId(id).isDelete(CommonContransts.NOT_DELETE).build());
        if(CollectionUtils.isNotEmpty(resourceModels)){
            return ResultResponse.buildFail("此权限与角色存在绑定，不可删除");
        }
        resourceModelMapper.update(ResourceModel.UpdateBuild()
                .set(ResourceModel.Build().isDelete(CommonContransts.DELETE).build())
                .where(ResourceModel.ConditionBuild().idList(id).isDeleteList(CommonContransts.NOT_DELETE)));
        return ResultResponse.buildSuccess();
    }

    @Override
    public ResultResponse updatePermission() {
        return null;
    }

    @Override
    public BasePageVo listPermission() {
        return null;
    }
}
