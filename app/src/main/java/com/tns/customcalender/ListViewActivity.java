package com.tns.customcalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView lv_android;
    private AndroidListAdapter list_adapter;
    private Button btn_calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        CalendarCollection.date_collection_arr=new ArrayList<CalendarCollection>();
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-07-01","John Birthday","p"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-05-04","Client Meeting at 5 p.m.","p"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-06-06","A Small Party at my office","a"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-06-02","Marriage Anniversary","p"));
        CalendarCollection.date_collection_arr.add(new CalendarCollection("2017-06-11","Live Event and Concert of sonu","a"));



        getWidget();
    }



    public void getWidget(){
        btn_calender = (Button) findViewById(R.id.btn_calender);
        btn_calender.setOnClickListener(this);

        lv_android = (ListView) findViewById(R.id.lv_android);
        list_adapter=new AndroidListAdapter(ListViewActivity.this,R.layout.list_item, CalendarCollection.date_collection_arr);
        lv_android.setAdapter(list_adapter);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.btn_calender:
                startActivity(new Intent(ListViewActivity.this,CalenderActivity.class));

                break;

            default:
                break;
        }

    }

}

