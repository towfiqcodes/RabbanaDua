package com.eomsbd.rabbanadua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity  {

    ListView listView;

    LinearLayout button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        button1 = findViewById(R.id.button1);
        listView = findViewById(R.id.list_item);
        String[] item = getResources().getStringArray(R.array.data);
        bacKButton();
        ArrayAdapter adapter = new ArrayAdapter(ShowActivity.this, android.R.layout.simple_list_item_1, item);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = (String) parent.getItemAtPosition(position);
                if (position == 0) {

                    Intent intent=new Intent(ShowActivity.this, Rabban1.class);
                    intent.putExtra("name",name);
                    startActivity(intent);

                }
            }
        });

    }


    public void bacKButton() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}
