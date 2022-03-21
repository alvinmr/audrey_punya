package com.example.audrey_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int gambar[] = {R.drawable.satu,R.drawable.dua,R.drawable.tiga,R.drawable.empat,R.drawable.lima,R.drawable.enam,R.drawable.tujuh,R.drawable.delapan,R.drawable.sembilan,R.drawable.sepuluh};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.film);
        s2 = getResources().getStringArray(R.array.deskripsi);

        Adapter adapters = new Adapter(this, s1,s2, gambar);
    }
}