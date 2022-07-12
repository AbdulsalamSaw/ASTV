package com.ssgosoft.astv.ViewModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ssgosoft.astv.Model.ChannelModel;
import com.ssgosoft.astv.R;

import java.util.ArrayList;

public class AdapterViewModel extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ArrayList<ChannelModel> item = new ArrayList<ChannelModel>();

    public AdapterViewModel(Context context,ArrayList<ChannelModel>item)
    {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.item = item;

    }



    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position).getNameChannel();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_row,null);
        TextView textView = (TextView) convertView.findViewById(R.id.text1);
        textView.setText(item.get(position).getNameChannel());
        return convertView;


    }
}
