package io.endless.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import io.endless.commons.mapper.TbUserRoleMapper;
import io.endless.user.service.TbUserRoleService;
@Service
public class TbUserRoleServiceImpl implements TbUserRoleService{

    @Resource
    private TbUserRoleMapper tbUserRoleMapper;

}
