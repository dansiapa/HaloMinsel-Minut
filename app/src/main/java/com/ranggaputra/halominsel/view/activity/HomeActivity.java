package com.ranggaputra.halominsel.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ranggaputra.halominsel.R;
import com.ranggaputra.halominsel.view.fragment.AboutFragment;
import com.ranggaputra.halominsel.view.fragment.BerandaFragment;
import com.ranggaputra.halominsel.view.fragment.HelpFragment;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView menu_bawah;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);





            //bottom nav
            menu_bawah = findViewById(R.id.bottom_menu_navigation);
            menu_bawah.setOnNavigationItemSelectedListener(HomeActivity.this);

            //home fragment as main fragment
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_bottommenunav, new BerandaFragment()).commit();
        }

        Fragment fragment = null;

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.beranda:
                fragment = new BerandaFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fl_bottommenunav, fragment);
                fragmentTransaction.commit();
                break;

            case R.id.tentang:
                fragment = new AboutFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fl_bottommenunav, fragment);
                fragmentTransaction.commit();
                break;


            case R.id.tatacara:
                fragment = new HelpFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fl_bottommenunav, fragment);
                fragmentTransaction.commit();
                break;
        }
        return true;
    }
}