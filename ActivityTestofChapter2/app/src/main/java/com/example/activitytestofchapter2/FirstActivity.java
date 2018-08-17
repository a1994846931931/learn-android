package com.example.activitytestofchapter2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    final static String TAG = FirstActivity.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        Button buttonSaveWorld = findViewById(R.id.button_save_world);
        Button buttonDestroyWorld = findViewById(R.id.button_destroy_world);
        Toast.makeText(this, "我来啦！", Toast.LENGTH_SHORT); // 没有用？
        buttonSaveWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "你行你上啊你行你上啊你行你上啊", Toast.LENGTH_SHORT).show();
            }
        });
        buttonDestroyWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "滚犊子！", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Intent activityTwoIntent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivityForResult(activityTwoIntent, 1);
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你一无所有", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            Log.d(TAG, "onActivityResult: resultCode is " + resultCode);
        }
        else {
            Log.d(TAG, "onActivityResult: unknown requestCode: " + requestCode);
        }
    }
}
