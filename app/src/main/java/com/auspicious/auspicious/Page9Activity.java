package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page9Activity extends AppCompatActivity {

    private TextView Page9_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page9_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm9 = (ImageView) findViewById(R.id.xm9);
        xm9.setImageResource(R.drawable.tx9);


        // view matching
        Page9_title = (TextView) findViewById(R.id.page9_title);
        Page9_title.setText(title);
    }
}
