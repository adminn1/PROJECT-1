package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page8Activity extends AppCompatActivity {

    private TextView Page8_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page8_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm8 = (ImageView) findViewById(R.id.xm8);
        xm8.setImageResource(R.drawable.tx8);




        // view matching
        Page8_title = (TextView) findViewById(R.id.page8_title);
        Page8_title.setText(title);
    }
}
