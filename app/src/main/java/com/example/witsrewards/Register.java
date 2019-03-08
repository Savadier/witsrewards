package com.example.witsrewards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity {
    Button confirmRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Spinner yearsDropdown = findViewById(R.id.YOS);
        String[] years = new String[]{"1st", "2nd", "3rd","Postgrad"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, years);
        yearsDropdown.setAdapter(adapter1);

        confirmRegister = (Button)findViewById(R.id.registerButton2);

            EditText pText = (EditText) findViewById(R.id.EnterPassword);
            String password= pText.getEditableText().toString();









        };


    }

