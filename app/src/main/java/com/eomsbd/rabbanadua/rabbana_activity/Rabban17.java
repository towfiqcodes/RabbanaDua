package com.eomsbd.rabbanadua.rabbana_activity;

import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ZoomControls;

import com.eomsbd.rabbanadua.R;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class Rabban17 extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView textView,textView5, textView7, textView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabban17);
        textView=findViewById(R.id.name17);

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




        linearLayout=findViewById(R.id.backButton17);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
