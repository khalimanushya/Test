package com.example.nbmis.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void add(View view){
        int first,second;

        EditText e1=(EditText)findViewById(R.id.num1);
        String num1=e1.getText().toString();
        first=Integer.parseInt(num1);
        EditText e2=(EditText)findViewById(R.id.num2);
        String num2=e2.getText().toString();
        second=Integer.parseInt(num2);
        int added=first+second;
        Toast.makeText(this, "Added value is "+ Integer.toString(added), Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
