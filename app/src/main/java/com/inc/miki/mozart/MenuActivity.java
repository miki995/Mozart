package com.inc.miki.mozart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;


import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    ArrayList<Integer> imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        LinearLayout layout = findViewById(R.id.imageLayout);

        imageList.add(R.drawable.p2);
        imageList.add(R.drawable.p3);
        imageList.add(R.drawable.p4);
        imageList.add(R.drawable.p5);
        imageList.add(R.drawable.p6);
        imageList.add(R.drawable.p7);
        imageList.add(R.drawable.p8);
        imageList.add(R.drawable.p9);
        imageList.add(R.drawable.p10);
        imageList.add(R.drawable.p12);
        imageList.add(R.drawable.p13);
        imageList.add(R.drawable.p14);
        imageList.add(R.drawable.p15);
        imageList.add(R.drawable.p16);
        imageList.add(R.drawable.p17);
        imageList.add(R.drawable.p18);
        imageList.add(R.drawable.p19);
        imageList.add(R.drawable.p20);
        imageList.add(R.drawable.p21);
        imageList.add(R.drawable.p22);
        imageList.add(R.drawable.p23);
        imageList.add(R.drawable.p24);
        imageList.add(R.drawable.p25);
        imageList.add(R.drawable.p26);
        imageList.add(R.drawable.p27);
        imageList.add(R.drawable.p28);
        imageList.add(R.drawable.p29);
        imageList.add(R.drawable.p30);
        imageList.add(R.drawable.p31);
        imageList.add(R.drawable.p32);
        imageList.add(R.drawable.p33);
        imageList.add(R.drawable.p34);
        imageList.add(R.drawable.p35);
        imageList.add(R.drawable.p36);

        for (int id : imageList) {
            ImageView image = new ImageView(this);
            image.setLayoutParams(new android.view.ViewGroup.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            image.setScaleType(ImageView.ScaleType.FIT_XY);
            image.setImageResource(id);
            layout.addView(image);
        }
    }


}


