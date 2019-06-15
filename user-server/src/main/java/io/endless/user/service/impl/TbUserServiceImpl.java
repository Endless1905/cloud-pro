package io.endless.user.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import io.endless.commons.mapper.TbUserMapper;
import io.endless.user.service.TbUserService;
@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

}
