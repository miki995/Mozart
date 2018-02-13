package com.inc.miki.mozart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:058212888"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        overridePendingTransition(R.anim.animation_about, R.anim.animation_about);
    }

    public void switchToMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.animation_about, R.anim.animation_about);
    }

    public void switchToContact(View view) {
        Intent intent = new Intent(this, contact.class);
        startActivity(intent);
        overridePendingTransition(R.anim.animation_about, R.anim.animation_about);
    }

    public void switchToAbout(View view) {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
        overridePendingTransition(R.anim.animation_about, R.anim.animation_about);
    }

}
