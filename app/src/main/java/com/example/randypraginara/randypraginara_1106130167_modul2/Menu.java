package com.example.randypraginara.randypraginara_1106130167_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    RecyclerView rv;
    Menuadapter adapter;
    List<pilihanmenu> listmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.list_menu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }
    private void initdata(){
        listmenu.add(new pilihanmenu(R.drawable.pempekadaan, "pempek adaan", 15000, "terigu , daging ikan"));
        listmenu.add(new pilihanmenu(R.drawable.pempekkapalselam, "pempek kapal selam", 13500, "telor, terigu, daging ikan"));
        listmenu.add(new pilihanmenu(R.drawable.pempekkecil, "pempek kecil", 20000, "terigu, daging ikan"));
        listmenu.add(new pilihanmenu(R.drawable.pempekkulit, "pempek kulit", 17000, "daging ikan, terigu"));
        listmenu.add(new pilihanmenu(R.drawable.pempeklenggang, "pempek lenggang", 50000, "terigu, daging ikan, telor kocok"));
        adapter = new Menuadapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}

