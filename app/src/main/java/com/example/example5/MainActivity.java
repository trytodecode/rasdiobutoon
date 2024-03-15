package com.example.example5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ch, ch1, ch2, ch3;
    EditText editText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch = findViewById(R.id.checkBox);
        ch1 = findViewById(R.id.checkBox2);
        ch2 = findViewById(R.id.checkBox3);
        ch3 = findViewById(R.id.checkBox4);

        editText = findViewById(R.id.editTextTextMultiLine);
        submitButton = findViewById(R.id.button2);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show submission received message
                Toast.makeText(MainActivity.this, "Submission received", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Check(View v) {
        String msg = "";
        if (ch.isChecked())
            msg = msg + " Studying ";
        if (ch1.isChecked())
            msg = msg + " Coding ";
        if (ch2.isChecked())
            msg = msg + " Reading ";
        if (ch3.isChecked())
            msg = msg + " Sleeping ";
        Toast.makeText(this, msg + "are selected", Toast.LENGTH_LONG).show();
    }
}