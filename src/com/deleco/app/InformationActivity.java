package com.deleco.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import androidx.annotation.Nullable;


public class InformationActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        @SuppressLint("WrongViewCast") ImageButton AboutUs= findViewById(R.id.information_about_us);
        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutUsActivity.class);
                //intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
                finish();
            }
        });

        ImageButton GoBack= findViewById(R.id.information_go_back_button);
        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
