package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Page13Activity extends AppCompatActivity {

    private TextView Page13_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page13_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");


        // view matching
        Page13_title = (TextView) findViewById(R.id.page13_title);
        Page13_title.setText(title);
    }
}
