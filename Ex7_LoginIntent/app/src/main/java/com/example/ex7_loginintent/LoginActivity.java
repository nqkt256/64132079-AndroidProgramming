package com.example.ex7_loginintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnXacnhan = findViewById(R.id.btnOK);
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edTenDN = findViewById(R.id.edtUsername);
                EditText edPass = findViewById(R.id.edtPass);
                String tenDN = edTenDN.getText().toString();
                String mk = edPass.getText().toString();
                //Kiểm tra mật khẩu
                if (tenDN.equals("kytai") && mk.equals("123")){
                    //Chuyển sang màn hình home
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    iQuiz.putExtra("ten_dang_nhap", tenDN);
                    iQuiz.putExtra("mk_dang_nhap", mk);
                    startActivity(iQuiz);
                }
                else{
                    Toast.makeText(LoginActivity.this, "BẠN NHẬP SAI THÔNG TIN", Toast.LENGTH_LONG);
                }
            }
        });
    }
}