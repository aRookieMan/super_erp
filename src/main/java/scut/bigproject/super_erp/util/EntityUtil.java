package scut.bigproject.super_erp.util;

import com.alibaba.fastjson.JSON;

public class EntityUtil {
    public static <T> T object2Entity(Object o, Class<T> clazz){
        return JSON.parseObject(JSON.toJSONString(o), clazz);
    }
}
