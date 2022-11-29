package com.yang.module.common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;

public class MResultUtil {

    public static Gson getGson() {
        return new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .setLongSerializationPolicy(LongSerializationPolicy.STRING)
                .create();
    }

    public static String resultSuccess(CodeEnum codeEnum) {

        MResult<String> mResult = new MResult<>();
        mResult.setCode(codeEnum.getCode());
        mResult.setMessage(codeEnum.getMessage());
        mResult.setSuccess(codeEnum.getSuccess());
        mResult.setData(null);
        return getGson().toJson(mResult);
    }
    public static <T> String resultSuccess(CodeEnum codeEnum,T data) {

        MResult<T> mResult = new MResult<>();
        mResult.setCode(codeEnum.getCode());
        mResult.setMessage(codeEnum.getMessage());
        mResult.setSuccess(codeEnum.getSuccess());
        mResult.setData(data);
        return getGson().toJson(mResult);
    }
    public static String resultSuccess(String message) {

        MResult<String> mResult = new MResult<>();
        mResult.setCode("200");
        mResult.setMessage(message);
        mResult.setSuccess(true);
        mResult.setData(null);
        return getGson().toJson(mResult);
    }

    public static <T> String resultSuccess(String message, T data) {

        MResult<T> mResult = new MResult<>();
        mResult.setCode("200");
        mResult.setMessage(message);
        mResult.setSuccess(true);
        mResult.setData(data);
        return getGson().toJson(mResult);
    }

    public static <T> String resultSuccess(String code, String message, boolean success, T data) {
        MResult<T> mResult = new MResult<>();
        mResult.setCode(code);
        mResult.setMessage(message);
        mResult.setSuccess(success);
        mResult.setData(data);
        return getGson().toJson(mResult);
    }


}
