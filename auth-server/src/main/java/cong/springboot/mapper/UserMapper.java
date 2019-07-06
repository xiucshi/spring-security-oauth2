package cong.springboot.mapper;

import cong.springboot.model.LoginUser;
import org.apache.ibatis.annotations.Select;


/**
 * @Time : 2019/07/06
 * @Author : xiuc_shi
 **/
//@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    LoginUser selectUser(String username);
}
