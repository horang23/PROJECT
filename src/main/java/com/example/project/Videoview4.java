package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videoview4 extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;
    private String videoURL = "https://vod-progressive.akamaized.net/exp=1626026725~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F3464%2F22%2F567321594%2F2682267586.mp4~hmac=983c73f637b1cb5a2524f6d198d872e0655a98132360e0a60818f1f929a0b4c3/vimeo-prod-skyfire-std-us/01/3464/22/567321594/2682267586.mp4?filename=Cat+-+78756.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoview4);

        videoView = findViewById(R.id.videoview);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse(videoURL);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}