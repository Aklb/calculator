package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bth_px).setOnClickListener(this);
        findViewById(R.id.bth_color).setOnClickListener(this);
        findViewById(R.id.bth_screen).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bth_px){
            Intent intent=new Intent(this,PxActivity.class);
            startActivity(intent);
        }else if (view.getId()==R.id.bth_color){
            Intent intent=new Intent(this,ColorActivity.class);
            startActivity(intent);
        }else if (view.getId()==R.id.bth_screen){
            Intent intent=new Intent(this,ScreenActivity.class);
            startActivity(intent);
        }
    }
}
