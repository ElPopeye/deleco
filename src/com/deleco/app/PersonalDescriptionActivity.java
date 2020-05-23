package com.deleco.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.deleco.app.model.Researcher;

public class PersonalDescriptionActivity extends Activity {
    Researcher c_researcher;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_description);
        c_researcher= (Researcher) getIntent().getSerializableExtra("RESEARCHER");

        TextView Grade= findViewById(R.id.personal_description_grade);
        TextView Name=findViewById(R.id.personal_description_name);
        ImageButton GoBack= findViewById(R.id.personal_go_back_button);
        ImageView Avatar =findViewById(R.id.personal_description_image);

        Avatar.setImageResource(c_researcher.getDrawableId());
        Grade.setText(c_researcher.getGrade());
        Name.setText(c_researcher.getName());
        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
