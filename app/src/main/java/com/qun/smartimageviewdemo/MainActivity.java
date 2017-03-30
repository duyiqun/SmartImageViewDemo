package com.qun.smartimageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loopj.android.image.SmartImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        //注意使用前，加网络访问权限
        SmartImageView myImage = (SmartImageView) this.findViewById(R.id.my_image);
        myImage.setImageUrl("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
    }
}
