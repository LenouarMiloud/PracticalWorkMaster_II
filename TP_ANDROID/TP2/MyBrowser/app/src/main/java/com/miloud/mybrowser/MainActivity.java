package com.miloud.mybrowser;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Save the String passed with the intent
        String url = getIntent().getDataString();

        if (null == url)
            url = "No Data Provided";

        // Get a reference to the TextView and set the text it to the String
        TextView textView = findViewById(R.id.url);
        textView.setText(url);
    }

}
