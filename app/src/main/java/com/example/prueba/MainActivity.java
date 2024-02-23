package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button siguiente = findViewById(R.id.button);
        siguiente.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });
    }
}