package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page16Activity extends AppCompatActivity {

    private TextView Page16_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page16_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm16 = (ImageView) findViewById(R.id.xm16);
        xm16.setImageResource(R.drawable.tx16);


        // view matching
        Page16_title = (TextView) findViewById(R.id.page16_title);
        Page16_title.setText(title);
    }
}
