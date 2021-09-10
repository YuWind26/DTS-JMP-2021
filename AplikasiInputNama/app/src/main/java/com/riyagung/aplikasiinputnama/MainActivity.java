package com.riyagung.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText TextNama;
    EditText TextNama1;
    EditText TextNama2;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNama = findViewById(R.id.TxtNama);
        TextNama1 = findViewById(R.id.TxtUmur);
        TextNama2 = findViewById(R.id.TxtPoliteknik);
        Hasil = findViewById(R.id.tampilNama);
    }

    public void tampilNama(View view) {
        Hasil.setText("Nama Anda adalah " + TextNama.getText() + ", Umur anda adalah " + TextNama1.getText() + " Tahun " + " Dan Berasal dari " + TextNama2.getText());
        TextNama.getText().clear();
        TextNama1.getText().clear();
        TextNama2.getText().clear();


    }


}