package com.yang.module.common.properties;

public class AliPayProperties {


    // 1.商户appid
    public static String APPID = "2021000121688756";

    // 应用公钥
    public static String APP_RSA_KEY = "";

    //2.私钥 pkcs8格式的
    public static String PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDRT+IeZgXjw6rYs2YcIIhwXEV3T02v6BknnMvtjp2HNt6kN98uIW/86wSY68bXl7jG4RU/hFWtvdKnarhDRrb+sCDts5Pw05QXSiHvWOPZ9hfG4CH+GHIcATTL9ClsUwypwD68rjiPZ7y8HNYwe1OInel5cCoNSjPiJFfPgI8fYtN6btSfqmRV578d8iz8RZP81N/31TSMfUx2vsTa+/l3vTu3Brn+IF3Y8szJWHtfWgthlcfeT2BcMYq8yFe7lkZzQlagtqBWmEKuv8NEjppcO7C+xbKXaghXqQBLSvEdFythQMnt95Mkk8VB0uWcs/yZf869i20D/A7JdTbmMkeHAgMBAAECggEBAMf4XbtVFUNo6IxnuKIeortWLDe0WDA6ue2Sa3Hl0rIfxc12Y46a+3bSwW2ntCy9ExdOaxJnx8NZmyu/VZNQt/vTIWJ3Mlveh5lIhes5LVZLOqQR9efgSwReUqaX+gs3vN1ggY+ZkwfOwA2oLynaaRAYbbpLYqGXxsHCnvHrjNEZy0WgTrWGHO1Qx5sdvA1rek7Ryy6s1yiDDNzr6+/hDoldsWzL05a4UuaD2xbpHgJl4pET8kEaout9pNNEnJG6XcPeZNiCBlT862XBJ097+bABsl3uqjKWGFhU95z7Sxd9hBMYEVpww+M6osztxYivIeJXFPkeWAbgYo2qLjJFtOECgYEA6Znog5lfDps14YyzKxcDLvhLt9ivAVnO+6vxnKmOiNbTsc6aG3USQlN49jxLyH99riAn12RO/I+DbS+A5C2/MUjUksVf+mpOsfHboTSfqU2n/C/22yfiUw7NeBT0e9lF/ZH0Q991LMM48HbOc6r0IbwxIEPPm86AnazYSUN+k8MCgYEA5WHC3DY+LPnIwh/nElXhMySS/nsP/8omKDuQVJSdWW19/sSzVdxugwTFA5jKmwwy5Jx7axmJtChlG1cbQvzHRQ868resarkZqTGMAnZdoBnt/Wc1hAm4kGDkwaAoNOoHAQcy3H9QvNCa/61EDgYCmrLx2ukQFpjNdGxjYG1i1O0CgYEAodBYDNivzPlc0HlbHu0Y6m9aW+aAC4p/YzwO6HtXXZiaGZ/Ihl6JIGKb9s17nU4a7AQgNQap5C8xVe/C88xwlR4jCewo+Nis3Hxxq/A87NT7GSjMcbDmCKzHTXgOhr/RyL1Sm7VtgG1WwtM5XUw9QiUPTo9Kf14DH7W8OLvFMWsCgYBe0ORNRpa43J9hrvJDIACwtUOVsaTRZOwU4VotvCi2mI3mS8SdjzqXKdeOPxAwuwAmg5B4mtvS/oecn4sDS53LLBp/zfCVROIYkASB2A+naFB52LnEVIhYFdU5PEyiYsJ2aFVb07y577jCSwrAiTd2XtWeWYxu6sayg0Mozs51mQKBgCD07Ip+9YOcRSrRW2kuEQSZBZdhB48LktDhFa5X+lK3iZR3nw4++z/SA1pEo3TwykfqdUbeV4CUAGv5iMAkYzf9ziDmTnenPhMjGbGC8UgWUn9XfPpEKlwYnwsJC2OVpSxTZOji9gqQ45/I/kD+PgIwDJ3i5mh5n4fRzbcCvUsk";


    // 3.支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj5NKWgKMX5FTKdn+RTnDKW8FzqV6g/sWgA5euxAEkoAhf7E4P8iPnqHLIjn6IuyjCWNUoBi3hw7qzP48aRZXHyg9gTeHgpbW32dSR6/pKUKpwTLJXdnka5aw5Z6lbumd2xQLkwPtV5Ufl5vJH0ugPNGRrqZEF2/f3TmzNB+j705e0r1+nbXMb11R+NB7LUqzGisrOLFyr55wfVFeOMG3W5rqeyj3gnQkqtXVcCWAgp+fjXQ11Fb58ARDovE5UWt6eu27yXQPRTRKnKu31sfJtRHGXti4sga82nlz0iw1wOHdlrp3Uuj8v1WQQ/9qV+i7y5lXOm3pipBEbK5GVPd4ZwIDAQAB";


    // 4.服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String NOTIFY_URL = "http://www.yyxjlgl.tk/api/pay/alipay/notify";

    //5.页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "https://www.baidu.com";

    // 6.请求支付宝的网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";

    // 7.编码
    public static String CHARSET = "UTF-8";

    // 8.返回格式
    public static String FORMAT = "json";

    // 9.加密类型
    public static String SIGN_TYPE = "RSA2";

    //10.签约产品代码
    public static String QUICK_MSECURITY_PAY = "QUICK_MSECURITY_PAY";
}
