package com.example.task1_20190346;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class DisplayMassegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_massege);
        displayMessage();
    }

    public void displayMessage(){
        TextView display_text= (TextView) findViewById(R.id.display_text);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Message");
        display_text.setText(message);
    }

}