package com.liangmayong.android_holdcache;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.liangmayong.holdcache.HoldCache;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button save = (Button) findViewById(R.id.save);
        Button get = (Button) findViewById(R.id.get);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HoldCache.getInstance(MainActivity.this).put("holdKey", "holdValue");
            }
        });
        get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, HoldCache.getInstance(MainActivity.this).getAsString("holdKey"), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
