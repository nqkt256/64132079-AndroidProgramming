package com.example.ex5_addsubmuldiv_anynomous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng gắn vơ đkhiển tương ứng
    EditText edtS1;
    EditText edtS2;
    EditText edtKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien(){
        edtS1 = findViewById(R.id.edtSo1);
        edtS2 = findViewById(R.id.edtSo2);
        edtKQ = findViewById(R.id.edtKetQua);
        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        // Cách 1: khai báo biến tường minh
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soThuNhat = edtS1.getText().toString();
                String soThuHai = edtS2.getText().toString();
                float s1 = Float.parseFloat(soThuNhat);
                float s2 = Float.parseFloat(soThuHai);
                float Tong = s1 + s2;
                String KQ = String.valueOf(Tong);
                edtKQ.setText(KQ);
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        //Cách 2: Ẩn danh (không cần khai báo biến)
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soThuNhat = edtS1.getText().toString();
                String soThuHai = edtS2.getText().toString();
                float s1 = Float.parseFloat(soThuNhat);
                float s2 = Float.parseFloat(soThuHai);
                float Hieu = s1 - s2;
                String KQ = String.valueOf(Hieu);
                edtKQ.setText(KQ);
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soThuNhat = edtS1.getText().toString();
                String soThuHai = edtS2.getText().toString();
                float s1 = Float.parseFloat(soThuNhat);
                float s2 = Float.parseFloat(soThuHai);
                float Tich = s1 * s2;
                String KQ = String.valueOf(Tich);
                edtKQ.setText(KQ);
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XULY_CHIA(); // dùng gọi hàm
            }
        });
    }

    void XULY_CHIA(){
        String soThuNhat = edtS1.getText().toString();
        String soThuHai = edtS2.getText().toString();
        float s1 = Float.parseFloat(soThuNhat);
        float s2 = Float.parseFloat(soThuHai);
        float Thuong = s1 / s2;
        String KQ = String.valueOf(Thuong);
        edtKQ.setText(KQ);
    }
}