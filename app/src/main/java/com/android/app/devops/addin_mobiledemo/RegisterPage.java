package com.android.app.devops.addin_mobiledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
    }

    public void onClickBack(View v)
    {
        Intent in = new Intent(RegisterPage.this,HomePage.class);
        startActivity(in);
    }
}
