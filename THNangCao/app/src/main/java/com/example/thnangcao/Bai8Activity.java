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

public class Bai8Activity extends AppCompatActivity {
    private EditText etName, etAmount, etDate;
    private Spinner spCategory;
    private ListView lvExpenses;
    private TextView tvTotal;
    private ArrayList<String> expenseList = new ArrayList<>();
    private ArrayAdapter<String> adapter;
    private long totalExpense = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai8_activity);

        etName = findViewById(R.id.etExpenseName);
        etAmount = findViewById(R.id.etExpenseAmount);
        etDate = findViewById(R.id.etExpenseDate);
        spCategory = findViewById(R.id.spExpenseCategory);
        lvExpenses = findViewById(R.id.lvExpenses);
        tvTotal = findViewById(R.id.tvTotalExpense);
        Button btnAdd = findViewById(R.id.btnAddExpense);

        String[] categories = {"Ăn uống", "Di chuyển", "Mua sắm", "Giải trí", "Khác"};
        ArrayAdapter<String> catAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        catAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCategory.setAdapter(catAdapter);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, expenseList);
        lvExpenses.setAdapter(adapter);

        btnAdd.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String amountStr = etAmount.getText().toString().trim();
            String date = etDate.getText().toString().trim();
            String category = spCategory.getSelectedItem().toString();

            if (name.isEmpty() || amountStr.isEmpty() || date.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ", Toast.LENGTH_SHORT).show();
                return;
            }

            long amount = Long.parseLong(amountStr);
            totalExpense += amount;

            String item = "[" + date + "] " + name + " (" + category + "): " + String.format("%,d", amount) + " VNĐ";
            expenseList.add(item);
            adapter.notifyDataSetChanged();

            tvTotal.setText("Tổng chi tiêu: " + String.format("%,d", totalExpense) + " VNĐ");

            if (totalExpense > 5000000) {
                new AlertDialog.Builder(this)
                        .setTitle("Cảnh báo chi tiêu")
                        .setMessage("Tổng chi tiêu của bạn đã vượt quá 5.000.000 VNĐ!")
                        .setPositiveButton("Tôi đã biết", null)
                        .show();
            }

            etName.setText("");
            etAmount.setText("");
            etDate.setText("");
        });
    }
}