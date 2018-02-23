package com.inc.miki.mozart.menu;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.inc.miki.mozart.R;
import com.inc.miki.mozart.data.ImageAdapter;

public class DrinkMenuActivity extends AppCompatActivity {

    private int[] Images = new int[]{
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_menu);
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