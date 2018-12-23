package scut.bigproject.super_erp.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

public class EntityUtil {
    public static <T> T object2Entity(Object o, Class<T> clazz){
        return JSON.parseObject(JSON.toJSONString(o), clazz);
    }

    public static <T> List<T> objectList2EntityList(Object o, Class<T> clazz) {
        return JSONArray.parseArray(JSON.toJSONString(o), clazz);
    }
}
