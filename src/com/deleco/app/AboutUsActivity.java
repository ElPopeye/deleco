package com.deleco.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.deleco.app.model.Researcher;


public class AboutUsActivity extends Activity {

    Researcher investigador;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        CardView card_jp= findViewById(R.id.about_us_container_jp_photo);
        CardView card_jf= findViewById(R.id.about_us_container_jf_photo);
        CardView card_js= findViewById(R.id.about_us_container_js_photo);
        CardView card_lt= findViewById(R.id.about_us_container_lt_photo);

        card_jp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                investigador=new Researcher("Juan Pablo Rueda","Ing.","","","",R.drawable.photo_jp);
                Intent intent = new Intent(getApplicationContext(), PersonalDescriptionActivity.class);
                intent.putExtra("RESEARCHER", investigador);
                startActivity(intent);

            }
        });
        card_jf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                investigador=new Researcher("Juan Felipe Heredia","Ing.","","","",R.drawable.photo_jf);
                Intent intent = new Intent(getApplicationContext(), PersonalDescriptionActivity.class);
                intent.putExtra("RESEARCHER", investigador);
                startActivity(intent);
            }
        });
        card_js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                investigador=new Researcher("Juan Sebastian Ramirez","Ing.","","","",R.drawable.photo_jsra);
                Intent intent = new Intent(getApplicationContext(), PersonalDescriptionActivity.class);
                intent.putExtra("RESEARCHER", investigador);
                startActivity(intent);
            }
        });
        card_lt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                investigador=new Researcher("Leonardo Talero","PhD.","","","",R.drawable.photo_lt);
                Intent intent = new Intent(getApplicationContext(), PersonalDescriptionActivity.class);
                intent.putExtra("RESEARCHER", investigador);
                startActivity(intent);
            }
        });

        ImageButton GoBack= findViewById(R.id.about_us_go_back_button);
        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
