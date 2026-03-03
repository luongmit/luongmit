package com.example.th2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabLayout;
import java.util.Locale;

public class Bai3Activity extends AppCompatActivity {
    private TabLayout tabLayout;
    private LinearLayout layoutCtoF, layoutFtoC;
    private EditText edtCelsius, edtFahrenheit;
    private Button btnCalcCtoF, btnClearCtoF, btnCalcFtoC, btnClearFtoC;
    private TextView tvResultCtoF, tvResultFtoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        tabLayout = findViewById(R.id.tabLayout);
        layoutCtoF = findViewById(R.id.layoutCtoF);
        layoutFtoC = findViewById(R.id.layoutFtoC);
        
        edtCelsius = findViewById(R.id.edtCelsius);
        btnCalcCtoF = findViewById(R.id.btnCalcCtoF);
        btnClearCtoF = findViewById(R.id.btnClearCtoF);
        tvResultCtoF = findViewById(R.id.tvResultCtoF);

        edtFahrenheit = findViewById(R.id.edtFahrenheit);
        btnCalcFtoC = findViewById(R.id.btnCalcFtoC);
        btnClearFtoC = findViewById(R.id.btnClearFtoC);
        tvResultFtoC = findViewById(R.id.tvResultFtoC);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    layoutCtoF.setVisibility(View.VISIBLE);
                    layoutFtoC.setVisibility(View.GONE);
                } else {
                    layoutCtoF.setVisibility(View.GONE);
                    layoutFtoC.setVisibility(View.VISIBLE);
                }
            }

            @Override public void onTabUnselected(TabLayout.Tab tab) {}
            @Override public void onTabReselected(TabLayout.Tab tab) {}
        });

        // C -> F logic
        btnCalcCtoF.setOnClickListener(v -> {
            String s = edtCelsius.getText().toString();
            if (s.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
                return;
            }
            double c = Double.parseDouble(s);
            double f = c * 1.8 + 32;
            tvResultCtoF.setText(String.format(Locale.US, "Kết quả: %.2f °F", f));
        });

        btnClearCtoF.setOnClickListener(v -> {
            edtCelsius.setText("");
            tvResultCtoF.setText("Kết quả: ");
        });

        // F -> C logic
        btnCalcFtoC.setOnClickListener(v -> {
            String s = edtFahrenheit.getText().toString();
            if (s.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
                return;
            }
            double f = Double.parseDouble(s);
            double c = (f - 32) / 1.8;
            tvResultFtoC.setText(String.format(Locale.US, "Kết quả: %.2f °C", c));
        });

        btnClearFtoC.setOnClickListener(v -> {
            edtFahrenheit.setText("");
            tvResultFtoC.setText("Kết quả: ");
        });
    }
}