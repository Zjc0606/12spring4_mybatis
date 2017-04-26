package com.zjc.sm.mapper;


import com.zjc.sm.pojo.User;

/**
 * Created by zjc on 2017/4/19.
 *
 */
public interface UserMapper {

    //根据id查询用户信息
    public User findUserById(int id) throws Exception;


}
