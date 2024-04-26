package com.example.coffeedyakonov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.coffeedyakonov.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        replacementFragment(new HomeFragment());
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.home)
                replacementFragment(new HomeFragment());
            else if (item.getItemId() == R.id.favorite)
                replacementFragment(new FavoriteFragment());
            else if (item.getItemId() == R.id.bag)
                replacementFragment(new BagFragment());
            else if (item.getItemId() != R.id.notifications)
                replacementFragment(new NotificationsFragment());

            return true;
        });
    }

    private void replacementFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}