package com.auspicious.auspicious;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] data;
    private ListView listView;


    private ArrayList<ListEntry> data_normal;
    private ArrayList<ListEntry> data_search;

    private EditText main_listview_edittext;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_listview_layout);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "CSChatThai.ttf");



        // view matching
        Button btn_1 = (Button) findViewById(R.id.btn_1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, menu_Activity.class);
                startActivity(myIntent);
            }
        });



        //get data
        data = getResources().getStringArray(R.array.data);

        //loop data
        data_normal = new ArrayList<ListEntry>();
        for(int i = 0 ; i < data.length; i++){
            ListEntry listEntry = new ListEntry();
            listEntry.setTitle(data[i]);
            data_normal.add(listEntry);
        }


        // view matching..
        main_listview_edittext = (EditText) findViewById(R.id.main_listview_edittext);
        listView = (ListView) findViewById(R.id.main_listview);
        doListNormal();


        //event Edittext
        main_listview_edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            };

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (main_listview_edittext.length() != 0) {
                    data_search = new ArrayList<ListEntry>();
                    for(int i = 0 ; i < data_normal.size(); i++){

                            if (data_normal.get(i).getTitle().toLowerCase().contains(s)){
                            ListEntry listEntry = new ListEntry();
                            listEntry.setTitle(data_normal.get(i).getTitle());
                            data_search.add(listEntry);

                       }

                    }
                    doListSearch();
                }else{
                    doListNormal();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        main_listview_edittext.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                listView.setVisibility(View.VISIBLE);
                return false;
            }
        });
    }

    private void doListSearch() {
        listView.setAdapter(new CustomAdapter(data_search));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,data_search.get(position).getTitle(),Toast.LENGTH_SHORT).show();
                //new inter
                Intent intent = new Intent(MainActivity.this,page2Activity.class);
                intent.putExtra("title",data_search.get(position).getTitle());
                startActivity(intent);
            }
        });{

        };
    }

    private void doListNormal() {
        listView.setAdapter(new CustomAdapter(data_normal));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,data_normal.get(position).getTitle(),Toast.LENGTH_SHORT).show();
                //new inter
                Intent intent = new Intent(MainActivity.this,page2Activity.class);
                intent.putExtra("title",data_normal.get(position).getTitle());
                startActivity(intent);
            }
        });
    }

    public class CustomAdapter extends BaseAdapter{

        private ArrayList<ListEntry> mData;
        private Holder holder = new Holder();

        public CustomAdapter(ArrayList<ListEntry> data){
            this.mData = data;
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = View.inflate(MainActivity.this,(R.layout.listvew_item_layout),null);

            if (convertView !=null){

                //view matchin child...
                holder.title = (TextView) convertView.findViewById(R.id.listview_item_title);

                //set text
                holder.title.setText(mData.get(position).getTitle());

                convertView.setTag(holder);
            }else {
                convertView = (View) convertView.getTag();
            }

            return convertView;
        }

            public class Holder{
            public TextView title;
        }

    }
}
