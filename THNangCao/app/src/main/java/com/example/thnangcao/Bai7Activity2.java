package com.example.thnangcao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Bai7Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai7_activity2);

        TextView tvGuest = findViewById(R.id.tvHotelGuest);
        TextView tvID = findViewById(R.id.tvHotelID);
        TextView tvRoom = findViewById(R.id.tvHotelRoom);
        TextView tvDays = findViewById(R.id.tvHotelDays);
        TextView tvService = findViewById(R.id.tvHotelService);
        TextView tvDiscount = findViewById(R.id.tvHotelDiscount);
        TextView tvTotal = findViewById(R.id.tvHotelTotal);
        Button btnBack = findViewById(R.id.btnBackBai7);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            tvGuest.append(extras.getString("name"));
            tvID.append(extras.getString("idCard"));
            tvRoom.append(extras.getString("roomType"));
            tvDays.append(String.valueOf(extras.getInt("days")));
            tvService.append(extras.getString("services"));
            
            long discount = extras.getLong("discount");
            if (discount > 0) {
                tvDiscount.setVisibility(View.VISIBLE);
                tvDiscount.append("-" + String.format("%,d", discount) + " VNĐ");
            }
            
            tvTotal.append(String.format("%,d", extras.getLong("total")) + " VNĐ");
        }

        btnBack.setOnClickListener(v -> finish());
    }
}