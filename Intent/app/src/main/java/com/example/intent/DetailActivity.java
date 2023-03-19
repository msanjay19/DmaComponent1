package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent=getIntent();
        TextView view=findViewById(R.id.details);

        view.setText("Name : "+intent.getStringExtra("name") + System.getProperty("line.separator")
                +"Address : "+intent.getStringExtra("address")+ System.getProperty("line.separator")
                +"Age : "+intent.getStringExtra("age") + System.getProperty("line.separator")
                +"Gender : "+intent.getStringExtra("gender"));
    }
}