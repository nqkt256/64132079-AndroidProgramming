package com.example.ex_sqllite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase csdl;
    ArrayList<String> dsTenSach;
    ListView listViewSACH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewSACH = findViewById(R.id.lvSAch);
        dsTenSach = new ArrayList<>();

        // 1. Mở hoặc tạo database
        csdl = openOrCreateDatabase("qlSach.db", MODE_PRIVATE, null);

        // 2. Tạo bảng (nếu chưa có)
        String sqlXoaBangSach = "DROP TABLE IF EXISTS BOOKS";
        String sqlTaoBangSach = "CREATE TABLE BOOKS (BookID INTEGER PRIMARY KEY, BookName TEXT, Page INTEGER, Price FLOAT, Description TEXT)";
        csdl.execSQL(sqlXoaBangSach);
        csdl.execSQL(sqlTaoBangSach);

        // (Có thể thêm dữ liệu mẫu nếu cần)
        String sqlThemSach1 = "INSERT INTO BOOKS VALUES(1, 'Lập trình Android', 300, 150.0, 'Giáo trình cơ bản')";
        String sqlThemSach2 = "INSERT INTO BOOKS VALUES(2, 'Java Cơ Bản', 400, 200.0, 'Học Java từ đầu')";
        csdl.execSQL(sqlThemSach1);
        csdl.execSQL(sqlThemSach2);


        // 3. Đọc dữ liệu
        String sqlSelect = "SELECT * FROM BOOKS";
        Cursor rs = csdl.rawQuery(sqlSelect, null);

        while (rs.moveToNext()) {
            String ten_sach = rs.getString(1); // cột thứ 1 là BookName
            dsTenSach.add(ten_sach);
        }

        // 4. Gắn dữ liệu vào ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, dsTenSach);
        listViewSACH.setAdapter(adapter);
    }
}
