package com.whu.miniapp.service;

import com.whu.miniapp.entity.User;
import com.whu.miniapp.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Author: 胡龙晨
 * Date: 2021-01-04
 */

@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    /**
     * 用户注册
     *
     * @param user_name
     * @param user_passcode
     * @param user_gender
     * @param user_age
     * @param user_career
     * @param user_phone
     * @param user_addr
     * @return Response
     */

    @Transactional
    public int userRegister(String user_name,String user_passcode,String user_gender,Integer user_age,String user_career,String user_phone,String user_addr){
        User user1 = userMapper.findUserByUsername(user_name);
        if (user1 != null){
            return -1;
        }

        User user2 = userMapper.findUserByUserPhone(user_phone);
        if (user2 != null){
            return -2;
        }

        User user = new User();
        user.setUser_name(user_name);
        user.setUser_passcode(user_passcode);
        user.setUser_gender(user_gender);
        user.setUser_age(user_age);
        user.setUser_career(user_career);
        user.setUser_phone(user_phone);
        user.setUser_addr(user_addr);
        user.setUser_status(0);
        user.setUser_type(0);

        int cnt = userMapper.insertUser(user);
        if(cnt > 0 ){
            return 0;
        }
        else{
            return -3;
        }
    }

    /**
     * 用户登录
     *
     * @param input
     * @param user_passcode
     * @return Response
     */
    @Transactional
    public int userLogin(String input,String user_passcode){
        User user = userMapper.findUserByUsername(input);
        if(user == null){
            User user1 = userMapper.findUserByUserPhone(input);
            if(user1 == null){
                return -1;
            }
            else if(!user_passcode.equals((user1.getUser_passcode()))){
                return -2;
            }
            else if(user1.getUser_status()==1){
                return -3;
            }
            else{
                return user1.getUser_id();
            }
        }
        else if(!user_passcode.equals(user.getUser_passcode())){
            User user2 = userMapper.findUserByUserPhone(input);
            if(user2 == null){
                return -2;
            }
            else if(!user_passcode.equals((user2.getUser_passcode()))){
                return -2;
            }
            else if(user2.getUser_status()==1){
                return -3;
            }
            else{
                return user2.getUser_id();
            }
        }
        else if(user.getUser_status()==1){
            return -3;
        }
        else{
            return user.getUser_id();
        }
    }
}