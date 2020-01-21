package com.miloud.dynamicbroadcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    LocalBroadcastManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = LocalBroadcastManager.getInstance(this);

        manager.registerReceiver( new Receiver(),
                new IntentFilter("com.miloud.dynamicbroadcast.ACTION"));
    }

    public void onDynamicBroadcast(View view) {
        manager.sendBroadcast(new Intent("com.miloud.dynamicbroadcast.ACTION"));
    }
}

