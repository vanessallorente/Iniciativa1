package com.example.astrid.appsesion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
    }

    public void verificar(View v) {
        // Comprueba que los campos de usuario y contraseña no estén vacíos
        String usuario = et1.getText().toString();
        String clave = et2.getText().toString();

        if (usuario.length() == 0 || clave.length() == 0) {
            Toast notificacion = Toast.makeText(this,"Rellene todos los campos", Toast.LENGTH_LONG);
            notificacion.show();
        } else if (clave.equals("usj")){
            Toast notificacion = Toast.makeText(this,"Usuario y contraseña correctos", Toast.LENGTH_LONG);
            notificacion.show();
            acceder();
        } else {
            Toast notificacion = Toast.makeText(this,"Contraseña incorrecta", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }

    public void acceder() {
        Intent i = new Intent(this, Llamando.class );
        startActivity(i);
    }
}
