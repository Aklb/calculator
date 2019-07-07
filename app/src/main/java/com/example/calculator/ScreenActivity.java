package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.calculator.util.Util;

public class ScreenActivity extends AppCompatActivity {
    private TextView tv_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        tv_screen = findViewById(R.id.tv_screen);
        showScreenInfo();
    }

    private void showScreenInfo() {
        int width = Util.getScreenWidth(this);
        int height = Util.getScreenHeight(this);
        float screendensity = Util.getScreenDensity(this);
        String info = String.format("当前屏幕的宽度是%dpx，高度是%dpx，像素密度是%f", width, height, screendensity);
        tv_screen.setText(info);
    }
}

