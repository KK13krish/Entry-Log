package com.example.entrylog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.username);
        e2=(EditText) findViewById(R.id.pswrd);
        b1=(AppCompatButton) findViewById(R.id.loginbtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String getname = e1.getText().toString();
                    String getpass = e2.getText().toString();
                    if(getname.equals("admin") && getpass.equals("12345"))
                    {
                        Intent i=new Intent(getApplicationContext(),LogEntry.class);
                        startActivity(i);

                    }
                    else {
                        Toast.makeText(getApplicationContext(), "username and password not match", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "no input", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}