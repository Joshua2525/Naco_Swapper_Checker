package com.example.naco_swapperchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2;
    Button buttonSwap, buttonCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CODE TO MAKE APP FULL SCREEN AND HIDE ACTION BAR
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        editText1 = findViewById(R.id.text1);
        editText2 = findViewById(R.id.text2);
        buttonSwap = findViewById(R.id.buttonSwap);
        buttonCheck = findViewById(R.id.buttonCheck);
        
        buttonSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = editText1.getText().toString();
                editText1.setText(editText2.getText().toString());
                editText2.setText(temp);
            }
        });

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();

                Intent intent = new Intent(MainActivity.this, ResultMessage.class);
                if (text1.equals(text2)) {
                    intent.putExtra("result", "SAME");
                } else {
                    intent.putExtra("result", "NOT THE SAME");
                }
                startActivity(intent);
            }
        });
    }
}
