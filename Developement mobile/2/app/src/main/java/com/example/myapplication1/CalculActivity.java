package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculActivity extends AppCompatActivity {

    EditText inputNumber1, inputNumber2;
    Button btnDivide, btnMultiply, btnMinus, btnPlus, btnNav2;
    TextView textResult, message, msg, num;
    Intent i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calcul);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputNumber1 = findViewById(R.id.inputNumber1);
        inputNumber2 = findViewById(R.id.inputNumber2);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        textResult = findViewById(R.id.textResult);
        message = findViewById(R.id.message);

        btnNav2 = findViewById(R.id.btnNav2);

        btnNav2 = findViewById(R.id.btnNav2);
        btnNav2.setOnClickListener(v -> {
            Intent i2 = new Intent(CalculActivity.this, MainActivity.class);
            i2.putExtra("msg", "bonjour !!");
            i2.putExtra("num", "2026");
            startActivity(i2);
            finish();
        });

        btnPlus.setOnClickListener(v -> calculer('+'));
        btnMinus.setOnClickListener(v -> calculer('-'));
        btnMultiply.setOnClickListener(v -> calculer('*'));
        btnDivide.setOnClickListener(v -> calculer('/'));
    }

    private void calculer(char operation) {
        String str1 = inputNumber1.getText().toString().trim();
        String str2 = inputNumber2.getText().toString().trim();

        if (str1.isEmpty() || str2.isEmpty()) {
            afficherErreur("Veuillez entrer des nombres valides.");
            return;
        }

        try {
            double a = Double.parseDouble(str1);
            double b = Double.parseDouble(str2);
            double result = 0;

            switch (operation) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        afficherErreur("ERREUR !!! : DIVISION PAR 0");
                        return;
                    }
                    result = a / b;
                    break;
            }

            if (message != null) message.setText("");
            if (textResult != null) textResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            afficherErreur("Format invalide.");
        }
    }


    private void afficherErreur(String texte) {
        if (message != null) {
            message.setText(texte);
        } else {
            Toast.makeText(this, texte, Toast.LENGTH_SHORT).show();
        }
    }
}