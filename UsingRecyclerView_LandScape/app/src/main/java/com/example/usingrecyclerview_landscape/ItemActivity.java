package com.example.usingrecyclerview_landscape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {
    ImageView imgLand;
    TextView captionLand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        imgLand = findViewById(R.id.itemImageView);
        captionLand = findViewById(R.id.itemTextView);

        String tenAnh = getIntent().getStringExtra("title");
        int hinhAnh = getIntent().getIntExtra("imageResId", 0);

        imgLand.setImageResource(hinhAnh);
        captionLand.setText(tenAnh);

    }
}