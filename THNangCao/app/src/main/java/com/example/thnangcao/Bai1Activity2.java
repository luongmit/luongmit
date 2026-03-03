package com.example.thnangcao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Bai1Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai1_activity2);

        TextView tvFullName = findViewById(R.id.tvResultFullName);
        TextView tvEmail = findViewById(R.id.tvResultEmail);
        TextView tvGender = findViewById(R.id.tvResultGender);
        TextView tvHobbies = findViewById(R.id.tvResultHobbies);
        Button btnBack = findViewById(R.id.btnBack);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tvFullName.append(extras.getString("fullName"));
            tvEmail.append(extras.getString("email"));
            tvGender.append(extras.getString("gender"));
            ArrayList<String> hobbies = extras.getStringArrayList("hobbies");
            if (hobbies != null && !hobbies.isEmpty()) {
                tvHobbies.append(String.join(", ", hobbies));
            } else {
                tvHobbies.append("Không có");
            }
        }

        btnBack.setOnClickListener(v -> finish());
    }
}