package com.aplikacja.covidprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class WorkTube extends YouTubeBaseActivity {

    private YouTubePlayerView workTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    String link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_tube);
        Button playButton = (Button)findViewById(R.id.startBtn);
        Button pauseButton = (Button)findViewById(R.id.pauseBtn);
        workTubePlayerView = findViewById(R.id.workTubeView);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            link = bundle.getString("link");
        }
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer workTubePlayer, boolean b) {
               workTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION | YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

                workTubePlayer.loadVideo(link);

                playButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!workTubePlayer.isPlaying()){
                            workTubePlayer.play();
                        }
                    }
                });
                pauseButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(workTubePlayer.isPlaying()){
                            workTubePlayer.pause();
                        }
                    }
                });
                workTubePlayer.setPlayerStateChangeListener(new YouTubePlayer.PlayerStateChangeListener() {
                    @Override
                    public void onLoading() {
                        Toast.makeText(WorkTube.this,"Wideo w trakcie ladowania", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onLoaded(String s) {
                    }
                    @Override
                    public void onAdStarted() {
                    }
                    @Override
                    public void onVideoStarted() {
                        Toast.makeText(WorkTube.this,"Zaczynamy Cwiczenie", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onVideoEnded() {
                        Toast.makeText(WorkTube.this,"To byl dobry trening, odpoczni i widzimy sie jutro", Toast.LENGTH_LONG).show();
                    }
                    @Override
                    public void onError(YouTubePlayer.ErrorReason errorReason) {
                        Toast.makeText(WorkTube.this, "Blad w zaladowaniu filmu", Toast.LENGTH_SHORT).show();
                    }
                });
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(WorkTube.this,"Error occurred", Toast.LENGTH_SHORT).show();
            }
        };
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workTubePlayerView.initialize("AIzaSyB-RXJ0p-sIP0lskFVWtMX-nmE5eW_f--s",onInitializedListener);
            }
        });
    }
}