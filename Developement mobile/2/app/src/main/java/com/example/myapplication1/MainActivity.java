package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnNav1;
    TextView msg, num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnNav1 = findViewById(R.id.btnNav1);
        msg = findViewById(R.id.msg);
        num = findViewById(R.id.num);

        Intent i1 = getIntent();
        if (i1 != null) {
            String intentMsg = i1.getStringExtra("msg");
            String intentNum = i1.getStringExtra("num");

            if (intentMsg != null) msg.setText(intentMsg);
            if (intentNum != null) num.setText(intentNum);
        }

        btnNav1.setOnClickListener(v -> {
            Intent intentToCalcul = new Intent(MainActivity.this, CalculActivity.class);
            startActivity(intentToCalcul);
        });

    }
}