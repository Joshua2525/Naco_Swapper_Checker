package com.example.naco_swapperchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class ResultMessage extends AppCompatActivity {
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_message);

        // CODE TO MAKE APP FULL SCREEN AND HIDE ACTION BAR
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        resultTextView = findViewById(R.id.result);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        resultTextView.setText(result);
    }
}