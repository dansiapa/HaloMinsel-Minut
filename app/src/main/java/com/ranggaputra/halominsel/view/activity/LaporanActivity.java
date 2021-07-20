package com.ranggaputra.halominsel.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ranggaputra.halominsel.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaporanActivity extends AppCompatActivity {

    private ImageView btn_back;
    private Button btn_simpan;
    private Spinner spinnerKategori;
    private String items[] = new String[] {"Pilih Kategori Laporan","Pengaduan","Aspirasi","Permintaan Informasi"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);

        btn_back = findViewById(R.id.btn_back);
        btn_simpan = findViewById(R.id.btn_simpan);
        spinnerKategori = findViewById(R.id.spinnerKategori);

        btn_back.setOnClickListener(v -> {
            onBackPressed();
            finish();
        });
        btn_simpan.setOnClickListener(v -> {
            Intent laporkan = new Intent (this,HomeActivity.class);
            Toast.makeText(this, "Laporan Anda Telah terkirim", Toast.LENGTH_SHORT).show();
            startActivity(laporkan);
        });

        final List<String> listCategory = new ArrayList<>(Arrays.asList(items));

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,R.layout.spinner_item_category,listCategory){
            @Override
            public boolean isEnabled(int position){
                if(position == 0)
                {
                    return false;
                }
                else
                {
                    return true;
                }
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                }
                else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        adapter.setDropDownViewResource(R.layout.spinner_item_category);
        spinnerKategori.setAdapter(adapter);

        spinnerKategori.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);
                if(position > 0){
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}