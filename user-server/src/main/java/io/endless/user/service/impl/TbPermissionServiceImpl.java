package io.endless.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import io.endless.commons.mapper.TbPermissionMapper;
import io.endless.user.service.TbPermissionService;
@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

}
