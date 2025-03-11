package com.example.vd_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewMH;
    ArrayList<String> dsMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewMH = findViewById(R.id.lvMH);

        //B1. Chuẩn bị dữ liệu, hard code
        dsMonHoc = new ArrayList<String>();
        dsMonHoc.add("Lập trình thiết bị di động");
        dsMonHoc.add("Nguyên lý học máy");
        dsMonHoc.add("Linux Server và Quản trị mạng");
        //B2.
        ArrayAdapter<String> adapterMH;
        adapterMH = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsMonHoc);
        //B3.
        listViewMH.setAdapter(adapterMH);
        //B4. Gắn bộ lắng nghe và xử lý sự kiện
        listViewMH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String gtDuocChon = dsMonHoc.get(position);
                Toast.makeText(MainActivity.this, gtDuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}