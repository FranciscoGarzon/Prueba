package com.example.prueba;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2, editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los EditText y al Button
        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editTextResult = findViewById(R.id.editTextText3); // Cambié el ID a editTextText3
        Button button = findViewById(R.id.button);

        // Configuración del OnClickListener para el botón "Calcular"
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores de editTextText y textView7 como String
                String value1Str = editText1.getText().toString();
                String value2Str = editText2.getText().toString();

                // Convertir los valores a números enteros
                int value1 = Integer.parseInt(value1Str);
                int value2 = Integer.parseInt(value2Str);

                // Calcular la suma
                int total = value1 + value2;

                // Mostrar el resultado en editTextText2
                editTextResult.setText(String.valueOf(total));
            }
        });
    }
}

