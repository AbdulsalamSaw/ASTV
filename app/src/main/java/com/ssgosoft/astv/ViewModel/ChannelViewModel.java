package com.ssgosoft.astv.ViewModel;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.ssgosoft.astv.Model.ChannelModel;
import com.ssgosoft.astv.R;

import java.util.ArrayList;

public class ChannelViewModel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);
        ListView listView = findViewById(R.id.list_channel);
        ArrayList<ChannelModel> item = new ArrayList<ChannelModel>();
        item.add(new ChannelModel("الاعراف"));
        item.add(new ChannelModel(" الباسط"));

        AdapterViewModel channelAdpaterViewModel = new AdapterViewModel(getApplicationContext(),item);
        listView.setAdapter(channelAdpaterViewModel);

        }



    }

