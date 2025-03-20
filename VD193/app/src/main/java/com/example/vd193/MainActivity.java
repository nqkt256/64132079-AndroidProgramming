package com.example.vd193;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    Button btnKT, btnS1, btnS2, btnS3, btnS4, btnS5, btnS6, btnS7, btnS8, btnS9;
    EditText edtInp1, edtInp2, edtOut;

    String a, b;
    int randomInt = ThreadLocalRandom.current().nextInt(1,10);
    public

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}