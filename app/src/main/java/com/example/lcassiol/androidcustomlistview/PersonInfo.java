package com.example.lcassiol.androidcustomlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // getIntent() is a method from the started activity
        Intent intent = getIntent();

        ImageView imgViewPhoto = (ImageView) findViewById(R.id.personPhoto);
        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtDescription = (TextView) findViewById(R.id.txtDescription);

        imgViewPhoto.setImageResource(intent.getIntExtra("photo",R.drawable.splashscreen));
        txtName.setText(intent.getStringExtra("name"));
        txtDescription.setText(intent.getStringExtra("description"));



    }

}
