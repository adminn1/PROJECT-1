package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Page24Activity extends AppCompatActivity {

    private TextView Page24_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page24_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");


        // view matching
        Page24_title = (TextView) findViewById(R.id.page24_title);
        Page24_title.setText(title);
    }
}
