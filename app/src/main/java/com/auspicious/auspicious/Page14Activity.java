package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page14Activity extends AppCompatActivity {

    private TextView Page14_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page14_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm14 = (ImageView) findViewById(R.id.xm14);
        xm14.setImageResource(R.drawable.tx14);


        // view matching
        Page14_title = (TextView) findViewById(R.id.page14_title);
        Page14_title.setText(title);
    }
}
