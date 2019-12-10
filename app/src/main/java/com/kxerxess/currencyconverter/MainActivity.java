package com.kxerxess.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convusd(View view) {

        EditText inputRupees = (EditText) findViewById(R.id.inputRupees);
        Double convertedusd = Double.parseDouble(inputRupees.getText().toString())/ 71.77;

        Toast.makeText(MainActivity.this, "Dollars:  "+convertedusd.toString(), Toast.LENGTH_LONG).show();

    }

    public void convgbp(View view) {

        EditText inputRupees = (EditText) findViewById(R.id.inputRupees);
        Double convertedgbp = Double.parseDouble(inputRupees.getText().toString())/ 92.72;

        Toast.makeText(MainActivity.this, "Pounds:  "+convertedgbp.toString(), Toast.LENGTH_LONG).show();

    }

    public void convsek(View view) {

        EditText inputRupees = (EditText) findViewById(R.id.inputRupees);
        Double convertedsek = Double.parseDouble(inputRupees.getText().toString())/ 7.52;

        Toast.makeText(MainActivity.this, "Kronos:  "+convertedsek.toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
