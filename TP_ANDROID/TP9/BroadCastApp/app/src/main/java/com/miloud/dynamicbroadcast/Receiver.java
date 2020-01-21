package com.miloud.dynamicbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Receiver", "INTENT RECEIVER");

        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);

        Toast.makeText(context, "INTENT RECEIVED by Receiver", Toast.LENGTH_SHORT).show();

    }
}
