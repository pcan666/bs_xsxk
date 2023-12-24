package com.pengcan.dao;

import com.pengcan.entity.StudentInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface StudentInfoDao extends Mapper<StudentInfo> {

    @Select("select * from student_info where name = #{name} and password = #{password}")
    StudentInfo findByNameAndPassword(@Param("name") String name,@Param("password") String password);

    @Select("select * from student_info where name = #{name}")
    StudentInfo findByName(@Param("name") String name);

    List<StudentInfo> findByNamePage(@Param("name") String name);


    List<StudentInfo> selectAllJoinXueyuan();

    List<StudentInfo> findByNamePageJoinXueyuan(String name);
}
