package com.fju.member;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity implements View.OnClickListener {

    private View arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);


        arrow = findViewById(R.id.login2);
        findViewById(R.id.login2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText age=findViewById(R.id.Gender);
        String ag=age.getText().toString();
        if(!TextUtils.isEmpty(ag)){
            Intent intent = new Intent(this, GenderActivity.class);
            SharedPreferences preferences = getSharedPreferences("test",MODE_PRIVATE);
            preferences.edit()
                    .putString("NAME",ag)
                    .commit();
            startActivity(intent);
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
