package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Page18Activity extends AppCompatActivity {

    private TextView Page18_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page18_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");


        // view matching
        Page18_title = (TextView) findViewById(R.id.page18_title);
        Page18_title.setText(title);
    }
}
