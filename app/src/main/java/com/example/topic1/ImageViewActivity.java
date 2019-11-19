package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ImageViewActivity extends AppCompatActivity {

    RadioButton rdoFirst,rdoSecond,rdoThird;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        rdoFirst=findViewById(R.id.rdoFirst);
        rdoSecond=findViewById(R.id.rdoSecond);
        rdoThird=findViewById(R.id.rdoThird);
        imgView=findViewById(R.id.imgView);

        rdoFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgView.setImageResource(R.drawable.first);

            }
        });
    }
}
