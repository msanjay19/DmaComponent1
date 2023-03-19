package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit = findViewById(R.id.Submit);
        EditText Name = findViewById(R.id.Name);
        EditText Address = findViewById(R.id.Address);
        EditText Age = findViewById(R.id.Age);
        RadioButton male = findViewById(R.id.Male);
        RadioButton feMale = findViewById(R.id.Female);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender="Other";

                if(male.isChecked())
                    gender="Male";
                else if(feMale.isChecked())
                    gender="Female";

                String name=Name.getText().toString();
                String address=Address.getText().toString();
                String age=Age.getText().toString();
                Intent ii= new Intent(getApplicationContext(),DetailActivity.class);
                ii.putExtra("name",name);
                ii.putExtra("address",address);
                ii.putExtra("age",age);
                ii.putExtra("gender",gender);
                Intent[] intents = {ii};
                startActivities(intents);
            }
        });
    }
}