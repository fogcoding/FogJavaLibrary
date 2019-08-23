package com.log;

//import android.util.Log;

/**
 * Created By:  Andrew
 * Date: 2019/8/20
 * e-mail: thifog001@gmail.com
 */


public class FogBaseLog {

    public static void LogE(String tag,String info){
//        Log.e(tag,info);
        System.out.println("log.e:  "+tag+",  "+info);
    }

    public static void LogV(String tag,String info){
//        Log.v(tag,info);
        System.out.println("log.v:  "+tag+",  "+info);
    }





}
