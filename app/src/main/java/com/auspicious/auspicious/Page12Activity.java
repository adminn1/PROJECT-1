package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page12Activity extends AppCompatActivity {

    private TextView Page12_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page12_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm12 = (ImageView) findViewById(R.id.xm12);
        xm12.setImageResource(R.drawable.tx12);






        // view matching
        Page12_title = (TextView) findViewById(R.id.page12_title);
        Page12_title.setText(title);
    }
}
