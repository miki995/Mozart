package com.inc.miki.mozart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String BASE64_PUBLIC_KEY ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl4hmePt5o48UjcdWJM05Q+laiWuliUbLx35SmQUaDlJETGiZZkQN9Cd0Qvyz3fpmTG7RwfqHvTosPbDrq7GKZ4N8Tl7BAiQlccTgYw2VaRc2Diy5crUKRa1JypEAKYhbY9gzFacUMupBLyONaj3oAUFrdIWNT5YmfE2mIcltN+1UM4PM0w1sadrBlgpunTToe3gHg6v75W9YTOk4G5qdjzs0WW6RWCnxSh6qjLHQ3z4YVYnF3BFEQ8px1gK+maml4uKkj+1UW6xykYwBtz6K7AzhNDD+i8kzUur2LRnu21Wy47Wq+lGjut6ultT4JUsCP3GklAHXKQE+jJ1wIDAQAB";

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
    public void switchToMenu(View view)
    {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
        overridePendingTransition(R.anim.animation_about, R.anim.animation_about);
    }
    public void switchToContact(View view)
    {
        Intent intent = new Intent(this, contact.class);
        startActivity(intent);
        overridePendingTransition(R.anim.animation_about, R.anim.animation_about);
    }
    public void switchToAbout(View view)
    {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
        overridePendingTransition(R.anim.animation_about, R.anim.animation_about);
    }

}
