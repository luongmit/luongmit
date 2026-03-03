package com.example.thnangcao;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Bai4Activity extends AppCompatActivity {
    private EditText etEmpName, etWorkDays;
    private Spinner spPosition;
    private CheckBox cbOvertime;
    private TextView tvSalaryResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai4_activity);

        etEmpName = findViewById(R.id.etEmpName);
        etWorkDays = findViewById(R.id.etWorkDays);
        spPosition = findViewById(R.id.spPosition);
        cbOvertime = findViewById(R.id.cbOvertime);
        tvSalaryResult = findViewById(R.id.tvSalaryResult);
        Button btnCalculate = findViewById(R.id.btnCalculateSalary);

        String[] positions = {"Trưởng phòng", "Phó phòng", "Nhân viên", "Kế toán"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, positions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spPosition.setAdapter(adapter);

        btnCalculate.setOnClickListener(v -> {
            String name = etEmpName.getText().toString().trim();
            String daysStr = etWorkDays.getText().toString().trim();

            if (name.isEmpty() || daysStr.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                return;
            }

            int workDays = Integer.parseInt(daysStr);
            if (workDays < 20) {
                Toast.makeText(this, "Cảnh báo: Số ngày công ít hơn 20 ngày!", Toast.LENGTH_LONG).show();
            }

            long baseSalary = 0;
            String pos = spPosition.getSelectedItem().toString();
            switch (pos) {
                case "Trưởng phòng": baseSalary = 15000000; break;
                case "Phó phòng": baseSalary = 10000000; break;
                case "Nhân viên": baseSalary = 7000000; break;
                case "Kế toán": baseSalary = 8000000; break;
            }

            long overtimePay = cbOvertime.isChecked() ? 500000 : 0;
            long totalSalary = baseSalary + (workDays * 200000) + overtimePay;

            String result = "Nhân viên: " + name + "\n" +
                    "Chức vụ: " + pos + "\n" +
                    "Ngày công: " + workDays + "\n" +
                    "Phụ cấp tăng ca: " + overtimePay + "\n" +
                    "Tổng lương: " + String.format("%,d", totalSalary) + " VNĐ";

            tvSalaryResult.setText(result);
            tvSalaryResult.setVisibility(View.VISIBLE);

            if (totalSalary > 20000000) {
                tvSalaryResult.setTextColor(Color.RED);
            } else {
                tvSalaryResult.setTextColor(Color.BLACK);
            }
        });
    }
}