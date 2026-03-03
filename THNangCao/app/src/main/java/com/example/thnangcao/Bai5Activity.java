package com.example.thnangcao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Bai5Activity extends AppCompatActivity {
    private RadioGroup rgQ1, rgQ2, rgQ3, rgQ4, rgQ5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai5_activity);

        rgQ1 = findViewById(R.id.rgQ1);
        rgQ2 = findViewById(R.id.rgQ2);
        rgQ3 = findViewById(R.id.rgQ3);
        rgQ4 = findViewById(R.id.rgQ4);
        rgQ5 = findViewById(R.id.rgQ5);
        Button btnSubmit = findViewById(R.id.btnSubmitQuiz);

        btnSubmit.setOnClickListener(v -> {
            if (rgQ1.getCheckedRadioButtonId() == -1 || rgQ2.getCheckedRadioButtonId() == -1 ||
                rgQ3.getCheckedRadioButtonId() == -1 || rgQ4.getCheckedRadioButtonId() == -1 ||
                rgQ5.getCheckedRadioButtonId() == -1) {
                Toast.makeText(this, "Vui lòng trả lời đầy đủ các câu hỏi!", Toast.LENGTH_SHORT).show();
                return;
            }

            int score = 0;
            if (rgQ1.getCheckedRadioButtonId() == R.id.q1b) score += 2;
            if (rgQ2.getCheckedRadioButtonId() == R.id.q2b) score += 2;
            if (rgQ3.getCheckedRadioButtonId() == R.id.q3b) score += 2;
            if (rgQ4.getCheckedRadioButtonId() == R.id.q4a) score += 2;
            if (rgQ5.getCheckedRadioButtonId() == R.id.q5b) score += 2;

            String rank = "";
            if (score <= 4) rank = "Yếu";
            else if (score <= 7) rank = "Trung bình";
            else rank = "Tốt";

            new AlertDialog.Builder(this)
                    .setTitle("Kết quả bài làm")
                    .setMessage("Điểm số: " + score + "/10\nNhận xét: " + rank)
                    .setPositiveButton("Làm lại", (dialog, which) -> resetQuiz())
                    .setNegativeButton("Thoát", (dialog, which) -> finish())
                    .show();
        });
    }

    private void resetQuiz() {
        rgQ1.clearCheck();
        rgQ2.clearCheck();
        rgQ3.clearCheck();
        rgQ4.clearCheck();
        rgQ5.clearCheck();
    }
}