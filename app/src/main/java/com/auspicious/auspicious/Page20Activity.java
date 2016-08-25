package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page20Activity extends AppCompatActivity {

    private TextView Page20_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page20_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm20 = (ImageView) findViewById(R.id.xm20);
        xm20.setImageResource(R.drawable.tx20);


        // view matching
        Page20_title = (TextView) findViewById(R.id.page20_title);
        Page20_title.setText(title);
    }
}
