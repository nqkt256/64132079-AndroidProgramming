package com.example.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XuLyCong(View view){
        //Bước 1: Tìm và tham chiếu đến các điều khiển ở .xml
        EditText editTextA = findViewById(R.id.edtA);
        EditText editTextB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKetQua);

        //Bước 2: Lấy dữ liệu
        // Lấy dữ liệu ở đk số A
        String strA = editTextA.getText().toString();
        // Lấy dữ liệu ở đk số B
        String strB = editTextB.getText().toString();

        //Bước 3: Chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        //Bước 4: Tính toán theo yêu cầu
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong); // Chuyển về dạng chuỗi

        //Bước 5: Hiển thi ra màn hình
        editTextKetQua.setText(strTong);
    }
}