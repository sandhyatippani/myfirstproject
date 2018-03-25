package com.example.pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sample extends AppCompatActivity {

    DatabaseHelper helper=new DatabaseHelper(this);


    Button login;
    EditText et1;
    EditText et2;
    TextView fz;
    Button signup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        Button login=(Button)findViewById(R.id.loginbutton);
        Button signup=(Button)findViewById(R.id.signupbutton);
        TextView fz=(TextView)findViewById(R.id.fz);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String pass;

                EditText et1 = (EditText) findViewById(R.id.uname);
                EditText et2 = (EditText) findViewById(R.id.upass);
                //   TextView phtv=(TextView)findViewById(R.id.phtv) ;
                //  TextView patv=(TextView)findViewById(R.id.patv) ;
                String uname = et1.getText().toString();
                String pass = et2.getText().toString();


                String password = helper.searchpass(uname);
                if (pass.equals(password)) {
                    // if (pass.equals("admin@123")) {
                    // Intent i2 = new Intent(getApplicationContext(), menuupdate.class);
                    // i2.setAction(Intent.ACTION_VIEW);
                    //startActivity(i2);
                    //} else {
                    Intent i = new Intent(getApplicationContext(), login1.class);
                    i.setAction(Intent.ACTION_VIEW);
                    startActivity(i);
                    }

                     else
                    {
                        Toast temp = Toast.makeText(sample.this, "username and password dont match", Toast.LENGTH_SHORT);
                        temp.show();
                    }
                }


        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1= new Intent(getApplicationContext(), signin.class);
                i1.setAction(Intent.ACTION_VIEW);
                startActivity(i1);

            }

        });

    }
}
