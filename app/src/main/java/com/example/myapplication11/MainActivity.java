package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 Button btn11;

 private void initUI(){
     btn11 = findViewById(R.id.btn11);
 }
    private void clicLinear(){
       btn11.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                // Action effectuée lors du clic ici un intent pour se rendre sur l'activité des linear layout
                // Départ                   // Arrivée
                Intent intent = new Intent(MainActivity.this, Test11.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        clicLinear();
    }
}