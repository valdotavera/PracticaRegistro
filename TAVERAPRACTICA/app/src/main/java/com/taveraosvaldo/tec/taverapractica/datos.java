package com.taveraosvaldo.tec.taverapractica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class datos extends AppCompatActivity implements View.OnClickListener {
    TextView nombre,direccion,telefono,fecha;
    private Button modificar,aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        nombre=(TextView) findViewById(R.id.nombre);
        direccion=(TextView) findViewById(R.id.direccion);
        telefono=(TextView) findViewById(R.id.telefono);
        fecha=(TextView) findViewById(R.id.fecha);

        modificar = (Button) findViewById(R.id.modificar);
        modificar.setOnClickListener(this);

        aceptar = (Button) findViewById(R.id.aceptar);
        aceptar.setOnClickListener(this);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String datoNombre = (String) extras.get("nombre");
            String datoTelefono = (String) extras.get("telefono");
            String datoDireccion = (String) extras.get("direccion");
            String datoFecha = (String) extras.get("fecha");

            nombre.setText("Nombre: "+datoNombre);
            telefono.setText("Telefono :"+datoTelefono);
            direccion.setText("Direccion :"+datoDireccion);
            fecha.setText("Fecha Nacimiento :"+datoFecha);



        }
    }

   /* public void Onclick (View view) {
        Intent explicit_intent;
        explicit_intent = new Intent(this, gracias.class);
        startActivity(explicit_intent);
    }*/


    @Override
    public void onClick(View v) {
        if (v == modificar) {
            onBackPressed();
        }else if(v == aceptar){
            Intent explicit_intent;
            explicit_intent = new Intent(this, gracias.class);
            startActivity(explicit_intent);
        }

    }
}
