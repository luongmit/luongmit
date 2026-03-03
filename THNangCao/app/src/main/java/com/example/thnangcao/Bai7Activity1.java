package com.example.thnangcao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Bai7Activity1 extends AppCompatActivity {
    private EditText etGuestName, etIDCard, etStayDays;
    private RadioGroup rgRoomType;
    private CheckBox cbBreakfast, cbLaundry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai7_activity1);

        etGuestName = findViewById(R.id.etGuestName);
        etIDCard = findViewById(R.id.etIDCard);
        etStayDays = findViewById(R.id.etStayDays);
        rgRoomType = findViewById(R.id.rgRoomType);
        cbBreakfast = findViewById(R.id.cbBreakfast);
        cbLaundry = findViewById(R.id.cbLaundry);
        Button btnBook = findViewById(R.id.btnBookRoom);

        btnBook.setOnClickListener(v -> {
            String name = etGuestName.getText().toString().trim();
            String idCard = etIDCard.getText().toString().trim();
            String daysStr = etStayDays.getText().toString().trim();

            if (name.isEmpty() || idCard.isEmpty() || daysStr.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                return;
            }

            int days = Integer.parseInt(daysStr);
            long roomPrice = 0;
            String roomType = "";
            int selectedId = rgRoomType.getCheckedRadioButtonId();
            if (selectedId == R.id.rbStandard) {
                roomPrice = 300000;
                roomType = "Standard";
            } else if (selectedId == R.id.rbDeluxe) {
                roomPrice = 500000;
                roomType = "Deluxe";
            } else if (selectedId == R.id.rbSuite) {
                roomPrice = 800000;
                roomType = "Suite";
            }

            long servicePrice = 0;
            String services = "";
            if (cbBreakfast.isChecked()) {
                servicePrice += 50000 * days;
                services += "Ăn sáng, ";
            }
            if (cbLaundry.isChecked()) {
                servicePrice += 30000 * days;
                services += "Giặt ủi";
            }
            if (services.endsWith(", ")) services = services.substring(0, services.length() - 2);
            if (services.isEmpty()) services = "Không";

            long total = (roomPrice * days) + servicePrice;
            long discount = 0;
            if (days > 5) {
                discount = (long) (total * 0.1);
                total -= discount;
            }

            Intent intent = new Intent(this, Bai7Activity2.class);
            intent.putExtra("name", name);
            intent.putExtra("idCard", idCard);
            intent.putExtra("roomType", roomType);
            intent.putExtra("days", days);
            intent.putExtra("services", services);
            intent.putExtra("discount", discount);
            intent.putExtra("total", total);
            startActivity(intent);
        });
    }
}