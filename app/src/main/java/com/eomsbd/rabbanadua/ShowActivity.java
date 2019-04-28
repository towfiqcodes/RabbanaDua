package com.eomsbd.rabbanadua;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.eomsbd.rabbanadua.rabbana_activity.Rabban1;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban10;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban11;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban12;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban13;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban14;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban15;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban16;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban17;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban18;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban19;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban2;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban20;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban21;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban22;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban23;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban24;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban25;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban26;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban27;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban28;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban29;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban3;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban30;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban31;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban32;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban33;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban34;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban35;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban36;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban37;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban38;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban39;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban4;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban40;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban5;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban6;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban7;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban8;
import com.eomsbd.rabbanadua.rabbana_activity.Rabban9;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import pl.droidsonroids.gif.GifImageView;

public class ShowActivity extends AppCompatActivity {
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    ListView listView;
    LinearLayout button1;
    ConnectionClass connectionClass;
    private int totalCount;
    GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        button1 = findViewById(R.id.button1);
      //  connectionClass=new ConnectionClass();
        gifImageView=findViewById(R.id.imageView);
        prefs = getPreferences(Context.MODE_PRIVATE);
        editor = prefs.edit();
        gifImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalCount = prefs.getInt("counter", 0);
                totalCount++;
                editor.putInt("counter", totalCount);
                editor.commit();
                //  Toast.makeText(ShowActivity.this,""+String.valueOf(Integer.valueOf(totalCount)),Toast.LENGTH_SHORT).show();
                // Log.d("ShowActivity", );
                /*Connection con=connectionClass.CONN();
                try {
                    String query="insert into info values('"+totalCount+"')";
                    Statement stmt=con.createStatement();
                    stmt.executeUpdate(query);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
*/

                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.barta24"));
                startActivity(link);
            }
        });

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
                    Intent intent = new Intent(ShowActivity.this, Rabban1.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 1) {

                    Intent intent = new Intent(ShowActivity.this, Rabban2.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 2) {

                    Intent intent = new Intent(ShowActivity.this, Rabban3.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 3) {

                    Intent intent = new Intent(ShowActivity.this, Rabban4.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 4) {

                    Intent intent = new Intent(ShowActivity.this, Rabban5.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 5) {

                    Intent intent = new Intent(ShowActivity.this, Rabban6.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 6) {

                    Intent intent = new Intent(ShowActivity.this, Rabban7.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 7) {

                    Intent intent = new Intent(ShowActivity.this, Rabban8.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 8) {

                    Intent intent = new Intent(ShowActivity.this, Rabban9.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 9) {

                    Intent intent = new Intent(ShowActivity.this, Rabban10.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }else if (position == 10) {
                    Intent intent = new Intent(ShowActivity.this, Rabban11.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 11) {
                    Intent intent = new Intent(ShowActivity.this, Rabban12.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 12) {
                    Intent intent = new Intent(ShowActivity.this, Rabban13.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 13) {
                    Intent intent = new Intent(ShowActivity.this, Rabban14.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 14) {
                    Intent intent = new Intent(ShowActivity.this, Rabban15.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 15) {
                    Intent intent = new Intent(ShowActivity.this, Rabban16.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 16) {
                    Intent intent = new Intent(ShowActivity.this, Rabban17.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 17) {
                    Intent intent = new Intent(ShowActivity.this, Rabban18.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 18) {
                    Intent intent = new Intent(ShowActivity.this, Rabban19.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 19) {
                    Intent intent = new Intent(ShowActivity.this, Rabban20.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 20) {

                    Intent intent = new Intent(ShowActivity.this, Rabban21.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 21) {

                    Intent intent = new Intent(ShowActivity.this, Rabban22.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 22) {

                    Intent intent = new Intent(ShowActivity.this, Rabban23.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 23) {

                    Intent intent = new Intent(ShowActivity.this, Rabban24.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 24) {

                    Intent intent = new Intent(ShowActivity.this, Rabban25.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 25) {

                    Intent intent = new Intent(ShowActivity.this, Rabban26.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 26) {

                    Intent intent = new Intent(ShowActivity.this, Rabban27.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 27) {

                    Intent intent = new Intent(ShowActivity.this, Rabban28.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 28) {

                    Intent intent = new Intent(ShowActivity.this, Rabban29.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 29) {

                    Intent intent = new Intent(ShowActivity.this, Rabban30.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 30) {

                    Intent intent = new Intent(ShowActivity.this, Rabban31.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 31) {

                    Intent intent = new Intent(ShowActivity.this, Rabban32.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 32) {

                    Intent intent = new Intent(ShowActivity.this, Rabban33.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 33) {

                    Intent intent = new Intent(ShowActivity.this, Rabban34.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 34) {

                    Intent intent = new Intent(ShowActivity.this, Rabban35.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 35) {

                    Intent intent = new Intent(ShowActivity.this, Rabban36.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 36) {

                    Intent intent = new Intent(ShowActivity.this, Rabban37.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 37) {

                    Intent intent = new Intent(ShowActivity.this, Rabban38.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 38) {

                    Intent intent = new Intent(ShowActivity.this, Rabban39.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                } else if (position == 39) {

                    Intent intent = new Intent(ShowActivity.this, Rabban40.class);
                    intent.putExtra("name", name);
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
