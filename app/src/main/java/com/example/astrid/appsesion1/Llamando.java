package com.example.astrid.appsesion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Llamando extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamando);

        tv1 = (TextView)findViewById(R.id.tv1);
    }

    public void llamar (View view){
        tv1.setText("Llamando...");
    }

    public void verMas (View view){
        Intent intent_2 = new Intent(this, AcercaDe.class);
        startActivity(intent_2);
    }

    public void finalizar (View view){
        Toast notificacion = Toast.makeText(this,"Has salido", Toast.LENGTH_SHORT);
        notificacion.show();
        finish();
    }
}
