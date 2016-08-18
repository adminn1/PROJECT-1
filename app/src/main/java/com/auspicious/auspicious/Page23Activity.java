package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Page23Activity extends AppCompatActivity {

    private TextView Page23_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page23_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");


        // view matching
        Page23_title = (TextView) findViewById(R.id.page23_title);
        Page23_title.setText(title);
    }
}
