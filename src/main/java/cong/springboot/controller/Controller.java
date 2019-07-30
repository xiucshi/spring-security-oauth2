package cong.springboot.controller;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Time : 2019/07/05 下午 03:26
 * @Author : xiuc_shi
 **/
@RestController
public class Controller {
    @GetMapping("/auth/user/token")
    public UsernamePasswordAuthenticationToken getToken(@PathVariable("username") String username,@PathVariable("password") String password){
        return new UsernamePasswordAuthenticationToken(username, password);
    }
}
