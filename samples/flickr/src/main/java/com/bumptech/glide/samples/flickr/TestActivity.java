package com.bumptech.glide.samples.flickr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by ZhangKe on 2019/3/14.
 */
public class TestActivity extends AppCompatActivity {

    private static final String TAG = "TestActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ImageView img = findViewById(R.id.img);
        Glide.with(this)
                .load("https://img3.doubanio.com/view/status/l/public/2083ffc07453d46.webp")
                .into(img);

    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Fragment> list = getSupportFragmentManager().getFragments();
        Log.d(TAG, "Fragments:" + list.size());
    }
}
