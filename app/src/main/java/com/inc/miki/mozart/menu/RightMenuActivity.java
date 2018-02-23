package com.inc.miki.mozart.menu;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.inc.miki.mozart.R;
import com.inc.miki.mozart.data.ImageAdapter;

public class RightMenuActivity extends AppCompatActivity {


    private int[] Images = new int[]{
            R.drawable.p6,
            R.drawable.p7,
            R.drawable.p8,
            R.drawable.p9,
            R.drawable.p10,
            R.drawable.p11,
            R.drawable.p12,
            R.drawable.p13,
            R.drawable.p14,
            R.drawable.p15,
            R.drawable.p16,
            R.drawable.p17,
            R.drawable.p18,
            R.drawable.p19,
            R.drawable.p20,
            R.drawable.p21,
            R.drawable.p22,
            R.drawable.p23,
            R.drawable.p24,
            R.drawable.p25,
            R.drawable.p26,
            R.drawable.p27,
            R.drawable.p28,
            R.drawable.p29,
            R.drawable.p30,
            R.drawable.p31,
            R.drawable.p32,
            R.drawable.p33,
            R.drawable.p34,
            R.drawable.p35,
            R.drawable.p36
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_menu);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);


        ViewPager viewPager = findViewById(R.id.view_pager);
        ImageAdapter adapter = new ImageAdapter(this, Images);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }
}
