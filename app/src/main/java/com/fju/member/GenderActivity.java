package com.fju.member;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity implements View.OnClickListener {

    private View arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);


        arrow = findViewById(R.id.login3);
        findViewById(R.id.login3).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText gd=findViewById(R.id.Gender);
        String gd1=gd.getText().toString();
        if(!TextUtils.isEmpty(gd1)){
            SharedPreferences preferences = getSharedPreferences("test",MODE_PRIVATE);
            preferences.edit()
                    .putString("NAME",gd1)
                    .commit();
            finish();

        }else {
            new AlertDialog.Builder(this)
                    .setTitle("失敗")
                    .setMessage("請輸入年齡")
                    .setPositiveButton("再輸入一次",null)
                    .show();

        }
    }


    }

