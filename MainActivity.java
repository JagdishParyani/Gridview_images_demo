package com.example.sb_121.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button submit;
    public  static List<Integer> imgList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridView gridView = (GridView) findViewById(R.id.gridview);
        submit = (Button) findViewById(R.id.submit);
        final ImageAdapter imageAdapter = new ImageAdapter(this);
        gridView.setAdapter(imageAdapter);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imgList = new ArrayList<>();
             imgList= imageAdapter.getCheckedItems();
              /*for (Integer i : imgList)
              {
                  Log.e(">>>","Path>"+i );
              }*/

              Intent intent = new Intent(MainActivity.this,Display.class);
              startActivity(intent);
/*
                Intent intent = new Intent();
                intent.setType("image*//*");
                intent.setAction(Intent.ACTION_GET_CONTENT);*/
                //startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);

                /*final int len = thumbnailsselection.length;
                int cnt = 0;
                String selectImages = "";
                ArrayList<Integer> pics=new ArrayList(thumbnailsselection.length);
                for (int i =0; i<len; i++)
                {
                    if (thumbnailsselection[i]){
                        pics.add(i);
                        cnt++;
                        selectImages = selectImages + arrPath[i] + "|";

                    }
                }
                if (cnt == 0){
                    Toast.makeText(getApplicationContext(),
                            "Please select at least one image",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "You've selected Total " + cnt + " image(s).",
                            Toast.LENGTH_LONG).show();
                    Log.d("SelectedImages", selectImages);
                    Intent myIntent = new Intent(MainActivity.this,Display.class);
                    myIntent.putIntegerArrayListExtra("arr", pics);//pics is your array with id-s of bitmaps
                    startActivity(myIntent);
                }*/
            }
        });

        // Instance of ImageAdapter Class

        /**
         * On Click event for Single Gridview Item
         * */
       /* gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullScreen.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });*/

    }
}
