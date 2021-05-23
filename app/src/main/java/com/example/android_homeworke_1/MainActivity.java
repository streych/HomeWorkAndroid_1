package com.example.android_homeworke_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button_click);
        btn.setOnClickListener(this::onCLick);
    }

    public void onCLick(View view) {

        Intent i;
        i = new Intent(this, MainActivityEditText.class);
        startActivity(i);
    }
}