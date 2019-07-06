package cong.springboot.model;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @Time : 2019/07/06
 * @Author : xiuc_shi
 **/

public class User {
    private String username;
    private String password;
    private String sex;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
