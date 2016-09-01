package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.ApplicationController;
import com.programacion.movil.estemanp.androidmvcapplication.R;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    Button BLogin, BRegistrer;
    ApplicationController appController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        BLogin=(android.widget.Button) this.findViewById(R.id.buttonIN);
        BRegistrer=(android.widget.Button) this.findViewById(R.id.buttonUP);

        BLogin.setOnClickListener(this);
        BRegistrer.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonIN:
                startActivity(new Intent(this, LoginActivity.class));

                break;

            case R.id.buttonUP:
                startActivity(new Intent(this, RegisterActivity.class));

                break;

        }

    }
}
