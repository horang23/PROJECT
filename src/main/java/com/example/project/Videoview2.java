package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videoview2 extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;
    private String videoURL = "https://vod-progressive.akamaized.net/exp=1626024935~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F1403%2F22%2F557015855%2F2634412810.mp4~hmac=5e6618cb1d2f603ddf26eea6eb7d56cc3fdf20400edb11590ed568214f29a033/vimeo-prod-skyfire-std-us/01/1403/22/557015855/2634412810.mp4?filename=Mountains+-+75810.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoview2);

        videoView = findViewById(R.id.videoview);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse(videoURL);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}