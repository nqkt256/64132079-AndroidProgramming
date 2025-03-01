package com.example.ex4_addsubmuldiv_onclick;

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
    void TimDieuKhien(){
        edtS1 = findViewById(R.id.edtSo1);
        edtS2 = findViewById(R.id.edtSo2);
        edtKQ = findViewById(R.id.edtKetQua);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }

    //Xử lý cộng
    public void XuLyCong(View view) {
        //Bước 1: Lấy dữ liệu
        //Bước 1.1: Tìm và Tham chiếu dữ liệu

        //Bước 1.2: Lấy dữ liệu từ 2 điều khiển
        String soThuNhat = edtS1.getText().toString();
        String soThuHai = edtS2.getText().toString();
        //Bước 1.3: Chuyển dữ liệu từ chuỗi sang số
        float s1 = Float.parseFloat(soThuNhat);
        float s2 = Float.parseFloat(soThuHai);
        //Bước 2: Tính toán
        float Tong = s1 + s2;
        //Bước 3: Hiển thị kết quả
        //B3.1: Tìm và tham chiếu

        //B3.2: Chuẩn bị dữ liệu xuất => chuyển KQ thành dạng chuỗi
        String KQ = String.valueOf(Tong);
        //B3.3: Gán kết quả lên điều khiển
        edtKQ.setText(KQ);
    }

    //Xử lý trừ
    public void XuLyTru(View view) {
        //Bước 1: Lấy dữ liệu
        //Bước 1.1: Tìm và Tham chiếu dữ liệu

        //Bước 1.2: Lấy dữ liệu từ 2 điều khiển
        String soThuNhat = edtS1.getText().toString();
        String soThuHai = edtS2.getText().toString();
        //Bước 1.3: Chuyển dữ liệu từ chuỗi sang số
        float s1 = Float.parseFloat(soThuNhat);
        float s2 = Float.parseFloat(soThuHai);
        //Bước 2: Tính toán
        float Hieu = s1 - s2;
        //Bước 3: Hiển thị kết quả
        //B3.1: Tìm và tham chiếu

        //B3.2: Chuẩn bị dữ liệu xuất => chuyển KQ thành dạng chuỗi
        String KQ = String.valueOf(Hieu);
        //B3.3: Gán kết quả lên điều khiển
        edtKQ.setText(KQ);
    }

    //Xử lý nhân
    public void XuLyNhan(View view) {
        //Bước 1: Lấy dữ liệu
        //Bước 1.1: Tìm và Tham chiếu dữ liệu

        //Bước 1.2: Lấy dữ liệu từ 2 điều khiển
        String soThuNhat = edtS1.getText().toString();
        String soThuHai = edtS2.getText().toString();
        //Bước 1.3: Chuyển dữ liệu từ chuỗi sang số
        float s1 = Float.parseFloat(soThuNhat);
        float s2 = Float.parseFloat(soThuHai);
        //Bước 2: Tính toán
        float Tich = s1 * s2;
        //Bước 3: Hiển thị kết quả
        //B3.1: Tìm và tham chiếu

        //B3.2: Chuẩn bị dữ liệu xuất => chuyển KQ thành dạng chuỗi
        String KQ = String.valueOf(Tich);
        //B3.3: Gán kết quả lên điều khiển
        edtKQ.setText(KQ);
    }

    //Xử lý chia
    public void XuLyChia(View view) {
        //Bước 1: Lấy dữ liệu
        //Bước 1.1: Tìm và Tham chiếu dữ liệu

        //Bước 1.2: Lấy dữ liệu từ 2 điều khiển
        String soThuNhat = edtS1.getText().toString();
        String soThuHai = edtS2.getText().toString();
        //Bước 1.3: Chuyển dữ liệu từ chuỗi sang số
        float s1 = Float.parseFloat(soThuNhat);
        float s2 = Float.parseFloat(soThuHai);
        //Bước 2: Tính toán
        float Thuong = s1 / s2;
        //Bước 3: Hiển thị kết quả
        //B3.1: Tìm và tham chiếu

        //B3.2: Chuẩn bị dữ liệu xuất => chuyển KQ thành dạng chuỗi
        String KQ = String.valueOf(Thuong);
        //B3.3: Gán kết quả lên điều khiển
        edtKQ.setText(KQ);
    }
}