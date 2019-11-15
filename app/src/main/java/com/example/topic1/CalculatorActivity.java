package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    EditText etTextbox;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnMinus, btnMultiply, btnDivide,
            btnDecimal, btnTotal;
    TextView tvHistory;
    Integer result = 0;
    public int id = 0;

    public int one, two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //binding
        etTextbox = findViewById(R.id.etText);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);

        btnDecimal = findViewById(R.id.btnDecimal);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnTotal = findViewById(R.id.btnTotal);

        tvHistory = findViewById(R.id.tvHistory);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 1;
                if (TextUtils.isEmpty(etTextbox.getText())) {
                    etTextbox.setError("Enter some number first");
                    return;
                }
                one = Integer.parseInt(etTextbox.getText().toString());
                tvHistory.setText(one + " +");
                etTextbox.getText().clear();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 2;
                if (TextUtils.isEmpty(etTextbox.getText())) {
                    etTextbox.setError("Enter some number first");
                    return;
                }
                one = Integer.parseInt(etTextbox.getText().toString());
                tvHistory.setText(one + " - ");
                etTextbox.getText().clear();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 3;
                if (TextUtils.isEmpty(etTextbox.getText())) {
                    etTextbox.setError("Enter some number first");
                    return;
                }
                one = Integer.parseInt(etTextbox.getText().toString());
                tvHistory.setText(one + " * ");
                etTextbox.getText().clear();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 4;
                if (TextUtils.isEmpty(etTextbox.getText())) {
                    etTextbox.setError("Enter some number first");
                    return;
                }
                one = Integer.parseInt(etTextbox.getText().toString());
                tvHistory.setText(one + " / ");
                etTextbox.getText().clear();
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.getText().clear();
                tvHistory.setText("");
            }
        });

        btnTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(etTextbox.getText())) {
                    etTextbox.setError("Enter some number first");
                    return;
                }

                two = Integer.parseInt(etTextbox.getText().toString());

                Arithmetic arithmetic = new Arithmetic(one, two);
                if (id == 1) {
                    tvHistory.setText(arithmetic.displayAdd());
                    etTextbox.setText(String.valueOf(arithmetic.add()));
                } else if (id == 2) {
                    tvHistory.setText(arithmetic.displaySub());
                    etTextbox.setText(String.valueOf(arithmetic.sub()));
                } else if (id == 3) {
                    tvHistory.setText(arithmetic.displayMultiply());
                    etTextbox.setText(String.valueOf(arithmetic.multiply()));
                } else if (id == 4) {
                    tvHistory.setText(arithmetic.displayDivide());
                    etTextbox.setText(String.valueOf(arithmetic.divide()));
                }
                Toast.makeText(CalculatorActivity.this, "One is" + two, Toast.LENGTH_SHORT).show();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etTextbox.setText(etTextbox.getText().toString() + "0");
            }
        });
    }

}
