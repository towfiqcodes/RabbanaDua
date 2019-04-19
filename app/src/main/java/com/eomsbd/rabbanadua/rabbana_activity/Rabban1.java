package com.eomsbd.rabbanadua.rabbana_activity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ZoomControls;

import com.eomsbd.rabbanadua.R;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class Rabban1 extends AppCompatActivity {
    TextView textView, textView5, textView7, textView9;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabban1);

        linearLayout = findViewById(R.id.backButton);
        textView = findViewById(R.id.name);


        textView5 = findViewById(R.id.textView5);
        textView7 = findViewById(R.id.textView7);
        textView9 = findViewById(R.id.textView9);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView5.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            textView7.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            textView9.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }


        String name = getIntent().getStringExtra("name");
        textView.setText(name);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}
