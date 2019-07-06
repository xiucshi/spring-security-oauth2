package cong.springsecurity.controller;


import cong.springsecurity.bean.Student;
import cong.springsecurity.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Time : 2019/06/29 下午 05:03
 * @Author : xiuc_shi
 **/
@RestController
public class StudentController {
    @Resource
    private StudentMapper studentMapper;

    @GetMapping("/stu/{id}")
    public Student getStudent(@PathVariable("id") Integer id){
        return studentMapper.getStudentById(id);
    }

    @PostMapping("/stu")
    public Student insertStudent(Student stu){
        studentMapper.insertStudent(stu);
        return stu;
    }
    @DeleteMapping("/stu/{id}")
    public String deleteStudent(@PathVariable("id") Integer id){
        int res = studentMapper.deleteStudentById(id);
        return res > 0?"已删除" : "删除失败";
    }
    @PutMapping("/stu")
    public String updateStudent(Student stu){
        int res = studentMapper.updateStudent(stu);
        return res > 0?"已更新":"更新失败";
    }
}
