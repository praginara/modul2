package com.example.randypraginara.randypraginara_1106130167_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {
    ImageView gambar;
    TextView nama, harga, komposisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        setTitle("Detail Menu");

        gambar = findViewById(R.id.detail_gambar);
        nama = findViewById(R.id.detail_nama);
        harga = findViewById(R.id.detail_harga);
        komposisi = findViewById(R.id.detail_komposisi);

        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("gambar"))));
        nama.setText(getIntent().getStringExtra("nama"));
        harga.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisi"));
    }
}

