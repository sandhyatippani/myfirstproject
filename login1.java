package com.example.pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class login1 extends AppCompatActivity {

Button ARRBYS;
Button CAFETERIA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        Button ARRBYS=(Button)findViewById(R.id.acanteen);
        Button CAFERTIA=(Button)findViewById(R.id.bcanteen);

    }
}
