package cong.springboot.server.Impl;

import cong.springboot.mapper.UserMapper;
import cong.springboot.model.LoginUser;
import cong.springboot.server.SxcUserDetialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Time : 2019/07/06
 * @Author : xiuc_shi
 **/
@Service
public class UserDetailsImpl implements SxcUserDetialsService{
    @Resource
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginUser user = userMapper.selectUser(username);
        return user;
    }
}
