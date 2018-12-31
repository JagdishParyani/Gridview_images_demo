package com.example.sb_121.demo;

import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by excel on 2/19/2018.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    LayoutInflater layoutInflater;


    SparseBooleanArray mSparseBooleanArray;

    // Keep all Images in array
    public static Integer[] mThumbIds = {
            R.drawable.fb, R.drawable.insta,
            R.drawable.logo21, R.drawable.whatsapp,
            R.drawable.youtube, R.drawable.fb, R.drawable.insta,
            R.drawable.logo21, R.drawable.whatsapp,
            R.drawable.youtube,R.drawable.fb, R.drawable.insta,
            R.drawable.logo21, R.drawable.whatsapp,
            R.drawable.youtube,R.drawable.fb, R.drawable.insta,
            R.drawable.logo21, R.drawable.whatsapp,
            R.drawable.youtube,R.drawable.fb, R.drawable.insta,
            R.drawable.logo21, R.drawable.whatsapp,
            R.drawable.youtube,R.drawable.fb, R.drawable.insta,
            R.drawable.logo21, R.drawable.whatsapp,
            R.drawable.youtube
    };

    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
        layoutInflater = LayoutInflater.from(c);
        mSparseBooleanArray = new SparseBooleanArray();

    }

    @Override
    public int getCount() {
        return mThumbIds.length;
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
    public View getView(final int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.list_item,null);
        ImageView img = convertView.findViewById(R.id.imageview);
        img.setImageResource(mThumbIds[position]);

        /*CheckBox checkBox = convertView.findViewById(R.id.checkbox);*/

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mContext, FullScreen.class);
                // passing array index
                i.putExtra("id", position);
                mContext.startActivity(i);
            }
        });



        CheckBox checkBox = convertView.findViewById(R.id.checkbox);
        checkBox.setTag(position);
        checkBox.setChecked(mSparseBooleanArray.get(position));
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mSparseBooleanArray.put((Integer) compoundButton.getTag(), b);
            }
        });


        return convertView;
    }
    public List<Integer> getCheckedItems() {
        ArrayList<Integer> mTempArry = new ArrayList<>();

        for(int i=0;i<mThumbIds.length;i++) {
            if(mSparseBooleanArray.get(i)) {
                mTempArry.add(mThumbIds[i]);
            }
        }

        return mTempArry;
    }
}
