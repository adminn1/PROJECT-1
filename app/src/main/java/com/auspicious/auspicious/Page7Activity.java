package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page7Activity extends AppCompatActivity {

    private TextView Page7_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page7_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm7 = (ImageView) findViewById(R.id.xm7);
        xm7.setImageResource(R.drawable.tx7);


        // view matching
        Page7_title = (TextView) findViewById(R.id.page7_title);
        Page7_title.setText(title);
    }
}
