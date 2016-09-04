package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page21Activity extends AppCompatActivity {

    private TextView Page21_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page21_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm21 = (ImageView) findViewById(R.id.xm21);
        xm21.setImageResource(R.drawable.tx21);


        // view matching
        Page21_title = (TextView) findViewById(R.id.page21_title);
        Page21_title.setText(title);
    }
}
