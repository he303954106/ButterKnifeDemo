package com.hk.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.hk.annotation.BindView;
import com.hk.library.Binding;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_1)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding.bind(this);
    }
}
