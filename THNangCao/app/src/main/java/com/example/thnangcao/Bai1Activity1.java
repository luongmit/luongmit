package com.example.thnangcao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Bai1Activity1 extends AppCompatActivity {
    private EditText etFullName, etEmail, etPassword, etConfirmPassword;
    private RadioGroup rgGender;
    private CheckBox cbMusic, cbSports, cbReading;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai1_activity1);

        initViews();
        btnRegister.setOnClickListener(v -> handleRegistration());
    }

    private void initViews() {
        etFullName = findViewById(R.id.etFullName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        rgGender = findViewById(R.id.rgGender);
        cbMusic = findViewById(R.id.cbMusic);
        cbSports = findViewById(R.id.cbSports);
        cbReading = findViewById(R.id.cbReading);
        btnRegister = findViewById(R.id.btnRegister);
    }

    private void handleRegistration() {
        String fullName = etFullName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString();
        String confirmPassword = etConfirmPassword.getText().toString();

        if (fullName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            showError("Không được để trống!");
            return;
        }

        if (!email.contains("@")) {
            showError("Email phải chứa ký tự '@'!");
            return;
        }

        if (password.length() < 6) {
            showError("Mật khẩu phải từ 6 ký tự trở lên!");
            return;
        }

        if (!password.equals(confirmPassword)) {
            showError("Hai mật khẩu không trùng khớp!");
            return;
        }

        // Collect information
        int selectedGenderId = rgGender.getCheckedRadioButtonId();
        RadioButton rbSelectedGender = findViewById(selectedGenderId);
        String gender = rbSelectedGender.getText().toString();

        ArrayList<String> hobbies = new ArrayList<>();
        if (cbMusic.isChecked()) hobbies.add("Nghe nhạc");
        if (cbSports.isChecked()) hobbies.add("Chơi thể thao");
        if (cbReading.isChecked()) hobbies.add("Đọc sách");

        // Navigate to Activity 2
        Intent intent = new Intent(this, Bai1Activity2.class);
        intent.putExtra("fullName", fullName);
        intent.putExtra("email", email);
        intent.putExtra("gender", gender);
        intent.putStringArrayListExtra("hobbies", hobbies);
        startActivity(intent);
    }

    private void showError(String message) {
        new AlertDialog.Builder(this)
                .setTitle("Lỗi")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();
    }
}