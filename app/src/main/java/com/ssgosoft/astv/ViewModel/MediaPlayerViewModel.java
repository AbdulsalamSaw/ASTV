package com.ssgosoft.astv.ViewModel;
import static com.google.android.material.internal.ContextUtils.getActivity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.material.tabs.TabLayout;
import com.ssgosoft.astv.R;
import java.net.URL;

public class MediaPlayerViewModel  extends AppCompatActivity {
    private String urlStream=null;
    private VideoView myVideoView;
    private URL url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle bundle = getIntent().getExtras();
        String urlStreams =bundle.getString("url");
        if(bundle!= null){
            urlStream=urlStreams;
        }else{
            urlStream="No data";
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activite_player);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        myVideoView = (VideoView)this.findViewById(R.id.myVideoView);
        MediaController mc = new MediaController(this);
        myVideoView.setMediaController(mc);
        run();
    }

    public void run() {
        myVideoView.setVideoURI(Uri.parse(urlStream));
        myVideoView.start();
    }


}
