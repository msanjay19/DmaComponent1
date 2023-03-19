package com.example.xmllayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int percentage=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculate=findViewById(R.id.calculate);
        TextView tip=findViewById(R.id.tip);
        EditText cost=findViewById(R.id.cost);

        btnCalculate.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getPercent();
                try {
                    tip.setText(""+((Float.parseFloat(cost.getText().toString())*percentage)/100)+"");
                }catch(Exception ex){
                    Toast.makeText(getApplicationContext(), ""+ex.getMessage()+"", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    void getPercent(){

        RadioButton amazing=findViewById(R.id.amazing);
        RadioButton good=findViewById(R.id.good);
        RadioButton okay=findViewById(R.id.okay);
        if(amazing.isChecked())
            percentage=20;
        if(good.isChecked())
            percentage=18;
        if(okay.isChecked())
            percentage=15;
    }
}