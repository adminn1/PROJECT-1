package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page3Activity extends AppCompatActivity {

    private TextView Page3_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm3 = (ImageView)findViewById(R.id.xm3);
        xm3.setImageResource(R.drawable.tx3);




        // view matching
        Page3_title = (TextView) findViewById(R.id.page3_title);
        Page3_title.setText(title);
    }
}
