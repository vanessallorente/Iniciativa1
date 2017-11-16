package com.example.astrid.appsesion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class AcercaDe extends AppCompatActivity {
    private Spinner spinner1;
    private TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        String [] alumnos = {"Astrid","Vanessa"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, alumnos);
        spinner1.setAdapter(adapter);
    }

    public void actualizarDatos(View view) {
        String selec = spinner1.getSelectedItem().toString();
        String nombre, identificador;
        if (selec.equals("Astrid")) {
            nombre = "Astrid García";
            identificador = "alu.92587";
            tv1.setText(nombre);
            tv2.setText(identificador);
        } else {
            nombre = "Vanessa Llorente";
            identificador = "alu.96867";
            tv1.setText(nombre);
            tv2.setText(identificador);
        }
    }

    public void volver(View v) {
        finish();
    }
}
