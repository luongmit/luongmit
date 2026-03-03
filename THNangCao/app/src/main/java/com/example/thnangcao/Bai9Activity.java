package com.example.thnangcao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Bai9Activity extends AppCompatActivity {
    private EditText etName, etID;
    private CheckBox[] cbCourses;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai9_activity);

        etName = findViewById(R.id.etStudentNameReg);
        etID = findViewById(R.id.etStudentID);
        tvResult = findViewById(R.id.tvTuitionResult);
        
        cbCourses = new CheckBox[]{
            findViewById(R.id.cbCourse1), findViewById(R.id.cbCourse2),
            findViewById(R.id.cbCourse3), findViewById(R.id.cbCourse4),
            findViewById(R.id.cbCourse5), findViewById(R.id.cbCourse6)
        };

        findViewById(R.id.btnCalculateTuition).setOnClickListener(v -> calculateTuition());
        findViewById(R.id.btnResetForm).setOnClickListener(v -> resetForm());
    }

    private void calculateTuition() {
        String name = etName.getText().toString().trim();
        String id = etID.getText().toString().trim();

        if (name.isEmpty() || id.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập tên và MSSV", Toast.LENGTH_SHORT).show();
            return;
        }

        int count = 0;
        StringBuilder selectedCourses = new StringBuilder();
        for (CheckBox cb : cbCourses) {
            if (cb.isChecked()) {
                count++;
                selectedCourses.append("- ").append(cb.getText().toString()).append("\n");
            }
        }

        if (count == 0) {
            Toast.makeText(this, "Vui lòng chọn ít nhất 1 môn học", Toast.LENGTH_SHORT).show();
            return;
        }

        long tuition = count * 500000;
        String discountMsg = "";
        if (count >= 4) {
            long discount = (long) (tuition * 0.05);
            tuition -= discount;
            discountMsg = " (Giảm 5% vì đăng ký ≥ 4 môn)";
        }

        String result = "Hóa đơn học phí:\n" +
                "SV: " + name + " - " + id + "\n" +
                "Môn học đã đăng ký:\n" + selectedCourses +
                "Tổng tiền: " + String.format("%,d", tuition) + " VNĐ" + discountMsg;

        tvResult.setText(result);
        tvResult.setVisibility(View.VISIBLE);
    }

    private void resetForm() {
        etName.setText("");
        etID.setText("");
        for (CheckBox cb : cbCourses) cb.setChecked(false);
        tvResult.setVisibility(View.GONE);
    }
}