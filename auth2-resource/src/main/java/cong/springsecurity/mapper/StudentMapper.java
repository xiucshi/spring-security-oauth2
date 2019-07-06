package cong.springsecurity.mapper;


import cong.springsecurity.bean.Student;
import org.apache.ibatis.annotations.*;

/**
 * @Time : 2019/06/29 下午 04:56
 * @Author : xiuc_shi
 **/
@Mapper
public interface StudentMapper {
    @Select("select * from student where id = #{id}")
    Student getStudentById(Integer id);

    @Delete("delete from student where id = #{id}")
    int deleteStudentById(Integer id);

    @Insert("insert into student (name, subject, score) values(#{name},#{subject},#{score})")
    int insertStudent(Student stu);

    @Update("update student set name = #{name},subject = #{subject},score = #{score} where id = #{id}")
    int updateStudent(Student stu);
}
