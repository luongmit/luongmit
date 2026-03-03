package com.example.thnangcao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Calendar;

public class Bai2Activity1 extends AppCompatActivity {
    private EditText etSVName, etBirthYear, etClass;
    private Button btnAddSV, btnViewList;
    public static ArrayList<String> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2_activity1);

        etSVName = findViewById(R.id.etSVName);
        etBirthYear = findViewById(R.id.etBirthYear);
        etClass = findViewById(R.id.etClass);
        btnAddSV = findViewById(R.id.btnAddSV);
        btnViewList = findViewById(R.id.btnViewList);

        btnAddSV.setOnClickListener(v -> {
            String name = etSVName.getText().toString().trim();
            String yearStr = etBirthYear.getText().toString().trim();
            String className = etClass.getText().toString().trim();

            if (name.isEmpty() || yearStr.isEmpty() || className.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                return;
            }

            int birthYear = Integer.parseInt(yearStr);
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            if (birthYear > currentYear) {
                Toast.makeText(this, "Năm sinh không được lớn hơn năm hiện tại", Toast.LENGTH_SHORT).show();
                return;
            }

            // Check for duplicate names
            for (String s : studentList) {
                if (s.startsWith(name + " -")) {
                    Toast.makeText(this, "Tên sinh viên đã tồn tại", Toast.LENGTH_SHORT).show();
                    return;
                }
            }

            String info = name + " - " + birthYear + " - " + className;
            studentList.add(info);
            Toast.makeText(this, "Đã thêm sinh viên", Toast.LENGTH_SHORT).show();
            
            // Clear inputs
            etSVName.setText("");
            etBirthYear.setText("");
            etClass.setText("");
        });

        btnViewList.setOnClickListener(v -> {
            Intent intent = new Intent(this, Bai2Activity2.class);
            startActivity(intent);
        });
    }
}