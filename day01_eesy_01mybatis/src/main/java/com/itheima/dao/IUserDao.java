package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

public interface IUserDao {
    //1.增删查改
    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    public void insert(User user);

    @Delete("delete from user where id =#{id}")
    public void delete(Integer id);

    @Select("select * from user")
    public List<User> findAll();
    @Select("select * from where id = #{id}")
    public User findById(Integer id);

    @Update("update user set username=#{}")

}
