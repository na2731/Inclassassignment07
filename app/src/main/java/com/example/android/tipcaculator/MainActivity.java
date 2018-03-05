package com.example.android.tipcaculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAnotherActivity(View view){
        Intent i=new Intent(this,YourReceipt.class);
        EditText Total=(EditText)findViewById(R.id.editText);
        double total=Double.parseDouble(Total.getText().toString());


        EditText SaleTax=(EditText)findViewById(R.id.editText2);
        double saletax=Double.parseDouble(SaleTax.getText().toString());

        EditText Tip=(EditText)findViewById(R.id.editText3);
        double tip= Double.parseDouble(Tip.getText().toString());

        Receipt a=new Receipt(total,saletax,tip);
        i.putExtra("MyClass",a);

        startActivity(i);

    }
}
