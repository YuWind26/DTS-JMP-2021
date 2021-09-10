package com.riyagung.aplikasilistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private final String[] namaMakanan = new String[]{
                "Nasi Padang", "Nasi Goreng" , "Nasi Ayam Kecap", "Nasi Uduk",
                "Nasi Sambal Ikan", "Nasi Kucing" , "Nasi Terasi", "Nasi Kerupuk",
                "Nasi Sambal Matah", "Nasi Sambal Ijo", "Nasi Lele", "Nasi Kecap" ,
                "Nasi Gila" , "Nasi Mantap", "Nasi Jalapeno" ,"Nasi Hangat" , "Nasi Adem"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Aplikasi Pilih Makanan Favorit");

        ListView lvItem = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1 ,
                android.R.id.text1, namaMakanan);

        lvItem.setAdapter(adapter);
        lvItem.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(MainActivity.this,"Kamu Menyukai " + namaMakanan[i],Toast.LENGTH_LONG).show());
    }
}