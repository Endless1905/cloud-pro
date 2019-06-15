package io.endless.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import io.endless.commons.mapper.TbRoleMapper;
import io.endless.user.service.TbRoleService;
@Service
public class TbRoleServiceImpl implements TbRoleService{

    @Resource
    private TbRoleMapper tbRoleMapper;

}
