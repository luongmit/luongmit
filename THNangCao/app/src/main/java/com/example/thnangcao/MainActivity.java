package com.example.thnangcao;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnBai1).setOnClickListener(v -> startActivity(new Intent(this, Bai1Activity1.class)));
        findViewById(R.id.btnBai2).setOnClickListener(v -> startActivity(new Intent(this, Bai2Activity1.class)));
        findViewById(R.id.btnBai3).setOnClickListener(v -> startActivity(new Intent(this, Bai3Activity1.class)));
        findViewById(R.id.btnBai4).setOnClickListener(v -> startActivity(new Intent(this, Bai4Activity.class)));
        findViewById(R.id.btnBai5).setOnClickListener(v -> startActivity(new Intent(this, Bai5Activity.class)));
        findViewById(R.id.btnBai6).setOnClickListener(v -> startActivity(new Intent(this, Bai6Activity.class)));
        findViewById(R.id.btnBai7).setOnClickListener(v -> startActivity(new Intent(this, Bai7Activity1.class)));
        findViewById(R.id.btnBai8).setOnClickListener(v -> startActivity(new Intent(this, Bai8Activity.class)));
        findViewById(R.id.btnBai9).setOnClickListener(v -> startActivity(new Intent(this, Bai9Activity.class)));
        findViewById(R.id.btnBai10).setOnClickListener(v -> startActivity(new Intent(this, Bai10Activity1.class)));
    }
}