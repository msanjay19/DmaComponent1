package com.example.lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    };
    protected void onStart(){
        super.onStart();
        Log.d("LifeCycle","onStart Event Called.");
    };
    protected void onResume(){
        super.onResume();
        Log.d("LifeCycle","onResume Event Called.");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LifeCycle","onDestroy Event Called.");
    };
}