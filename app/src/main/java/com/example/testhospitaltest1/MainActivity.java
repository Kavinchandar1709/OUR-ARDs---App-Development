package com.example.testhospitaltest1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText text1,text2,text3;
    Button btn1;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;

    int m1,m2,m3,m4,m5,m6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_700)));

        text1 = findViewById(R.id.et1);
        text2 = findViewById(R.id.textviewtotal);
        text3 = findViewById(R.id.textviewaverage);

        tv1 = findViewById(R.id.textView2);
        tv2 = findViewById(R.id.textView4);
        tv3 = findViewById(R.id.textView5);
        tv4 = findViewById(R.id.textView6);
        tv5 = findViewById(R.id.textView7);
        tv6 = findViewById(R.id.textView8);

        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);

        btn1 = findViewById(R.id.submit);

        cb1 = findViewById(R.id.checkBox1);
        cb2 = findViewById(R.id.checkBox4);
        cb3 = findViewById(R.id.checkBox5);
        cb4 = findViewById(R.id.checkBox6);
        cb5 = findViewById(R.id.checkBox7);
        cb6 = findViewById(R.id.checkBox8);

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb1.isChecked()){
                    tv1.setText("11");
                    Toast.makeText(MainActivity.this,"Oxygen Saturation is less than 94",Toast.LENGTH_SHORT).show();
                    m1=11;
                }
                else {
                    tv1.setText("");
                    m1=0;
                }
            }
        });

        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb2.isChecked()){
                    tv2.setText("15");
                    Toast.makeText(MainActivity.this,"Urea is greater than 40",Toast.LENGTH_SHORT).show();
                    m2=15;
                }
                else {
                    tv2.setText("");
                    m2=0;
                }

            }
        });

        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb3.isChecked()){
                    tv3.setText("11");
                    Toast.makeText(MainActivity.this,"NRL < 3",Toast.LENGTH_SHORT).show();
                    m3=11;
                }
                else {
                    tv3.setText("");
                    m3=0;
                }

            }
        });

        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb4.isChecked()){
                    tv4.setText("9");
                    Toast.makeText(MainActivity.this,"Age is greater than 50",Toast.LENGTH_SHORT).show();
                    m4=9;
                }
                else {
                    tv4.setText("");
                    m4=0;
                }
            }
        });

        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb5.isChecked()){
                    tv5.setText("7");
                    Toast.makeText(MainActivity.this,"HEART RATE GREATER THAN 100",Toast.LENGTH_SHORT).show();
                    m5=7;
                }
                else {
                    tv5.setText("");
                    m5=0;
                }

            }
        });

        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb6.isChecked()){
                    tv6.setText("6");
                    Toast.makeText(MainActivity.this,"DIABETES +/-",Toast.LENGTH_SHORT).show();
                    m6=6;
                }
                else {
                    tv6.setText("");
                    m6=0;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
            }
        });
    }

    public void calc()
    {
        double total;
        total=m1+m2+m3+m4+m5+m6;
        text2.setText(String.valueOf(total));

        if(total<=19)
        {
            text3.setText("PRIMARY CARE SUFFICIENT");
            text3.setBackgroundColor(Color.parseColor("#3DDC84"));
        }
        else if(total>19 && total <= 24)
        {
            text3.setText("CHECK BIOMARKERS/REVISIT IN 3-DAYS");
            text3.setBackgroundColor(Color.parseColor("#FFA500"));
        }
        else if(total>=25)
        {
            text3.setText("GET YOURSELF ADMITTED IN THE HOSPITAL");
            text3.setBackgroundColor(Color.parseColor("#FF0000"));
        }
        else
        {
            text3.setText("Enter proper value");
        }

    }
}