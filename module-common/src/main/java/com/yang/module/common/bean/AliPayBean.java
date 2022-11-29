package com.yang.module.common.bean;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AliPayBean {
    /**
     * 这个请求参数类就是把来自各个模块下的需要支付的信息在调用支付工具类的时候，有个统一的传参
     */

    /**
     * 订单相对超时时间
     */
    private String timeoutExpress = "30";

    /**
     * 订单总金额
     */

    private String totalAmount;

    /**
     * 产品码 我方在支付宝方某种产品申请的某个产品码
     */
    private String productCode;

    /**
     * 订单描述
     */
    private String body = "版权认证次数充值服务";

    /**
     * 订单标题
     */
    private String subject = "充值服务";

    /**
     * 外部订单号 (我方订单号)
     */
    private String OutTradeNo;

    /**
     * 订单绝对超时时间 time_expire和timeout_express两者只需传入一个或者都不传，如果两者都传，优先使用time_expire
     */
    private String timeExpire = "30";

    /**
     * 商品主类型 0：虚拟类商品；
     *          1：实物类商品。
     */
    private String goodsType = "0";

    /**
     * 优惠参数 (暂时用不到，如需使用，需要和支付宝协商后可用)
     */
    private String promoParams;

    /**
     * 公用回传参数 (如果请求时传递了该参数，支付宝会在异步通知时将该参数原样返回，作用在于确定请求唯一性)
     */
    private String passbackParams;

    /**
     * 商户原始订单号
     */
    private String merchantOrderNo;

    /**
     * 支付渠道
     */
    private String enablePayChannels;

    /**
     * 商户门店编号 (商户创建门店时输入的门店编号)
     */
    private String storeId;

    /**
     * 指定的 单通道支付
     */
    private String specifiedChannel;

    /**
     * 禁用的 某些通道支付
     */
    private String desablePayChannels;

    /**
     * 订单ID  仅用于支付宝保存订单信息
     */
    private Integer orderId;
}
