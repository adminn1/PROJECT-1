package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page17Activity extends AppCompatActivity {

    private TextView Page17_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page17_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm17 = (ImageView) findViewById(R.id.xm17);
        xm17.setImageResource(R.drawable.tx17);


        // view matching
        Page17_title = (TextView) findViewById(R.id.page17_title);
        Page17_title.setText(title);
    }
}
