package com.example.loginusingsqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView reciever_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        reciever_msg = findViewById(R.id.received_value_id);

        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");

        reciever_msg.setText(str);
    }
}