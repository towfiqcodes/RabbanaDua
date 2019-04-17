package com.eomsbd.rabbanadua.rabbana_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eomsbd.rabbanadua.R;

public class Rabban20 extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabban20);
        textView=findViewById(R.id.name20);
        String name=getIntent().getStringExtra("name");

        textView.setText(name);

        linearLayout=findViewById(R.id.backButton20);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
