package com.yang.module.main.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConfig;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.yang.module.common.bean.AliPayBean;
import com.yang.module.common.properties.AliPayProperties;
import com.yang.module.common.util.CodeEnum;
import com.yang.module.common.util.MResultUtil;
import com.yang.module.common.util.PayUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping(value = "/api/pay")
public class PayController {


    @ResponseBody
    @PostMapping("/alipay")
    public String createOrderInfo(@RequestBody AliPayBean aliPayBean) {
        try {
            AlipayConfig alipayConfig = new AlipayConfig();
            //设置网关地址
            alipayConfig.setServerUrl(AliPayProperties.URL);
            //设置应用ID
            alipayConfig.setAppId(AliPayProperties.APPID);
            //设置应用私钥
            alipayConfig.setPrivateKey(AliPayProperties.PRIVATE_KEY);
            //设置请求格式，固定值json
            alipayConfig.setFormat(AliPayProperties.FORMAT);
            //设置字符集
            alipayConfig.setCharset(AliPayProperties.CHARSET);
            //设置签名类型
            alipayConfig.setSignType(AliPayProperties.SIGN_TYPE);
            //设置支付宝公钥
            alipayConfig.setAlipayPublicKey(AliPayProperties.ALIPAY_PUBLIC_KEY);
            //实例化客户端
            AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig);
            AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
            AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
            model.setOutTradeNo(PayUtils.createOrderNum());
            model.setTotalAmount("9");
            model.setSubject("会员充值");
            List<String> queryOptions = new ArrayList<>();
            queryOptions.add("");
            model.setQueryOptions(queryOptions);
            request.setNotifyUrl(AliPayProperties.NOTIFY_URL);
            request.setBizModel(model);
            AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
            if (response.isSuccess()) {
                // TODO: 2022/11/29 支付宝订单入库
                System.out.println("调用成功");
                return MResultUtil.resultSuccess(CodeEnum.REQUEST_SUCCESS, response);
            } else {
                System.out.println("调用失败");
                return MResultUtil.resultSuccess(CodeEnum.REQUEST_ERROR, response);
            }
        } catch (Exception e) {
            return MResultUtil.resultSuccess(CodeEnum.REQUEST_ERROR);
        }
    }

    @ResponseBody
    @PostMapping("/alipay/notify")
    public String alipayNotify(HttpServletRequest request) throws AlipayApiException {
        //获取支付宝POST过来反馈信息，将异步通知中收到的待验证所有参数都存放到map中
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用。
            //valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        //调用SDK验证签名
        //公钥验签示例代码
        boolean signVerified = AlipaySignature.rsaCheckV1(params, AliPayProperties.ALIPAY_PUBLIC_KEY, AliPayProperties.CHARSET, AliPayProperties.SIGN_TYPE);
        //公钥证书验签示例代码
        //   boolean flag = AlipaySignature.rsaCertCheckV1(params,alipayPublicCertPath,"UTF-8","RSA2");
        if (signVerified) {
            // TODO 验签成功后
            // TODO: 2022/11/29 支付宝订单对比


//            商家需要验证该通知数据中的 out_trade_no 是否为商家系统中创建的订单号。
//            判断 total_amount 是否确实为该订单的实际金额（即商家订单创建时的金额）。
//            校验通知中的 seller_id（或者 seller_email ) 是否为 out_trade_no 这笔单据的对应的操作方（有的时候，一个商家可能有多个seller_id/seller_email）。
//            验证 app_id 是否为该商家本身
            //按照支付结果异步通知中的描述，对支付结果中的业务内容进行1\2\3\4二次校验，校验成功后在response中返回success
            System.out.println("验签成功后====" + MResultUtil.getGson().toJson(params));
            return "success";
        } else {
            // TODO 验签失败则记录异常日志，并在response中返回fail.
            return "fail";
        }
    }

}
