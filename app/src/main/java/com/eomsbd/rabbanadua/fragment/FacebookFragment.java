package com.eomsbd.rabbanadua.fragment;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.eomsbd.rabbanadua.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FacebookFragment extends DialogFragment {

    Button facebookPage, faceGroup, buttonPanel;


    public FacebookFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_facebook, container, false);

        facebookPage = rootView.findViewById(R.id.facebookPage);
        faceGroup = rootView.findViewById(R.id.joinGroup);
        buttonPanel = rootView.findViewById(R.id.buttonPanel);


        facebookPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFaceBookPage("1956919387899698");
            }
        });
        buttonPanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return rootView;
    }

    private void goToFaceBookPage(String id) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + id)));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + id)));
        }
    }
}
