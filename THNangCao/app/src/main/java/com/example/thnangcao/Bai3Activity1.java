package com.example.thnangcao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Bai3Activity1 extends AppCompatActivity {
    private EditText etCustomerName;
    private Spinner spMovies;
    private RadioGroup rgShowTime;
    private CheckBox cbCombo;
    private Button btnBookTicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai3_activity1);

        etCustomerName = findViewById(R.id.etCustomerName);
        spMovies = findViewById(R.id.spMovies);
        rgShowTime = findViewById(R.id.rgShowTime);
        cbCombo = findViewById(R.id.cbCombo);
        btnBookTicket = findViewById(R.id.btnBookTicket);

        String[] movies = {"Lật Mặt 7", "Doraemon", "Kung Fu Panda 4", "Godzilla x Kong"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, movies);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMovies.setAdapter(adapter);

        btnBookTicket.setOnClickListener(v -> {
            String name = etCustomerName.getText().toString().trim();
            if (name.isEmpty()) {
                etCustomerName.setError("Vui lòng nhập tên khách hàng");
                return;
            }

            String movie = spMovies.getSelectedItem().toString();
            int selectedId = rgShowTime.getCheckedRadioButtonId();
            RadioButton rbTime = findViewById(selectedId);
            String time = rbTime.getText().toString();
            boolean hasCombo = cbCombo.isChecked();

            long total = 70000 + (hasCombo ? 30000 : 0);

            String message = "Khách hàng: " + name + "\nPhim: " + movie + "\nSuất: " + time + "\nCombo: " + (hasCombo ? "Có" : "Không") + "\nTổng tiền: " + total + " VNĐ";

            new AlertDialog.Builder(this)
                    .setTitle("Xác nhận thông tin")
                    .setMessage(message)
                    .setPositiveButton("Đồng ý", (dialog, which) -> {
                        Intent intent = new Intent(Bai3Activity1.this, Bai3Activity2.class);
                        intent.putExtra("name", name);
                        intent.putExtra("movie", movie);
                        intent.putExtra("time", time);
                        intent.putExtra("hasCombo", hasCombo);
                        intent.putExtra("total", total);
                        startActivity(intent);
                    })
                    .setNegativeButton("Hủy", null)
                    .show();
        });
    }
}