package com.miloud.uiapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //define the Seek Bar Variable
        SeekBar seekBar = findViewById(R.id.seek);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int progres = i ;
                findViewById(R.id.zone1).setBackgroundColor(Color.argb(progres,233,0,0));
                findViewById(R.id.zone2).setBackgroundColor(Color.argb(progres,125,45,236));
                findViewById(R.id.zone3).setBackgroundColor(Color.argb(progres,0,168,98));
                findViewById(R.id.zone4).setBackgroundColor(Color.argb(progres,0,0,123));
                findViewById(R.id.zone5).setBackgroundColor(Color.argb(progres,65,0,0));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menuItemMoreInfor) {
            new AlertDialog.Builder(this, R.style.AlertDialogCustom)
                    .setTitle("Notation !!!")
                    .setMessage("Click below for more informations!")
                    .setPositiveButton("Not Now", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Nothing to do, just close
                        }
                    })
                    .setNegativeButton("Visit MOMA", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")));
                        }
                    }).show();
        }

        return super.onOptionsItemSelected(item);
    }
}





