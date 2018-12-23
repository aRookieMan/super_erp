package scut.bigproject.super_erp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    protected static SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

    public static Calendar stringToDate(String str) throws ParseException {
        Date date = format.parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static String getFutureDate(int future){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) + future);
        Date date = calendar.getTime();
        String result = format.format(date);
        return result;
    }

    public static String getNowTime(){
        return format.format(new Date());
    }
}
