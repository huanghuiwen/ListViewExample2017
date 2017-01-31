package com.example.hhuang66.listviewexample2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //decide an array to provide data through the array adapter to our ListView
        String[] data = new String [] {"Beard", "iPhone", "giraffe"};
        /*
        create an arrayAdapter for an array of Strings
        the constructor for ArrayAdapter requires a "sample list item" layout
        make sure you have one created in res/layout
        (context, sample_layout_id, array)
         */
        ArrayAdapter<String> sAdapter = new ArrayAdapter<String>(this, R.layout.list_item, data);

        //get a reference to the ListView
        ListView listView = (ListView) findViewById(R.id.listView);
        //set the adapter for the listView to use our ArrayAdapter "sAdapter"
        listView.setAdapter(sAdapter);
    }
}
