package com.example.sb_121.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by excel on 2/21/2018.
 */

public class DisplayAdapter extends BaseAdapter {

    private Context mContext;
    LayoutInflater layoutInflater;
    GridView grid;

    public DisplayAdapter(Context c) {
        mContext = c;
        layoutInflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return MainActivity.imgList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        view = layoutInflater.inflate(R.layout.list_display,null);


        ImageView imageView = (ImageView) view.findViewById(R.id.img);

         imageView.setImageResource(MainActivity.imgList.get(i));


        return view;
    }
}
