package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Title;
    TextView Name;
    TextView Display;
    EditText Input;
    Button Click;
    Button Clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Title = findViewById(R.id.txtTitle);
        Name = findViewById(R.id.txtName);
        Display = findViewById(R.id.txtDisplay);
        Click = findViewById(R.id.btnClick);
        Clear = findViewById(R.id.btnClear);
        Input = findViewById(R.id.txtInputName);
//myDisplay.setText("HELLO POGI!");
        Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = Input.getText().toString();
                Display.setText("HELLO "+name+"!");
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText("HELLO WORD!");
            }
        });
    }
}