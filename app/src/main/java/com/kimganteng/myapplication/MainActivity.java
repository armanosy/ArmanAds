package com.kimganteng.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.arman.armads.ArmOpenAds;
import com.arman.armads.ArmanNative;
import com.arman.armads.ArmanBanner;
import com.arman.armads.ArmanInitialize;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArmOpenAds.LoadOpenAds("");
        RelativeLayout layAds = findViewById(R.id.layAds);
        RelativeLayout layNative = findViewById(R.id.layNative);
        ArmanInitialize.SelectAdsApplovinMax(this,"","");
        ArmanBanner.SmallBannerApplovinMax(this,layAds,"","123456789","");
        ArmanNative.SmallNativeAdmobRectangle(this,layNative,"","ca-app-pub-3940256099942544/2247696110","","","","","","");
    }
}