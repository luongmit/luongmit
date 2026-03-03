package com.example.th2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

public class Bai2Activity extends AppCompatActivity {
    private EditText edtToan, edtVan, edtAnh;
    private Button btnCalculate, btnClear;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        edtToan = findViewById(R.id.edtToan);
        edtVan = findViewById(R.id.edtVan);
        edtAnh = findViewById(R.id.edtAnh);
        btnCalculate = findViewById(R.id.btnCalculate);
        btnClear = findViewById(R.id.btnClear);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(v -> calculateAverage());

        btnClear.setOnClickListener(v -> {
            edtToan.setText("");
            edtVan.setText("");
            edtAnh.setText("");
            tvResult.setText("Kết quả: ");
        });
    }

    private void calculateAverage() {
        String sToan = edtToan.getText().toString();
        String sVan = edtVan.getText().toString();
        String sAnh = edtAnh.getText().toString();

        if (sToan.isEmpty() || sVan.isEmpty() || sAnh.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ điểm", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double toan = Double.parseDouble(sToan);
            double van = Double.parseDouble(sVan);
            double anh = Double.parseDouble(sAnh);

            if (isValid(toan) && isValid(van) && isValid(anh)) {
                double avg = (toan + van + anh) / 3.0;
                tvResult.setText(String.format(Locale.US, "Điểm trung bình: %.2f", avg));
            } else {
                Toast.makeText(this, "Điểm không hợp lệ (0–10)", Toast.LENGTH_SHORT).show();
            }
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Dữ liệu nhập vào phải là số", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValid(double score) {
        return score >= 0 && score <= 10;
    }
}