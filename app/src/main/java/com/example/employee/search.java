package com.example.employee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class search extends AppCompatActivity {
EditText e1;
Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);
e1=(EditText)findViewById(R.id.employeecode);
b1=(Button)findViewById(R.id.search);
b2=(Button)findViewById(R.id.backtomenu);
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(), menu.class);
        startActivity(i);
    }
});
    }
}