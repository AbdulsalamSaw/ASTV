package com.ssgosoft.astv.ViewModel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.ssgosoft.astv.Model.ChannelModel;
import com.ssgosoft.astv.Model.MovieModel;
import com.ssgosoft.astv.R;

import java.util.ArrayList;

public class MovieViewModel  extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        adapterList();
    }
    private  void adapterList()
    {
        ListView listView = findViewById(R.id.list_movie);
        ArrayList<MovieModel> item = new ArrayList<MovieModel>();
        item.add(new MovieModel("Roya TV","https://weyyak-live.akamaized.net/weyyak_roya/index.m3u8"));
        item.add(new MovieModel("Jordan","https://jrtv-live.ercdn.net/jordanhd/jordanhd.m3u8"));
        item.add(new MovieModel("الفاتحة" ,"https://server7.mp3quran.net/basit/Almusshaf-Al-Mojawwad/001.mp3"));
        MovieAdapterViewModel  movieAdapterViewModel  = new MovieAdapterViewModel(getApplicationContext(),item);
        listView.setAdapter(movieAdapterViewModel);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                String url=item.get(position).getPathMovie();
                onClickChannel(url);
            }
        });

    }

    private void onClickChannel(String url)
    {
        Intent intent = new Intent(this, MediaPlayerViewModel.class);
        Bundle bundle = new Bundle();
        bundle.putString("url",url);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
