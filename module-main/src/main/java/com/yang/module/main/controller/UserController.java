package com.yang.module.main.controller;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.yang.module.common.constant.SystemConstant;
import com.yang.module.common.util.*;
import com.yang.module.main.dao.pojo.User;
import com.yang.module.main.service.UserService;
import org.apache.http.util.TextUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/api/user")
public class UserController {

    @Resource
    private UserService userService;

//    @ResponseBody
//    @RequestMapping(value = "/test", method = RequestMethod.GET)
//    public String queryTabsByType() {
//
//        return MResultUtil.resultSuccess(CodeEnum.REGISTER_ERROR.getMessage(),userService.test());
//    }


    @ResponseBody
    @PostMapping("/login")
    public String login(@RequestBody JSONObject jsonObject){
        String userPhone = jsonObject.getString("phone");
        String password = jsonObject.getString("password");
        String verificationCode = jsonObject.getString("verificationCode");
        LogUtils.logDebug(jsonObject.toJSONString());

        if (TextUtils.isEmpty(userPhone)){
            return MResultUtil.resultSuccess(CodeEnum.PARAM_ERROR);
        }

        User user = userService.login(userPhone);

        if (user == null){

            if (TextUtils.isEmpty(password) && TextUtils.isEmpty(verificationCode)){
                return MResultUtil.resultSuccess(CodeEnum.PARAM_ERROR);
            }

            if (!TextUtils.isEmpty(verificationCode) && !StringUtils.equals("123",verificationCode)){
                return MResultUtil.resultSuccess(CodeEnum.V_CODE_ERROR);
            }


            User registerUser = new User();

            registerUser.setId("MieMie"+ System.currentTimeMillis() +UUID.randomUUID().toString().replace("-",""));
            registerUser.setToken(JWTUtil.createToken(registerUser.getId()));
            registerUser.setUserPhone(userPhone);
            Date createTime = new Date();
            registerUser.setCreateTime(createTime);
            registerUser.setUpdateTime(createTime);

            if (!TextUtils.isEmpty(password)){
                registerUser.setUserPassword(password);
            }

            userService.register(registerUser);
            registerUser.setUserPassword(null);
            return MResultUtil.resultSuccess(CodeEnum.LOGIN_SUCCESS,registerUser);
        }


        if (!TextUtils.isEmpty(password)){
            if (!StringUtils.equals(user.getUserPassword(),password)){
                return MResultUtil.resultSuccess(CodeEnum.PASSWORD_ERROR);
            }else {
                user.setUserPassword(null);
                return MResultUtil.resultSuccess(CodeEnum.LOGIN_SUCCESS,user);
            }
        }else if (!TextUtils.isEmpty(verificationCode)){
            if (!StringUtils.equals("123",verificationCode)){
                return MResultUtil.resultSuccess(CodeEnum.V_CODE_ERROR);
            }else {
                user.setUserPassword(null);
                return MResultUtil.resultSuccess(CodeEnum.LOGIN_SUCCESS,user);
            }
        }else {
            return MResultUtil.resultSuccess(CodeEnum.PARAM_ERROR);
        }

    }

    @ResponseBody
    @PostMapping("/getUserInfo")
    public String getUserInfo(@RequestBody JSONObject jsonObject){
        String id = jsonObject.getString(SystemConstant.ID);
        if (StringUtils.isEmpty(id)){
            return MResultUtil.resultSuccess(CodeEnum.PARAM_ERROR);
        }
        User userInfo = userService.getUserInfo(id);
        if (userInfo != null){
            userInfo.setUserPassword(null);
        }
        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS,userInfo);
    }



    @ResponseBody
    @PostMapping("/updateUserInfo")
    public String updateUserInfo(@RequestBody User user){

        if (null == user){
            return MResultUtil.resultSuccess(CodeEnum.PARAM_ERROR);
        }

        User userInfo = userService.getUserInfo(user.getId());
        if (null == userInfo){
            return MResultUtil.resultSuccess(CodeEnum.NO_USER_ERROR);
        }

        user.setUpdateTime(new Date());
        userService.updateUserInfo(user);

        User realUserInfo = userService.getUserInfo(user.getId());
        if (realUserInfo != null){
            realUserInfo.setUserPassword(null);
        }

        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS,realUserInfo);
    }
    @ResponseBody
    @PostMapping("/sign")
    public String sign(@RequestBody String id){

        if (StringUtils.isEmpty(id)){
            return MResultUtil.resultSuccess(CodeEnum.PARAM_ERROR);
        }
        User userInfo = userService.getUserInfo(id);
        if (null == userInfo){
            return MResultUtil.resultSuccess(CodeEnum.NO_USER_ERROR);
        }
        if (userInfo.getUserIsSign()){
            return MResultUtil.resultSuccess(CodeEnum.HAD_SIGN_ERROR);
        }
        Integer userSign = userInfo.getUserSign()+1;
        userInfo.setUserSign(userSign);
        userInfo.setUserIsSign(true);
        userInfo.setUpdateTime(new Date());
        userService.updateUserInfo(userInfo);

        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS);
    }


    @ResponseBody
    @PostMapping("/searchUser")
    public String searchUser(@RequestBody JSONObject jsonObject){
        String keyword = jsonObject.getString(SystemConstant.KEYWORD);
        int pageNum = jsonObject.getInteger(SystemConstant.PAGE_NUM);
        int pageSize = jsonObject.getInteger(SystemConstant.PAGE_SIZE);
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userService.searchUser(keyword);
        PageData<User> pageData = new PageData<>(users);
        return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS,pageData);
    }



}
