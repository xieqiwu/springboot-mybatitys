package com.jbit.service;

import com.jbit.entity.User;
import com.jbit.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }

    @Transactional
    public int insert(Map<String, Object> params){
        User user = new User();
        user.setId(Integer.parseInt((params.get("id").toString())));
        user.setUserName(params.get("userName").toString());
        user.setPassWord(params.get("passWord").toString());
        user.setRealName(params.get("realName").toString());
        return userMapper.insert(user);
    }
}