package com.inc.miki.mozart.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.inc.miki.mozart.R;


public class LeftMenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left_menu);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }
}