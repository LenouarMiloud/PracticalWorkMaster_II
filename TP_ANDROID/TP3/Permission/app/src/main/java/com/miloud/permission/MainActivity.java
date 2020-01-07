package com.miloud.permission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    public static final String ACTION_BOOM = "com.miloud.permission.boom_action";
    public static final String Action = "com.miloud.permission";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
