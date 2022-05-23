package com.example.colorcombination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView main = (TextView)findViewById(R.id.main);

        // 입력창의 글자 수 제한 및 숫자랑 영문만 입력할 수 있도록 한글과 특수 문자 제한
        EditText edt = (EditText)findViewById(R.id.edt);
        edt.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");

                if(!pattern.matcher(source).matches()) {
                    return "";
                }
                return null;
            }
        }});

        EditText edt2 = (EditText)findViewById(R.id.edt2);
        edt2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");

                if(!pattern.matcher(source).matches()) {
                    return "";
                }
                return null;
            }
        }});

        EditText edt3 = (EditText)findViewById(R.id.edt3);
        edt3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");

                if(!pattern.matcher(source).matches()) {
                    return "";
                }
                return null;
            }
        }});

        EditText edt4 = (EditText)findViewById(R.id.edt4);
        edt4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");

                if(!pattern.matcher(source).matches()) {
                    return "";
                }
                return null;
            }
        }});

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt.getText().toString().equals("") || edt2.getText().toString().equals("") ||
                edt3.getText().toString().equals("") || edt4.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "색상 코드 값을 모두 입력 해주세요. " , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}