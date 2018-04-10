package com.example.android.tipcaculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class YourReceipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_receipt);
        setTitle("Your Receipt");

        Intent i=getIntent();
        Receipt a=(Receipt)i.getSerializableExtra("MyClass");
        display(a);


    }
    public void display (Receipt a){
        TextView textView=(TextView)findViewById(R.id.textView);
        double grandtotal=a.getTotal()+a.getTip()+a.getSaleTax();
        textView.setText(Keys.NAME+a.getName()+Keys.TOTAL+a.getTotal()+'\n'+Keys.SALETAX+a.getSaleTax()+'\n'+Keys.TIP+a.getTip()+'\n'+Keys.PACK+a.isPack()+'\n'+Keys.GRANDTOTAL+grandtotal);
    }
}
