package com.apkglobal.playmusic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button BTN1, BTN2, BTN3, BTN4, BTN5;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTN1 = findViewById(R.id.BTN1);
        BTN2 = findViewById(R.id.BTN2);
        BTN3 = findViewById(R.id.BTN3);
        BTN4 = findViewById(R.id.BTN4);
        BTN5 = findViewById(R.id.BTN5);

        /*to attach the music in media player object*/

        /*to click on button 1*/
        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*to connect the pages e.g service*/
                Intent play = new Intent(MainActivity.this, MyService.class);
                startService(play);
            }
        });

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*to play the music*/
                Intent play = new Intent(MainActivity.this, MyService.class);
                stopService(play);
            }
        });


    }
}
