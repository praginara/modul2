package com.example.randypraginara.randypraginara_1106130167_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class tampilanawal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_awal);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(tampilanawal.this, pilihmenu.class));
                Toast.makeText(tampilanawal.this, "Randy Praginara 1106130167", Toast.LENGTH_SHORT).show();
                finish();
            }
        }, 2000);
    }
}
