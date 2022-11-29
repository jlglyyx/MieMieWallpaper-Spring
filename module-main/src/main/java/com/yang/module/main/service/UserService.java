package com.yang.module.main.service;

import com.yang.module.main.dao.pojo.User;

import java.util.List;

public interface UserService {



    User login(String userPhone);

    boolean register(User user);

    User getUserInfo(String id);

    List<User> searchUser(String keyword);


    User updateUserInfo(User user);




}
