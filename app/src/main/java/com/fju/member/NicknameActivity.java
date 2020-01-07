package com.fju.member;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nick;
    private String nickname;
    private View arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);

        arrow = findViewById(R.id.login1);
        findViewById(R.id.login1).setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        EditText username=findViewById(R.id.nickname1);
        String nickname=username.getText().toString();
        if(!TextUtils.isEmpty(nickname)){
            Intent intent = new Intent(this, AgeActivity.class);
            SharedPreferences preferences = getSharedPreferences("test",MODE_PRIVATE);
            preferences.edit()
                    .putString("NAME",nickname)
                    .commit();
            startActivity(intent);
            setResult(RESULT_OK);
            finish();

        }else {
            new AlertDialog.Builder(this)
                    .setTitle("失敗")
                    .setMessage("請輸入暱稱")
                    .setPositiveButton("再輸入一次",null)
                    .show();

        }

    }
}
