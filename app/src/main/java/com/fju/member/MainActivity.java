package com.fju.member;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText nm;
    private EditText ag;
    private EditText gd;
    private String ageString;
    private String nameString;
    private String genderString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm = findViewById(R.id.nickname1);
        ag = findViewById(R.id.gender);
        gd = findViewById(R.id.gender1);
        nameString = nm.getText().toString();
        ageString= ag.getText().toString();
        genderString = gd.getText().toString();



        if(TextUtils.isEmpty(nameString) && TextUtils.isEmpty(ageString) && TextUtils.isEmpty(genderString)){
            Intent intent = new Intent(this,NicknameActivity.class);
            startActivityForResult(intent,0);
        }
    }
}
