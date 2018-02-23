package com.inc.miki.mozart.menu;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.inc.miki.mozart.R;
import com.inc.miki.mozart.data.ImageAdapter;

public class LeftMenuActivity extends AppCompatActivity {
    private int[] Images = new int[]{
            R.drawable.web
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