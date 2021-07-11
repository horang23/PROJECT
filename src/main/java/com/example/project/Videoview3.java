package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videoview3 extends AppCompatActivity {

    private VideoView videoView;
    private MediaController mediaController;
    private String videoURL = "https://vod-progressive.akamaized.net/exp=1626026397~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F1102%2F21%2F530514448%2F2499471445.mp4~hmac=05b6254d505abaa1fec9954615ca8f6f89e3d1455825bf5e91a2c7ff29994189/vimeo-prod-skyfire-std-us/01/1102/21/530514448/2499471445.mp4?filename=Puppies+-+69168.mp4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoview3);

        videoView = findViewById(R.id.videoview);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse(videoURL);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();
    }
}