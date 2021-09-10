package com.riyagung.kalkulatorku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Kalkulator Keren");

        EditText angkaPertama = findViewById(R.id.angkaPertama);
        EditText angkaKedua = findViewById(R.id.angkaKedua);
        Button tambah = findViewById(R.id.btnTambah);
        Button kurang = findViewById(R.id.btnKurang);
        Button kali = findViewById(R.id.btnKali);
        Button bagi = findViewById(R.id.btnBagi);
        Button bersihkan = findViewById(R.id.btnBersihkan);
        TextView hasil = findViewById(R.id.Hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angkaPertama.getText().length() > 0 & angkaKedua.getText().length() > 0)) {
                    double angka1  = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2  = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan angka pertama dan angka kedua terlebih dahulu",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angkaPertama.getText().length() > 0 & angkaKedua.getText().length() > 0)) {
                    double angka1  = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2  = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan angka pertama dan angka kedua terlebih dahulu",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angkaPertama.getText().length() > 0 & angkaKedua.getText().length() > 0)) {
                    double angka1  = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2  = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan angka pertama dan angka kedua terlebih dahulu",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((angkaPertama.getText().length() > 0 & angkaKedua.getText().length() > 0)) {
                    double angka1  = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2  = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }else{
                    Toast toast = Toast.makeText(MainActivity.this, "Masukkan angka pertama dan angka kedua terlebih dahulu",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angkaPertama.setText("");
                angkaKedua.setText("");
                hasil.setText("0");
            }
        });
    }
}