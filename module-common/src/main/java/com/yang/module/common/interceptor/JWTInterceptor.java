//package com.yang.module.common.interceptor;
//
//import com.alibaba.cloud.commons.lang.StringUtils;
//import com.yang.module.common.util.CodeEnum;
//import com.yang.module.common.util.JWTUtil;
//import com.yang.module.common.util.MResultUtil;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class JWTInterceptor implements HandlerInterceptor {
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String token = request.getHeader("token");
//        System.out.println(token+"=================");
//        if (StringUtils.isEmpty(token)){
//            response.setContentType("application/json;charset=utf-8");
//            response.getWriter().print(MResultUtil.resultSuccess(CodeEnum.TOKEN_EMPTY_ERROR));
//            return false;
//        }
//        try {
//            JWTUtil.parseToken(token);//调用token解析的工具类进行解析
//            return true;  //请求放行
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        response.setContentType("application/json;charset=utf-8");
//        response.getWriter().print(MResultUtil.resultSuccess(CodeEnum.TOKEN_EXPIRED_ERROR));
//        return false;  //异常不放行
//
//    }
//}
