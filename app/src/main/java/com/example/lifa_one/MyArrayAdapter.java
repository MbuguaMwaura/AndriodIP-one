package com.example.lifa_one;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mEvents;
    private String[] mLocations;

    public MyArrayAdapter(Context context, String[] mEvents, String[] mLocations, int resource){
        super(context, resource);
        this.mContext = context;
        this.mEvents = mEvents;
        this.mLocations = mLocations;
    }

    @Override
    public Object getItem(int position){
        String event = mEvents[position];
        String location = mLocations[position];
        return String.format("\n%s\n \nHappening at: %s \n", event, location);
    }

    @Override
    public int getCount(){
        return mEvents.length;
    }
}

