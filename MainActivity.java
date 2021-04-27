package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String msg="com.example.multiscreen.order";
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeOrder(View view){
        Intent intent=new Intent(this,OrderActivity.class);
        EditText et1=findViewById(R.id.editTextTextPersonName);
        EditText et2=findViewById(R.id.editTextTextPersonName2);
        EditText et3=findViewById(R.id.editTextTextPersonName3);
        message="Order for "+et1.getText().toString()+", "+et2.getText().toString()+" & "+et3.getText().toString()+" has been" +
                " successfully placed";
        intent.putExtra(msg,message);
        startActivity(intent);

    }
}
