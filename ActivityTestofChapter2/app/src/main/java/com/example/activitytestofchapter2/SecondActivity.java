package com.example.activitytestofchapter2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Button buttonSearchBaidu = findViewById(R.id.button_baidu);
        buttonSearchBaidu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBaidu = new Intent(Intent.ACTION_VIEW);
                intentBaidu.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intentBaidu);
            }
        });
        findViewById(R.id.button_dial).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDial = new Intent(Intent.ACTION_DIAL);
                intentDial.setData(Uri.parse("tel:12345"));
                startActivity(intentDial);
            }
        });
    }
}
