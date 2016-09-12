package com.example.alexfylling.mymessages;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;


import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Snackbar", Snackbar.LENGTH_LONG).show();

            }
        });

        List data = Arrays.asList(
                new Message("Mikael","Message #1"),
                new Message("Mikael","Message #2"),
                new Message("Mikael","Message #3"),
                new Message("Mikael","Message #4"),
                new Message("Mikael","Message #5"),
                new Message("Mikael","Message #6"),
                new Message("Mikael","Message #7"),
                new Message("Mikael","Message #8"),
                new Message("Mikael","Message #9")
        );
        MessageListAdapter mla = new MessageListAdapter(getApplicationContext(),data);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(mla);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbarmenu, menu);

        return super.onCreateOptionsMenu(menu);
    }
}
