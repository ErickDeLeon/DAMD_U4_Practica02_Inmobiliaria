package mx.edu.ittepic.damd_u4_practica02_inmobiliaria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button propietario,  inmueble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        propietario = findViewById(R.id.botonpropie);
        inmueble = findViewById(R.id.botoninmue);

        propietario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent otraVentana = new Intent(MainActivity.this,Main2Activity_propietario.class);
                startActivity(otraVentana);

            }
        });

        inmueble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent otraVentana = new Intent(MainActivity.this, Main2Activity_inmueble.class);
                startActivity(otraVentana);

            }
        });

    }
}
