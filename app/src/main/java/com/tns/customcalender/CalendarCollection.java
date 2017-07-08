package com.tns.customcalender;

import java.util.ArrayList;

/**
 * Created by TNS on 07-Apr-17.
 */

public class CalendarCollection {
    public String date="";
    public String event_message="";
    public String status="";

    public static ArrayList<CalendarCollection> date_collection_arr;

    public CalendarCollection(String date,String event_message,String tatus){

        this.date=date;
        this.event_message=event_message;
        this.status = tatus;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}