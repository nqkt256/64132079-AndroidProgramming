package com.example.ex6_intentdongian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button nutMH2, nutMH3;
    void TimDieuKhien(){
        Button nutMH2 = findViewById(R.id.btnMH2);
        Button nutMH3 = findViewById(R.id.btnMH3);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tìm điều khiển nút bấm
        TimDieuKhien();
        //Gắn bộ lắng nghe sự kiện:
        nutMH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý chuyển màn hình
                //B1. Tạo Intent 2 tham số: I. Màn hình hiện tại.this, II. Màn hin chuyển tới.class
                Intent intentMH2 = new Intent(MainActivity.this, MH2Activity.class);
                //B2. Gửi
                startActivity(intentMH2);
            }
        });

        nutMH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lý chuyển màn hình
                //B1. Tạo Intent 2 tham số: I. Màn hình hiện tại.this, II. Màn hin chuyển tới.class
                Intent intentMH3 = new Intent(MainActivity.this, MH3Activity.class);
                //B2. Gửi
                startActivity(intentMH3);
            }
        });
    }


}