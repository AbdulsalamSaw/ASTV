package com.ssgosoft.astv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ssgosoft.astv.ViewModel.ChannelViewModel;
import com.ssgosoft.astv.ViewModel.MediaPlayerViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pageChannel(View view) {
        Intent intent = new Intent(this, ChannelViewModel.class);
        startActivity(intent);
    }


    public void pageMovies(View view){

     //Intent intent = new Intent(this, activity_moives.class);
     //startActivity(intent);
   }

    public void pageQuran(View view) {
        Intent intent = new Intent(this, MediaPlayerViewModel.class);
        startActivity(intent);
    }
}