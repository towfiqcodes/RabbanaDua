package com.eomsbd.rabbanadua.rabbana_activity;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eomsbd.rabbanadua.R;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class Rabban2 extends AppCompatActivity {
    TextView textView, textView5, textView7, textView9;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabban2);

        linearLayout=findViewById(R.id.backButton2);
        textView=findViewById(R.id.name2);

        textView5 = findViewById(R.id.textView5);
        textView7 = findViewById(R.id.textView7);
        textView9 = findViewById(R.id.textView9);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView5.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            textView7.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
            textView9.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }


        String name=getIntent().getStringExtra("name");

        textView.setText(name);


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
