package com.miloud.customviewnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity {

    // Notification ID to allow for future updates
    private static final int MY_NOTIFICATION_ID = 1;

    // Notification Count
    private int mNotificationCount;

    // Notification Text Elements
    private final CharSequence tickerText = "This is a Custom Notification Message!";
    private final CharSequence contentTitle = "Notification";
    private final CharSequence contentText = "You've Been Notified!";

    // Notification Action Elements
    private Intent mNotificationIntent;
    private PendingIntent mContentIntent;

    // Notification Sound and Vibration on Arrival
    private Uri soundURI = Uri
            .parse("android.resource://com.miloud.customviewnotification/"
                    + R.raw.alarm_rooster);
    private long[] mVibratePattern = { 0, 200, 200, 300 };

    RemoteViews mContentView = new RemoteViews(
            "com.miloud.customviewnotification",
            R.layout.custom_notification);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mNotificationIntent = new Intent(getApplicationContext(),
                SubActivity.class);
        mContentIntent = PendingIntent.getActivity(getApplicationContext(), 0,
                mNotificationIntent, PendingIntent.FLAG_ONE_SHOT);

        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Define the Notification's expanded message and Intent:

                mContentView.setTextViewText(R.id.text, contentText + " ("
                        + ++mNotificationCount + ")");

                // Build the Notification

                Notification.Builder notificationBuilder = new Notification.Builder(
                        getApplicationContext())
                        .setTicker(tickerText)
                        .setSmallIcon(R.drawable.fire_eye_alien)
                        .setAutoCancel(true)
                        .setContentIntent(mContentIntent)
                        .setSound(soundURI)
                        .setVibrate(mVibratePattern)
                        .setContent(mContentView);

                // Pass the Notification to the NotificationManager:
                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                mNotificationManager.notify(MY_NOTIFICATION_ID,
                        notificationBuilder.build());

            }
        });

    }
}
