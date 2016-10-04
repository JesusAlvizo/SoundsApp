package com.jesusalvizo.soundsapp1;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button playairhorn;
    private Button playslap;
    private Button playbadumtss;
    private Button playshot;
    private Button playbell;
    private Button playdoorbell;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeApp();
    }

    private void initializeApp() {


        //final MediaPlayer airhorn = MediaPlayer.create(this, R.raw.airhorn);
        //final MediaPlayer slap = MediaPlayer.create(this, R.raw.slap);

        playairhorn = (Button) findViewById(R.id.btnairhorn);
        playairhorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                airhornplay();
            }
        });

        playslap = (Button) findViewById(R.id.btnslap);
        playslap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slapplay();
            }
        });

        playbadumtss = (Button) findViewById(R.id.btnbadumtss);
        playbadumtss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badumtssplay();
            }
        });

        playshot = (Button) findViewById(R.id.btnshot);
        playshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shotplay();
            }
        });

        playbell = (Button) findViewById(R.id.btnbell);
        playbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bellplay();
            }
        });

        playdoorbell = (Button) findViewById(R.id.btndoorbell);
        playdoorbell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doorbellplay();
            }
        });
    }

    public void airhornplay() {
        final MediaPlayer airhorn = MediaPlayer.create(this, R.raw.airhorn);
        playairhorn = (Button) findViewById(R.id.btnairhorn);
        airhorn.start();
        //while (airhorn.isPlaying()){
        //    playairhorn.setEnabled(false);
        //    playslap.setEnabled(false);
        //    playbadumtss.setEnabled(false);
        //     playshot.setEnabled(false);
        //}

        //playairhorn.setEnabled(true);
        //playslap.setEnabled(true);
        //playbadumtss.setEnabled(true);
        //playshot.setEnabled(true);
        //if (airhorn.isPlaying()) {
        //    playairhorn.setEnabled();
        //}else{
        //    playairhorn.setEnabled(true);
        //}

    }

    public void slapplay() {
        final MediaPlayer slap = MediaPlayer.create(this, R.raw.slap);
        slap.start();

    }

    public void badumtssplay() {
        final MediaPlayer badumtss = MediaPlayer.create(this, R.raw.badumtss);
        badumtss.start();

    }

    public void shotplay() {
        final MediaPlayer shot = MediaPlayer.create(this, R.raw.shot);
        shot.start();

    }

    public void bellplay() {
        final MediaPlayer bell = MediaPlayer.create(this, R.raw.bell);
        bell.start();

    }

    public void doorbellplay() {
        final MediaPlayer doorbell = MediaPlayer.create(this, R.raw.doorbell);
        doorbell.start();

    }

    //public void bloquear(){
        //playairhorn = (Button) findViewById(R.id.btnairhorn);
        //playairhorn.setEnabled(false);
        //playslap = (Button) findViewById(R.id.btnslap);
        //playslap.setEnabled(false);
        //playbadumtss = (Button) findViewById(R.id.btnbadumtss);
        //playbadumtss.setEnabled(false);
        //playshot = (Button) findViewById(R.id.btnshot);
        //playshot.setEnabled(false);
    //}

}

