package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculatorApp extends AppCompatActivity {

    Double valorA,valorB,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button bt_sum =(Button) findViewById(R.id.bt_sum);
        Button bt_subtract =(Button) findViewById(R.id.bt_subtract);
        Button bt_multiply =(Button) findViewById(R.id.bt_multiply);
        Button bt_divide =(Button) findViewById(R.id.bt_divide);

        TextView tv_result = (TextView) findViewById(R.id.tv_result);
        EditText et_valorA = (EditText) findViewById(R.id.et_valorA);
        EditText et_valorB = (EditText) findViewById(R.id.et_valorB);

        AlertDialog.Builder boxMsg = new AlertDialog.Builder(this);

        bt_sum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                valorA =Double.parseDouble(et_valorA.getText().toString());
                valorB = Double.parseDouble(et_valorB.getText().toString());
                result = valorA + valorB;
                tv_result.setText(String.valueOf(result));
                boxMsg.setMessage("Cálculo armazenado com sucesso");
                boxMsg.setNeutralButton("Ok",null);
                boxMsg.show();
                et_valorA.setText("");
                et_valorB.setText("");
            }
        });
        bt_subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                valorA =Double.parseDouble(et_valorA.getText().toString());
                valorB = Double.parseDouble(et_valorB.getText().toString());
                result = valorA - valorB;
                tv_result.setText(String.valueOf(result));
                boxMsg.setMessage("Cálculo armazenado com sucesso");
                boxMsg.setNeutralButton("Ok",null);
                boxMsg.show();
                et_valorA.setText("");
                et_valorB.setText("");
            }
        });
        bt_multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                valorA =Double.parseDouble(et_valorA.getText().toString());
                valorB = Double.parseDouble(et_valorB.getText().toString());
                result = valorA * valorB;
                tv_result.setText(String.valueOf(result));
                boxMsg.setMessage("Cálculo armazenado com sucesso");
                boxMsg.setNeutralButton("Ok",null);
                boxMsg.show();
                et_valorA.setText("");
                et_valorB.setText("");
            }
        });
        bt_divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                valorA =Double.parseDouble(et_valorA.getText().toString());
                valorB = Double.parseDouble(et_valorB.getText().toString());
                result = valorA / valorB;
                tv_result.setText(String.valueOf(result));
                boxMsg.setMessage("Cálculo armazenado com sucesso");
                boxMsg.setNeutralButton("Ok",null);
                boxMsg.show();
                et_valorA.setText("");
                et_valorB.setText("");
            }
        });
    }

    public void table(View v){
        Intent it_table = new Intent(this, Table.class);
        startActivity(it_table);
    }
}