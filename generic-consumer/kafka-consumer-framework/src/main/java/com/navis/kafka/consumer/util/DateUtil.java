package com.navis.kafka.consumer.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {

    public static Date localToGMT(Date inDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date gmt = new Date(sdf.format(inDate));
        return gmt;
    }

    public static String convertDateToUtc(Date inDate){
        Date utcDate = localToGMT(inDate);
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(utcDate);
    }


}
