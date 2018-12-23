package scut.bigproject.super_erp.util;


import scut.bigproject.super_erp.entity.returnentity.Result;

public class ResultUtil {
    private static Result result = new Result();

    public static Result badResultReturner(String msg, Object data){
        result.setStatus(1);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    public static Result badResultReturner(String msg){
        result.setStatus(1);
        result.setMessage(msg);
        result.setData(null);
        return result;
    }

    public static Result goodResultReturner(String msg, Object data){
        result.setStatus(0);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    public static Result goodResultReturner(Object data){
        result.setStatus(0);
        result.setMessage("ok");
        result.setData(data);
        return result;
    }

    public static Result goodResultReturner( ){
        result.setStatus(0);
        result.setMessage("ok");
        result.setData(null);
        return result;
    }
}
