package com.example.ex5_addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tìm View
        TimView();
        btnCong.setOnClickListener(boLangNghe_XulyCong);
        btnTru.setOnClickListener(boLangNghe_XulyTru);
        btnNhan.setOnClickListener(boLangNghe_XulyNhan);
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strS1 = edtSA.getText().toString();
                String strS2 = edtSB.getText().toString();
                double soA = Double.parseDouble(strS1);
                double soB = Double.parseDouble(strS2);
                double thuong = soA / soB;
                String strKQ = String.valueOf(thuong);
                tvKQua.setText(strKQ);
            }
        });
    }
    //-------------------------
    //Tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener boLangNghe_XulyCong = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String strS1 = edtSA.getText().toString();
            String strS2 = edtSB.getText().toString();
            double soA = Double.parseDouble(strS1);
            double soB = Double.parseDouble(strS2);
            double tong = soA + soB;
            String strKQ = String.valueOf(tong);
            tvKQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XulyTru = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String strS1 = edtSA.getText().toString();
            String strS2 = edtSB.getText().toString();
            double soA = Double.parseDouble(strS1);
            double soB = Double.parseDouble(strS2);
            double hieu = soA - soB;
            String strKQ = String.valueOf(hieu);
            tvKQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XulyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String strS1 = edtSA.getText().toString();
            String strS2 = edtSB.getText().toString();
            double soA = Double.parseDouble(strS1);
            double soB = Double.parseDouble(strS2);
            double tich = soA * soB;
            String strKQ = String.valueOf(tich);
            tvKQua.setText(strKQ);
        }
    };

    //------------------------

    void TimView(){
        edtSA = findViewById(R.id.edtSoA);
        edtSB = findViewById(R.id.edtSoB);
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        tvKQua = findViewById(R.id.tvKetQua);
    }
    //Khai báo đối tượng ứng với các điều khiển (view) cần thao tác
    EditText edtSA;
    EditText edtSB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKQua;
}