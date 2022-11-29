package com.yang.module.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class PayUtils {

    /**
     * 要求外部订单号必须唯一。
     * @return
     */
    public static String createOrderNum() {
        SimpleDateFormat format = new SimpleDateFormat("MMddHHmmss", Locale.getDefault());
        Date date = new Date();
        String key = format.format(date);

        Random r = new Random();
        key = key + r.nextInt();
        key = key.substring(0, 15);
        return "MieMie_Pay"+key;
    }

}
