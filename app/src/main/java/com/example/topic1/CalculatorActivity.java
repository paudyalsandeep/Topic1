package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText etTextbox;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnAdd,btnMinus,btnMultiply,btnDivide,
            btnDecimal,btnTotal;
    Integer result=0;

    public int one,two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //binding
        etTextbox=findViewById(R.id.etText);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);

        btnDecimal=findViewById(R.id.btnDecimal);
        btnAdd=findViewById(R.id.btnAdd);
        btnMinus=findViewById(R.id.btnMinus);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnTotal=findViewById(R.id.btnTotal);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                one=Integer.parseInt(etTextbox.getText().toString());
                Toast.makeText(CalculatorActivity.this, "One is"+one, Toast.LENGTH_SHORT).show();
                etTextbox.getText().clear();



            }
        });

        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                two=Integer.parseInt(etTextbox.getText().toString());
                add();
                Toast.makeText(CalculatorActivity.this, "One is"+two, Toast.LENGTH_SHORT).show();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString()+"1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString()+"2");
            }
        });




    }
    public void add()
    {
       result=one+two;
       etTextbox.setText(String.valueOf(result));
    }
}
