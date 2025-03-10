package com.example.ex7_loginintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tìm ĐK
        Button btnDangNhap = findViewById(R.id.btnLogin);
        //Sự kiện
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Lệnh xử lý
                Intent iLogin = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(iLogin);

            }
        });
    }
}