package com.ranggaputra.halominsel.view.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.ranggaputra.halominsel.R;
import com.ranggaputra.halominsel.view.activity.LaporanActivity;


public class BerandaFragment extends Fragment {

    RelativeLayout kirim;
    View v;
    public BerandaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_beranda, container, false);
        kirim = v.findViewById(R.id.kirim_laporan);

        kirim.setOnClickListener(v -> {
            Intent laporan = new Intent (getActivity(), LaporanActivity.class);
            startActivity(laporan);
        });
        return  v;
    }
}