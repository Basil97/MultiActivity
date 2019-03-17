package com.basil.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txt = findViewById(R.id.txt);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String pass = intent.getStringExtra("pass");

        if (name.equals("osama") && pass.equals("12345678")) {
            String string = "Hi " + name;
            txt.setText(string);
        }else {
            String str = "User Name or Password is Incorrect";
            txt.setText(str);
        }
    }
}
