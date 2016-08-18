package com.auspicious.auspicious;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Admin on 13/7/2559.
 */
public class menu_Activity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        // view matching
        Button btn_1 = (Button) findViewById(R.id.btn_2);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page3Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_2 = (Button) findViewById(R.id.btn_3);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page4Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_3 = (Button) findViewById(R.id.btn_4);

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page5Activity.class);
                startActivity(myIntent);
            }
        });


        // view matching
        Button btn_4 = (Button) findViewById(R.id.btn_5);

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page6Activity.class);
                startActivity(myIntent);
            }
        });


        // view matching
        Button btn_5 = (Button) findViewById(R.id.btn_6);

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page7Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_6 = (Button) findViewById(R.id.btn_7);

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page8Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_7 = (Button) findViewById(R.id.btn_8);

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page9Activity.class);
                startActivity(myIntent);
            }
        });


        // view matching
        Button btn_8 = (Button) findViewById(R.id.btn_9);

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page10Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_9 = (Button) findViewById(R.id.btn_10);

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page11Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_10 = (Button) findViewById(R.id.btn_11);

        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page12Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_11 = (Button) findViewById(R.id.btn_12);

        btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page13Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_12 = (Button) findViewById(R.id.btn_13);

        btn_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page14Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_13 = (Button) findViewById(R.id.btn_14);

        btn_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page15Activity.class);
                startActivity(myIntent);
            }
        });

        // view matching
        Button btn_14 = (Button) findViewById(R.id.btn_15);

        btn_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(menu_Activity.this, Page16Activity.class);
                startActivity(myIntent);
            }
        });






    }
}
