package com.example.thnangcao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Bai3Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai3_activity2);

        TextView tvName = findViewById(R.id.tvBillCustomer);
        TextView tvMovie = findViewById(R.id.tvBillMovie);
        TextView tvTime = findViewById(R.id.tvBillTime);
        TextView tvCombo = findViewById(R.id.tvBillCombo);
        TextView tvTotal = findViewById(R.id.tvBillTotal);
        Button btnBack = findViewById(R.id.btnBackBai3);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tvName.append(extras.getString("name"));
            tvMovie.append(extras.getString("movie"));
            tvTime.append(extras.getString("time"));
            tvCombo.append(extras.getBoolean("hasCombo") ? "Có" : "Không");
            tvTotal.append(extras.getLong("total") + " VNĐ");
        }

        btnBack.setOnClickListener(v -> finish());
    }
}