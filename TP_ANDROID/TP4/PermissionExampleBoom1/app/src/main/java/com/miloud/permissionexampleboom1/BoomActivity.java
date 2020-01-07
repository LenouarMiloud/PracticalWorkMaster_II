package com.miloud.permissionexampleboom1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BoomActivity extends AppCompatActivity {

    public static final String ACTION_BOOM =
            "course.examples.permissionexample.boom.boom_action";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
