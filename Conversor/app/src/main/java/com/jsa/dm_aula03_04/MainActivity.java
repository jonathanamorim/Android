package com.jsa.dm_aula03_04;

import android.annotation.SuppressLint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView viewCelsius;
    TextView viewFahr;
    EditText editCelsius;
    EditText editFahr;
    TextView viewPrint;
    Button btnConverter;


    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConverter = (Button)findViewById(R.id.btnConverter);
        btnConverter.setOnClickListener(this);
        viewCelsius = (TextView)findViewById(R.id.viewCelsius);
        viewFahr = (TextView)findViewById(R.id.editFahr);
        viewPrint = (TextView)findViewById(R.id.viewPrint);
        editCelsius = (EditText)findViewById(R.id.editCelsius);
        editFahr = (EditText)findViewById(R.id.editFahr);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view){
        try {
            if (editCelsius.length() > 0) {
                double cel = Double.parseDouble(String.valueOf(editCelsius.getText()));
                double rCel = (cel * 1.8) + 32;
                viewPrint.setText(String.valueOf(rCel)+"° Fahrenheit");
                editCelsius.setText("");
            } else if (editFahr.length() > 0) {
                viewPrint.setText(editFahr.getText());
                double fah = Double.parseDouble(String.valueOf(editFahr.getText()));
                double rFah = (fah - 32) / 1.8;
                viewPrint.setText(String.valueOf(rFah)+"° Celsius");
                editFahr.setText("");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.i("activity_main","onStart iniciado");

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("activity_main","onRestart iniciado");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("activity_main","onResume iniciado");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("activity_main","onPause iniciado");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("activity_main","onStop iniciado");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("activity_main","onDestroy iniciado");
    }

}
