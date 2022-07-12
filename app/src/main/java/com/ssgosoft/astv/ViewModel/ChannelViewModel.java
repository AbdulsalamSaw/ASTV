package com.ssgosoft.astv.ViewModel;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;
import com.ssgosoft.astv.Model.ChannelModel;
import com.ssgosoft.astv.R;
import java.util.ArrayList;

public class ChannelViewModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);
        adapterList();
        }

        private  void adapterList()
        {
            ListView listView = findViewById(R.id.list_channel);
            ArrayList<ChannelModel> item = new ArrayList<ChannelModel>();
            item.add(new ChannelModel("Roya TV","https://weyyak-live.akamaized.net/weyyak_roya/index.m3u8"));
            item.add(new ChannelModel("الفاتحة" ,"https://server7.mp3quran.net/basit/Almusshaf-Al-Mojawwad/001.mp3"));
            AdapterViewModel channelAdpaterViewModel = new AdapterViewModel(getApplicationContext(),item);
            listView.setAdapter(channelAdpaterViewModel);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                   String url=item.get(position).getPathChannel();
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

