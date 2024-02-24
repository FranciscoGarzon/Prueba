package com.example.prueba;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView6, textView7, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los TextViews y al Button
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView2 = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);

        // Configuración del OnClickListener para el botón "Calcular"
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores de textView6 y textView7 como String
                String value1Str = textView6.getText().toString();
                String value2Str = textView7.getText().toString();

                // Convertir los valores a números enteros
                int value1 = Integer.parseInt(value1Str);
                int value2 = Integer.parseInt(value2Str);

                // Calcular la suma
                int total = value1 + value2;

                // Mostrar el resultado en textView2
                textView2.setText(String.valueOf(total));
            }
        });
    }
}

