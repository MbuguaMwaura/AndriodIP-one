package com.example.lifa_one;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class EventsActivity extends AppCompatActivity {
    private String[] events = new String[] {"Kareoke Night", "Party till dawn","Beach Life", "Mara Tour", "Wizkid", "Bongo Flavour",
                                            "6 AM" ,"Friday Night Racing", "Happy Hour", "GOT Trivia"};
    private String[] locations = new String[]{ "Kenya Cinema","TreeHouse Westlands","Diani MSA","Mara","Nakuru","Oleng Sidai", "Ngong Race " +
                                             " Course","Lang'ata" ,"ArtCaffe","The Tav"};
    private ListView mEventList;
    private TextView mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        mTitle = (TextView) findViewById(R.id.titleEvents);
        mEventList = (ListView) findViewById(R.id.eventlist);


        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Amadeus.ttf");
        mTitle.setTypeface(font);

        MyArrayAdapter arrayAdapter = new MyArrayAdapter(this, events,locations,android.R.layout.simple_list_item_1);
        mEventList.setAdapter(arrayAdapter);

        mEventList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String event = ((TextView)view).getText().toString();
                Toast.makeText(EventsActivity.this, event, Toast.LENGTH_LONG).show();

            }
        });

    }
}
