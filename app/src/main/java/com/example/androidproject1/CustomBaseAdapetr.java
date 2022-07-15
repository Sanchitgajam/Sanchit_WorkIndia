package com.example.androidproject1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapetr extends BaseAdapter {

    Context context;
    String ListItem[];
    LayoutInflater inflater;

    public CustomBaseAdapetr(Context ctx, String [] ItemList) {
        this.context = ctx;
        this.ListItem = ItemList;
        inflater = LayoutInflater.from(ctx);

    }

    @Override
    public int getCount() {
        return ListItem.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_android_project1,  null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textView);
        txtView.setText(ListItem[position]);
        return convertView;
    }
}
