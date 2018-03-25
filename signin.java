package com.example.pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class signin extends AppCompatActivity {
   // DatabaseHelper helper=new DatabaseHelper(this);
    TextView ca;
    EditText username;
    EditText password;
    EditText confirmpass;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Button register=(Button)findViewById(R.id.register);
        EditText username=(EditText)findViewById(R.id.uname);
        EditText password=(EditText)findViewById(R.id.pass);
        EditText confirmpass=(EditText)findViewById(R.id.cpass);
        TextView ca=(TextView)findViewById(R.id.ca);
        register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                EditText username=(EditText)findViewById(R.id.uname);
                EditText password=(EditText)findViewById(R.id.pass);
                EditText confirmpass=(EditText)findViewById(R.id.cpass);
               String username1 =username.getText().toString();
                String password1=password.getText().toString();
                 String confirmpass1=confirmpass.getText().toString();
                // if(!password.equals(confirmpass))
                 //{
                   //  Toast pass= Toast.makeText(signin.this,"password don't match",Toast.LENGTH_SHORT);
                     //pass.show();

                 //}
                Contact c=new Contact();
                c.setUsername(username1);
                c.setPass(password1);

                Intent i = new Intent(getApplicationContext(), sample.class);
                i.setAction(Intent.ACTION_VIEW);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "redirecting", Toast.LENGTH_SHORT).show();

            }

        });
        }
    }

