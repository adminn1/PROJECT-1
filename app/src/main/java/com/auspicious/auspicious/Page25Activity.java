package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page25Activity extends AppCompatActivity {

    private TextView Page25_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page25_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm25 = (ImageView) findViewById(R.id.xm25);
        xm25.setImageResource(R.drawable.tx25);


        // view matching
        Page25_title = (TextView) findViewById(R.id.page25_title);
        Page25_title.setText(title);
    }
}
