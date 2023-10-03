package com.example.a1_app_android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtUser;
    private EditText edtPass;
    private Button btnSignin;

    /*CICLO DE VIDA: ONLOAD JAVASCRIPT*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //document.getElementById();
        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
        btnSignin = findViewById(R.id.btnSignin);

        String user = edtUser.getText().toString();
        String pass = edtPass.getText().toString();
        btnSignin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

            }
        });
    }
}