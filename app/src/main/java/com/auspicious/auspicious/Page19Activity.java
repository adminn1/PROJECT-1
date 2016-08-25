package com.auspicious.auspicious;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Page19Activity extends AppCompatActivity {

    private TextView Page19_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.page19_layout);

        Intent getIntent = getIntent();
        String title = getIntent.getStringExtra("title");

        ImageView xm19 = (ImageView) findViewById(R.id.xm19);
        xm19.setImageResource(R.drawable.tx19);


        // view matching
        Page19_title = (TextView) findViewById(R.id.page19_title);
        Page19_title.setText(title);
    }
}
