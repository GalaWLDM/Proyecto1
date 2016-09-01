package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.programacion.movil.estemanp.androidmvcapplication.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Nom, Apell, Edad, userName, password;
    Button BRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Nom=(android.widget.EditText) this.findViewById(R.id.editname);
        Apell=(android.widget.EditText) this.findViewById(R.id.editsurname);
        Edad=(android.widget.EditText) this.findViewById(R.id.editage);
        userName=(android.widget.EditText) this.findViewById(R.id.editUsername);
        password=(android.widget.EditText) this.findViewById(R.id.editPassword);
        BRegister=(android.widget.Button) this.findViewById(R.id.btnRegister);

        BRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegister:

                break;
        }
    }

}
