package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page4Activity extends AppCompatActivity {

    private TextView Page4_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm4 = (ImageView)findViewById(R.id.xm4);
        xm4.setImageResource(R.drawable.tx4);


        // view matching
        Page4_title = (TextView) findViewById(R.id.page4_title);
        Page4_title.setText(title);
    }
}
