package com.example.thnangcao;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Bai2Activity2 extends AppCompatActivity {
    private ListView lvStudents;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2_activity2);

        lvStudents = findViewById(R.id.lvStudents);
        Button btnBack = findViewById(R.id.btnBackBai2);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Bai2Activity1.studentList);
        lvStudents.setAdapter(adapter);

        lvStudents.setOnItemLongClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Xác nhận xóa")
                    .setMessage("Bạn có chắc chắn muốn xóa sinh viên này?")
                    .setPositiveButton("Xóa", (dialog, which) -> {
                        Bai2Activity1.studentList.remove(position);
                        adapter.notifyDataSetChanged();
                    })
                    .setNegativeButton("Hủy", null)
                    .show();
            return true;
        });

        btnBack.setOnClickListener(v -> finish());
    }
}