package com.eomsbd.rabbanadua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.eomsbd.rabbanadua.rabbana_activity.Rabban1;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban11;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban12;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban13;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban14;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban15;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban16;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban17;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban18;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban19;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban20;

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
                }else if (position==10){
                    Intent intent=new Intent(ShowActivity.this, Rabban11.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==11){
                    Intent intent=new Intent(ShowActivity.this, Rabban12.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==12){
                    Intent intent=new Intent(ShowActivity.this, Rabban13.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==13){
                    Intent intent=new Intent(ShowActivity.this, Rabban14.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==14){
                    Intent intent=new Intent(ShowActivity.this, Rabban15.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==15){
                    Intent intent=new Intent(ShowActivity.this, Rabban16.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==16){
                    Intent intent=new Intent(ShowActivity.this, Rabban17.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==17){
                    Intent intent=new Intent(ShowActivity.this, Rabban18.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==18){
                    Intent intent=new Intent(ShowActivity.this, Rabban19.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }else if (position==19){
                    Intent intent=new Intent(ShowActivity.this, Rabban20.class);
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
