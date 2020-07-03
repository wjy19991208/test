package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
* @description 
* @author Tim Lin
* @create 2018-07-01 
**/
@Mapper
public interface UserDAO {

    @Select(value = "SELECT * FROM User")//查询员工数据
    List<User> getAllUser();

    @Insert(value = "INSERT INTO User(user.`uid`,user.`name`,user.identity,user.'salary')\n" +
            "VALUE(#{uid},#{name},#{identity},#{salary})")//插入员工数据
    int insert(User user);

    @Update(value = "UPDATE User SET User.salary = #{salary} WHERE user.uid = #{uid}")//修改员工数据
    int updateSalary(Integer uid,int salary);

    @Delete(value = "DELETE FROM User WHERE uid= #{uid}")//删除员工数据
    int deleteUser(Integer uid);


}
