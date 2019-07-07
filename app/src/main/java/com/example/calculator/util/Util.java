package com.example.calculator.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class Util {
    //根据该手机分辨率，从转换dp为px
    public static int dip2px(Context context,float dpValues) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValues*scale+0.5f);
    }
    //根据该手机分辨率，从转换px为dp
    public static int px2dip(Context context,float pxValues){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValues/scale+0.5f);
    }
    //获取屏幕宽度
    public static int getScreenWidth(Context context){
        WindowManager windowManager=(WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics=new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
    //获取屏幕高度
    public static int getScreenHeight(Context context){
        WindowManager windowManager=(WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics=new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
    //获取屏幕像素密度
    public static float getScreenDensity(Context context){
        WindowManager windowManager=(WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics=new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }
}
