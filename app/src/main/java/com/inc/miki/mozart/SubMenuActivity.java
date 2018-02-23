package com.inc.miki.mozart;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.inc.miki.mozart.menu.DrinkMenuActivity;
import com.inc.miki.mozart.menu.LeftMenuActivity;
import com.inc.miki.mozart.menu.RightMenuActivity;

public class SubMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

    }

    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:058212888"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void switchToRightMenu(View view) {
        Intent intent = new Intent(this, RightMenuActivity.class);
        startActivity(intent);
    }

    public void switchToLeftMenu(View view) {
        Intent intent = new Intent(this, LeftMenuActivity.class);
        startActivity(intent);
    }

    public void switchToDrinkMenu(View view) {
        Intent intent = new Intent(this, DrinkMenuActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }
}
