package cong.springsecurity.service;


import cong.springsecurity.mapper.UserMapper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

/**
 * @Time : 2019/07/06
 * @Author : xiuc_shi
 **/
@org.springframework.stereotype.Service
public class Service {
    @Resource
    private UserMapper mapper;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public String register(User user){
        User loginUser = mapper.selectByUsername(user.getUsername());
        if(loginUser != null){
            return "该用户已存在";
        }
        String password = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(password);
        int res = mapper.insert(user);
        return res > 0?"注册成功":"注册失败";
    }

    public String logout(String username, String password){
        User user = mapper.selectByUsername(username);
        boolean matches = bCryptPasswordEncoder.matches(password, user.getPassword());
        if(matches){
            int res = mapper.deleteByUsername(username);
            return res > 0?"已删除":"删除失败";
        }else {
            return "该用户不存在";
        }
    }
}
