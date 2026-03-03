package com.example.thnangcao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Bai10Activity1 extends AppCompatActivity {
    private EditText etCustomerName, etProductName, etProductPrice, etProductQty;
    public static ArrayList<String> cartItems = new ArrayList<>();
    public static String customerName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai10_activity1);

        etCustomerName = findViewById(R.id.etCustomerName10);
        etProductName = findViewById(R.id.etProductName10);
        etProductPrice = findViewById(R.id.etProductPrice10);
        etProductQty = findViewById(R.id.etProductQty10);
        Button btnAdd = findViewById(R.id.btnAddToCart);
        Button btnViewCart = findViewById(R.id.btnGoToCart);

        btnAdd.setOnClickListener(v -> {
            String cName = etCustomerName.getText().toString().trim();
            String pName = etProductName.getText().toString().trim();
            String pPrice = etProductPrice.getText().toString().trim();
            String pQty = etProductQty.getText().toString().trim();

            if (cName.isEmpty() || pName.isEmpty() || pPrice.isEmpty() || pQty.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                return;
            }

            customerName = cName;
            long price = Long.parseLong(pPrice);
            int qty = Integer.parseInt(pQty);
            long total = price * qty;

            String item = pName + " x" + qty + " - " + String.format("%,d", total) + " VNĐ";
            cartItems.add(item);
            Toast.makeText(this, "Đã thêm vào giỏ hàng", Toast.LENGTH_SHORT).show();

            etProductName.setText("");
            etProductPrice.setText("");
            etProductQty.setText("");
        });

        btnViewCart.setOnClickListener(v -> {
            if (cartItems.isEmpty()) {
                Toast.makeText(this, "Giỏ hàng trống", Toast.LENGTH_SHORT).show();
                return;
            }
            startActivity(new Intent(this, Bai10Activity2.class));
        });
    }
}