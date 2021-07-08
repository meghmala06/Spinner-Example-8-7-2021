package com.example.spinnerviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner mspr;
    private String [] citiesarray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mspr=findViewById(R.id.sprCities);
        citiesarray=getResources().getStringArray(R.array.cities);


        ArrayAdapter<String> cityAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,citiesarray);
        mspr.setAdapter(cityAdapter);

        mspr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String city=parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Item clicked is=>"+city, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}




