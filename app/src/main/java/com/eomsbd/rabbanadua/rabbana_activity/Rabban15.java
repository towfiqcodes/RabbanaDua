package com.eomsbd.rabbanadua.rabbana_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eomsbd.rabbanadua.R;

public class Rabban15 extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabban15);
        textView=findViewById(R.id.name15);
        String name=getIntent().getStringExtra("name");

        textView.setText(name);

        linearLayout=findViewById(R.id.backButton15);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
