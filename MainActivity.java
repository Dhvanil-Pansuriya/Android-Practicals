package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText editTextText;
    private EditText editTextText2;
    private EditText editTextText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        editTextText3 = findViewById(R.id.editTextText3);

        Button buttonAdd = findViewById(R.id.add);
        Button buttonSub = findViewById(R.id.subtract);
        Button buttonMulti = findViewById(R.id.multiply);
        Button buttonDivision = findViewById(R.id.division);

        

    }


}
