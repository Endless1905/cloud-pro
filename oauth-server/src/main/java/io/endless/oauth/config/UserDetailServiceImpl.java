package io.endless.oauth.config;

import com.google.common.collect.Lists;
import io.endless.commons.domain.TbPermission;
import io.endless.commons.domain.TbUser;
import io.endless.commons.mapper.TbPermissionMapper;
import io.endless.commons.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Autowired
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        TbUser user = tbUserMapper.selectOneByExample(example);

        List<GrantedAuthority> grantedAuthorityList = Lists.newArrayList();
        if (user != null) {
            List<TbPermission> tbPermissionList = tbPermissionMapper.selectByUserId(user.getId());
            tbPermissionList.forEach(tbPermission -> {
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                grantedAuthorityList.add(grantedAuthority);
            });
        }
        return new User(user.getUsername(), user.getPassword(), grantedAuthorityList);
    }
}
