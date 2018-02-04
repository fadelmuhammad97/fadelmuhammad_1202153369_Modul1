package com.example.fadelmuhammadrizki.fadelmuhammadrizki_1202153369_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String Makanan = intent.getStringExtra("Makanan");
        String jumlahporsi = intent.getStringExtra("jumlahporsi");
        String Rm = intent.getStringExtra("RM");
        TextView textmakanan = findViewById(R.id.NamaMakanan);
        TextView Porsi = findViewById(R.id.Jumlah);
        TextView Reatbos = findViewById(R.id.RumahMakan2);
        TextView Hitung = findViewById(R.id.Jumlah2);
        int A = Integer.parseInt(jumlahporsi);

        int HargaEatbus = 50000 * A;
        String B = String.valueOf(HargaEatbus);

        int C = Integer.parseInt(jumlahporsi);
        int HargaAbnormal = 30000 * C;
        String D = String.valueOf(HargaAbnormal);


        if (Rm.equalsIgnoreCase("EATBUS")) {
            int uang = 65500;
            if (HargaEatbus > uang) {

                textmakanan.setText(Makanan);
                Porsi.setText(jumlahporsi);
                Reatbos.setText(Rm);
                Hitung.setText(B);
                Toast.makeText(this, "Jangan makannya di sini karena uangmu belum cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Makanan);
                Porsi.setText(jumlahporsi);
                Reatbos.setText(Rm);
                Hitung.setText(B);
                Toast.makeText(this, "disini aja makan malamnya brohh", Toast.LENGTH_LONG).show();
            }

        } else {
            int uang = 65500;
            if (HargaAbnormal > uang) {

                textmakanan.setText(Makanan);
                Porsi.setText(jumlahporsi);
                Reatbos.setText(Rm);
                Hitung.setText(D);
                Toast.makeText(this, "Jangan makannya di sini karena uangmu belum cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Makanan);
                Porsi.setText(jumlahporsi);
                Reatbos.setText(Rm);
                Hitung.setText(D);
                Toast.makeText(this, "disini aja makan malamnya brohh", Toast.LENGTH_LONG).show();
            }
        }

    }

}