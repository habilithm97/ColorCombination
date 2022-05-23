package com.example.colorcombination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView main = (TextView)findViewById(R.id.main);
        EditText edt = (EditText)findViewById(R.id.edt);
        EditText edt2 = (EditText)findViewById(R.id.edt2);
        EditText edt3 = (EditText)findViewById(R.id.edt3);
        EditText edt4 = (EditText)findViewById(R.id.edt4);
        Button btn = (Button)findViewById(R.id.btn);
    }
}