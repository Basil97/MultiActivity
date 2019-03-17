package com.basil.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLogIn(View view) {
        EditText edName = findViewById(R.id.edName);
        EditText edPass = findViewById(R.id.edPass);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", edName.getText().toString());
        intent.putExtra("pass", edPass.getText().toString());
        startActivity(intent);
    }
}
