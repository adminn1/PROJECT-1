package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page26Activity extends AppCompatActivity {

    private TextView Page26_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page26_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm26 = (ImageView) findViewById(R.id.xm26);
        xm26.setImageResource(R.drawable.tx26);


        // view matching
        Page26_title = (TextView) findViewById(R.id.page26_title);
        Page26_title.setText(title);
    }
}
