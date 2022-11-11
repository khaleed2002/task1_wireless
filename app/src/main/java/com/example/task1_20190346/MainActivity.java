package com.example.task1_20190346;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        sendMessage();

    }
    public void sendMessage(){
        Button send = (Button) findViewById(R.id.send_button);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text = (EditText)findViewById(R.id.edit_message);
                String message= text.getText().toString();
                Intent intent = new
                        Intent(MainActivity.this,DisplayMassegeActivity.class);
                intent.putExtra("Message",message);
                startActivity(intent);
            }
        });
    }

}