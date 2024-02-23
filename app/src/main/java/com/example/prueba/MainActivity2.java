package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText valorUsuario;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        valorUsuario=findViewById(R.id.editTextText);
        resultado=findViewById(R.id.resultado);


        Button calcular = findViewById(R.id.button2);
        calcular.setOnClickListener(v->calcularFactura());
    }

    private void calcularFactura() {
        String textoUsuario = valorUsuario.getText().toString();
        double valorSinIva = Double.parseDouble(textoUsuario);
        double valorConIva = valorTotal(valorSinIva);

        resultado.setText(String.valueOf(valorConIva));
    }

    public static double valorTotal(double valorInicial) {
     return valorInicial * 1.19;
    }
}