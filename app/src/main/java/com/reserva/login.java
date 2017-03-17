package com.reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Leon on 16/03/2017.
 */

public class login extends Activity {
    EditText usr, clav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usr = (EditText) findViewById(R.id.txtUsrL);
        clav = (EditText) findViewById(R.id.txtClaveL);
    }

    public void entrar(View v){
        String claveL, userL;
        claveL = clav.getText().toString();
        userL = usr.getText().toString();

        if(userL.equals("Christian") && claveL.equals("Batiz")){
            Intent entra = new Intent(this, MainActivity.class);
            Bundle datos = new Bundle();
            datos.putString("usuario", userL.trim());
            entra.putExtras(datos);
            finish();
            startActivity(entra);
        }else{
            Toast.makeText(this,"Usuario y/o contraseña invalidos", Toast.LENGTH_SHORT).show();
        }
    }
}
