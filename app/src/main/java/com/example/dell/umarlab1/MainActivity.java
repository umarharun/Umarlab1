package com.example.dell.umarlab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton= (Button) findViewById(R.id.button);
        etName= (EditText) findViewById(R.id.editText);
        tvMessage= (TextView) findViewById(R.id.textView);
    }

    public void displayText (View view) {

        String text = etName.getText().toString();
        tvMessage.setText("Welcome " + text);

        Toast toast = Toast.makeText(this, "Welcome, Umar", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void displayReset (View view){

        tvMessage.setText("Welcome");
        etName.getText().clear();
        Toast toast = Toast.makeText(this,"Name has been reset", Toast.LENGTH_SHORT);
        toast.show();
    }
}

