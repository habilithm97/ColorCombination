package com.example.colorcombination;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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

    EditText edt, edt2, edt3, edt4;
    TextView main;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = (TextView)findViewById(R.id.main);

        // 입력창의 글자 수 제한 및 숫자랑 영문만 입력할 수 있도록 한글과 특수 문자 제한
        edt = (EditText)findViewById(R.id.edt);
        // EditText에 필터 생성(최대 글자 수 설정 필터와 원하는 문자만 입력할 수 있는 필터)
        edt.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), new InputFilter() { // 최대 글자 수는 2
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Pattern pattern = Pattern.compile("^[a-fA-F0-9]*$"); // 영문(소문자, 대문자)과 숫자만 입력 가능한 패턴

                // 입력된 문자가 패턴과 일치하지 않으면 입력이 안 됨
                if(!pattern.matcher(source).matches()) {
                    return "";
                }
                return null;
            }
        }});

        edt2 = (EditText)findViewById(R.id.edt2);
        edt2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Pattern pattern = Pattern.compile("^[a-fA-F0-9]*$");

                if(!pattern.matcher(source).matches()) {
                    return "";
                }
                return null;
            }
        }});

        edt3 = (EditText)findViewById(R.id.edt3);
        edt3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Pattern pattern = Pattern.compile("^[a-fA-F0-9]*$");

                if(!pattern.matcher(source).matches()) {
                    return "";
                }
                return null;
            }
        }});

        edt4 = (EditText)findViewById(R.id.edt4);
        edt4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                Pattern pattern = Pattern.compile("^[a-fA-F0-9]*$");

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
                        edt3.getText().toString().equals("") || edt4.getText().toString().equals("") ||
                        edt.getText().toString().length() == 1 || edt2.getText().toString().length() == 1 ||
                        edt3.getText().toString().length() == 1 || edt4.getText().toString().length() == 1) {
                    Toast.makeText(getApplicationContext(), "색상 코드 값을 모두 입력 해주세요. " , Toast.LENGTH_SHORT).show();
                } else {
                    colorCombination();
                }
            }
        });
    }

    public void colorCombination() {
        String aa = edt.getText().toString();
        String rr = edt2.getText().toString();
        String gg = edt3.getText().toString();
        String bb = edt4.getText().toString();

        String color = "#" + aa + rr + gg + bb;
        //Toast.makeText(getApplicationContext(), "색상 코드 :" + color, Toast.LENGTH_SHORT).show();

        main.setBackgroundColor(Color.parseColor(color));
    }
}