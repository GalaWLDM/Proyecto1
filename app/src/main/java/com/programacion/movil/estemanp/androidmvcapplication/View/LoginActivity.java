package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.AppController;
import com.programacion.movil.estemanp.androidmvcapplication.Controller.ApplicationController;
import com.programacion.movil.estemanp.androidmvcapplication.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText userName;
    EditText password;
    Button BLogin;
    TextView RegisterLink;
    ApplicationController appController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName=(android.widget.EditText) this.findViewById(R.id.editUsername);
        password=(android.widget.EditText) this.findViewById(R.id.editPassword);
        BLogin=(android.widget.Button) this.findViewById(R.id.btnLogin);
        RegisterLink=(android.widget.TextView) this.findViewById(R.id.tvRegisterLink);

        BLogin.setOnClickListener(this);
        RegisterLink.setOnClickListener(this);
    }

    public void login(View view) {
        if(AppController.get_instance().isValidUser(userName.getText().toString(),password.getText().toString())) {
            Intent intent = new Intent(this, Inicio.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "El usuario y contraseña no coinciden", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:

                break;

            case R.id.tvRegisterLink:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }
}
