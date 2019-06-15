package io.endless.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import io.endless.commons.mapper.TbRolePermissionMapper;
import io.endless.user.service.TbRolePermissionService;
@Service
public class TbRolePermissionServiceImpl implements TbRolePermissionService{

    @Resource
    private TbRolePermissionMapper tbRolePermissionMapper;

}
