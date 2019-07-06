package cong.springsecurity.controller;


import cong.springsecurity.service.Service;
import model.User;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Time : 2019/07/05 下午 03:26
 * @Author : xiuc_shi
 **/
@RestController
public class Controller {
    @Autowired
    private Service service;
    @PostMapping("/user")
    public String register(User user){
        return service.register(user);
    }

    @DeleteMapping("/user")
    public String logout(@RequestParam("username") String username,@RequestParam("password") String password){
        return service.logout(username, password);
    }

}
