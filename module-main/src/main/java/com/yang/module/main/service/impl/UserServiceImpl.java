package com.yang.module.main.service.impl;

import com.yang.module.main.dao.mapper.SearchHistoryMapper;
import com.yang.module.main.dao.mapper.UserMapper;
import com.yang.module.main.dao.pojo.User;
import com.yang.module.main.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;



    @Override
    public User login(String userPhone) {

        return userMapper.selectByPhone(userPhone);
    }

    @Override
    public boolean register(User user) {
        try {
            userMapper.insert(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User getUserInfo(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> searchUser(String keyword) {
        List<User> users = userMapper.searchUser(keyword);
        for (User user:users) {
            user.setUserPassword(null);
        }
        return users;
    }

    @Override
    public User updateUserInfo(User user) {

        userMapper.updateByPrimaryKeySelective(user);

        return null;
    }




}
