package com.example.diby.patient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login_click(View v){
        Intent intent= new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }


    public void register_click(View v){
        Intent intent= new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(intent);
    }
}
