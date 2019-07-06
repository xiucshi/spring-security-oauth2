package cong.springsecurity.mapper;



import model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Time : 2019/07/06
 * @Author : xiuc_shi
 **/
@org.apache.ibatis.annotations.Mapper
public interface UserMapper {

    @Insert("insert into user (username, password, sex, age) values (#{username}, #{password}, #{sex}, #{age})")
    int insert(User user);

    @Select("select * from user where username = #{username}")
    User selectByUsername(String username);
    @Delete("delete from user where username = #{username}")
    int deleteByUsername(@Param("username") String username);
}
