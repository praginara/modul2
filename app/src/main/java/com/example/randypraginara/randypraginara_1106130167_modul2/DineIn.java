package com.example.randypraginara.randypraginara_1106130167_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    Spinner meja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        setTitle("Dine In");
        meja = findViewById(R.id.nomor_meja);
    }

    public void lihatinmenu2(View view) {
        Toast.makeText(DineIn.this, meja.getSelectedItem().toString()+" dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(DineIn.this, Menu.class));
        finish();
    }
}
