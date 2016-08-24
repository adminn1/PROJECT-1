package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page10Activity extends AppCompatActivity {

    private TextView Page10_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page10_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");


        ImageView gg1 = (ImageView) findViewById(R.id.gg1);
        gg1.setImageResource(R.drawable.tx10);


        // view matching
        Page10_title = (TextView) findViewById(R.id.page10_title);
        Page10_title.setText(title);
    }
}
