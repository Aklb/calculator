package com.example.calculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.util.Util;

public class PxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int dip_10 = Util.dip2px(this, 10L);
        TextView tv_padding = findViewById(R.id.tv_padding);
        tv_padding.setPadding(dip_10,dip_10,dip_10,dip_10);
    }
}
