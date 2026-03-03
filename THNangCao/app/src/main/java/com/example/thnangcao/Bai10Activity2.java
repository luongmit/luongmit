package com.example.thnangcao;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Bai10Activity2 extends AppCompatActivity {
    private ListView lvCart;
    private TextView tvTotal, tvInfo;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai10_activity2);

        lvCart = findViewById(R.id.lvCartItems);
        tvTotal = findViewById(R.id.tvCartTotal);
        tvInfo = findViewById(R.id.tvCartCustomerInfo);
        Button btnBack = findViewById(R.id.btnBackToShop);
        Button btnCheckout = findViewById(R.id.btnCheckout);

        tvInfo.setText("Khách hàng: " + Bai10Activity1.customerName);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Bai10Activity1.cartItems);
        lvCart.setAdapter(adapter);

        calculateTotal();

        btnCheckout.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Xác nhận thanh toán")
                    .setMessage("Bạn có chắc chắn muốn thanh toán đơn hàng này?")
                    .setPositiveButton("Đồng ý", (dialog, which) -> {
                        Toast.makeText(this, "Thanh toán thành công!", Toast.LENGTH_LONG).show();
                        Bai10Activity1.cartItems.clear();
                        Bai10Activity1.customerName = "";
                        finish();
                    })
                    .setNegativeButton("Hủy", null)
                    .show();
        });

        btnBack.setOnClickListener(v -> finish());
    }

    private void calculateTotal() {
        long total = 0;
        for (String item : Bai10Activity1.cartItems) {
            try {
                // Extract price from string "Name xQty - 1,000 VNĐ"
                String temp = item.substring(item.lastIndexOf("-") + 1, item.lastIndexOf("VNĐ")).trim();
                temp = temp.replace(",", "");
                total += Long.parseLong(temp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        tvTotal.setText("Tổng cộng: " + String.format("%,d", total) + " VNĐ");
    }
}