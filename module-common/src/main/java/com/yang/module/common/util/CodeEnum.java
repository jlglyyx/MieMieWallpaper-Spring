package com.yang.module.common.util;

public enum CodeEnum {


    /**
          *
          * success
          *
          */
    LOGIN_SUCCESS("200", "登录成功", true),

    REGISTER_SUCCESS("200", "注册成功", true),

    REQUEST_SUCCESS("200", "请求成功", true),

    UPLOAD_SUCCESS("200", "上传成功", true),

    QUERY_SUCCESS("200", "查询成功", true),

    /**
     *
     * error
     *
     */

    LOGIN_ERROR("20001", "登录失败", false),

    REGISTER_ERROR("20002", "注册失败,用户已存在", false),

    REQUEST_ERROR("20003", "请求失败", false),

    NO_USER_ERROR("20004", "用户不存在", false),

    PASSWORD_ERROR("20005", "密码错误", false),



    ACCOUNT_EMPTY_ERROR("20006", "用户账号为空", false),

    PASSWORD_EMPTY_ERROR("20007", "用户密码为空", false),

    UPLOAD_ERROR("20008", "上传失败", false),


    PARAM_ERROR("20009", "参数错误或参数缺失", false),

    V_CODE_ERROR("200010", "验证码错误", false),


    TOKEN_EXPIRED_ERROR("200011", "token失效,请重新登录", false),

    TOKEN_EMPTY_ERROR("200012", "token为空", false),

    HAD_SIGN_ERROR("200013", "今日已经签到", false);

    private String code;
    private String message;
    private boolean success;



    private CodeEnum(String code,String message,boolean success){

        this.code = code;
        this.message = message;
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
