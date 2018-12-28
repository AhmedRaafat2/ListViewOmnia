package com.google.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.months_list_view);

        String[] months = new String[]{"Jan","Feb","March","April","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,months);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.months_layout,R.id.months_Text_View,months);
        listView.setAdapter(adapter);
    }
}
