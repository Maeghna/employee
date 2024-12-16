package com.example.employee;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addEmployee extends AppCompatActivity {
EditText e1,e2,e3,e4,e5;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_employee);
e1=(EditText)findViewById(R.id.employeecode);
e2=(EditText)findViewById(R.id.name);
e3=(EditText)findViewById(R.id.designation);
e4=(EditText)findViewById(R.id.emailid);
e5=(EditText)findViewById(R.id.salary);
b1=(Button)findViewById(R.id.submit);
b2=(Button)findViewById(R.id.bm);
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(), menu.class);
        startActivity(i);
    }
});
    }
}