package com.kayo.mutiimageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kayo.mutiimageview.MutiImageView;

public class MainActivity extends AppCompatActivity {

    MutiImageView normal;
    MutiImageView normal_circle;
    MutiImageView special_circle;
    MutiImageView rectangle;
    MutiImageView other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        normal = (MutiImageView) findViewById(R.id.normal);
        normal_circle = (MutiImageView) findViewById(R.id.normal_circle);
        special_circle = (MutiImageView) findViewById(R.id.special_circle);
        rectangle = (MutiImageView) findViewById(R.id.rectangle);
        other = (MutiImageView) findViewById(R.id.other);

        //设置圆角半径
        rectangle.setRadius(100,100,100,100);
        //设置样式
        other.setStyle(MutiImageView.STYLE_CIRCLE);
    }
}
