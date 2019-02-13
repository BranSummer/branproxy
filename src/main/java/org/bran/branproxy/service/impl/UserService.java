package org.bran.branproxy.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.dao.UserRepository;
import org.bran.branproxy.model.mysql.UserEntity;
import org.bran.branproxy.service.IUserService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-6 16:08
 * @Description:
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public UserEntity selectUserByName(String name) {
        return userRepository.findOne((root,query,criteriaBuilder) ->
                criteriaBuilder.equal(root.get("name"),name)).get();
    }
}
