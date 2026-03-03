package com.example.thnangcao;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Bai6Activity extends AppCompatActivity {
    private EditText etName, etPrice, etQuantity;
    private Spinner spType;
    private ListView lvProducts;
    private TextView tvTotalValue;
    private ArrayList<String> productList = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    private long grandTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai6_activity);

        etName = findViewById(R.id.etProductName);
        etPrice = findViewById(R.id.etProductPrice);
        etQuantity = findViewById(R.id.etProductQuantity);
        spType = findViewById(R.id.spProductType);
        lvProducts = findViewById(R.id.lvProducts);
        tvTotalValue = findViewById(R.id.tvTotalValue);
        Button btnAdd = findViewById(R.id.btnAddProduct);

        String[] types = {"Điện tử", "Gia dụng", "Thời trang", "Thực phẩm"};
        ArrayAdapter<String> typeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, types);
        typeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spType.setAdapter(typeAdapter);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productList);
        lvProducts.setAdapter(adapter);

        btnAdd.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String priceStr = etPrice.getText().toString().trim();
            String qtyStr = etQuantity.getText().toString().trim();

            if (name.isEmpty() || priceStr.isEmpty() || qtyStr.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ", Toast.LENGTH_SHORT).show();
                return;
            }

            long price = Long.parseLong(priceStr);
            int qty = Integer.parseInt(qtyStr);
            String type = spType.getSelectedItem().toString();
            long total = price * qty;

            String item = name + " (" + qty + ") - " + String.format("%,d", total) + " VNĐ";
            productList.add(item);
            adapter.notifyDataSetChanged();

            grandTotal += total;
            tvTotalValue.setText("Tổng tiền: " + String.format("%,d", grandTotal) + " VNĐ");

            etName.setText("");
            etPrice.setText("");
            etQuantity.setText("");
        });

        lvProducts.setOnItemClickListener((parent, view, position, id) -> {
            String details = productList.get(position);
            new AlertDialog.Builder(this)
                    .setTitle("Chi tiết sản phẩm")
                    .setMessage(details)
                    .setPositiveButton("Đóng", null)
                    .show();
        });
    }
}