package com.example.th2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText edtUsername, edtPassword;
    private RadioGroup rgBaitap;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        rgBaitap = findViewById(R.id.rgBaitap);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            String user = edtUsername.getText().toString().trim();
            String pass = edtPassword.getText().toString().trim();

            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                return;
            }

            if (user.equals("admin") && pass.equals("123456")) {
                int checkedId = rgBaitap.getCheckedRadioButtonId();
                Intent intent;
                if (checkedId == R.id.rbBai1) {
                    intent = new Intent(this, Bai1Activity.class);
                } else if (checkedId == R.id.rbBai2) {
                    intent = new Intent(this, Bai2Activity.class);
                } else {
                    intent = new Intent(this, Bai3Activity.class);
                }
                startActivity(intent);
            } else {
                Toast.makeText(this, "Sai tên đăng nhập hoặc mật khẩu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}