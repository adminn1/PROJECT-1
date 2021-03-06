package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page5Activity extends AppCompatActivity {

    private TextView Page5_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page5_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm5 = (ImageView) findViewById(R.id.xm5);
        xm5.setImageResource(R.drawable.tx5);


        // view matching
        Page5_title = (TextView) findViewById(R.id.page5_title);
        Page5_title.setText(title);
    }
}
