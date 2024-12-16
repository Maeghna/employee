package com.example.employee;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button b1;
String getUser,getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
e1=(EditText)findViewById(R.id.username);
e2=(EditText)findViewById(R.id.password);
b1=(Button)findViewById(R.id.login);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        getUser=e1.getText().toString();
        getPass=e2.getText().toString();
        if(getUser.equals("admin")&&getPass.equals("12345"))
        {
            Intent i=new Intent(getApplicationContext(), menu.class);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(),"INVALID",Toast.LENGTH_LONG).show();
        }
    }
});
    }
}