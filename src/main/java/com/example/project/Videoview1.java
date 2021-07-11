package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videoview1 extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;
    private String videoURL = "https://vod-progressive.akamaized.net/exp=1626023198~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F1341%2F22%2F556705309%2F2633087939.mp4~hmac=5154c1dd6b79b3f51174e89a293934bd335684af3b88446c9db07f058eb7fc94/vimeo-prod-skyfire-std-us/01/1341/22/556705309/2633087939.mp4?filename=Ocean+-+75701.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoview1);

        videoView = findViewById(R.id.videoview);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse(videoURL);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}