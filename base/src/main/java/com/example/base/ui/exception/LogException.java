package com.example.base.ui.exception;

import android.util.Log;

/**
 * @author:SunShibo
 * @date:2022-09-07 17:59
 * @feature:
 */
public class LogException extends Exception{
    private String msg;
    public LogException(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    public void printMsg(){
        Log.i("exception", msg);
    }
}
