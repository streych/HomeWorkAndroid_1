package com.example.android_homeworke_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityEditText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.many_edit_text);
        Button buttonBack = (Button)findViewById(R.id.back);
        buttonBack.setOnClickListener(this::onCLickBack);
    }

    public void onCLickBack(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}