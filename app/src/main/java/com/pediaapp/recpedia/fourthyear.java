package com.pediaapp.recpedia;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityFourthyearBinding;

public class fourthyear extends AppCompatActivity {
ActivityFourthyearBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityFourthyearBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.meforthyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fourthyear.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });
        binding.cefourthyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fourthyear.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        }); binding.eeforthyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fourthyear.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        }); binding.ecforthyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fourthyear.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        }); binding.csforthyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(fourthyear.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });
    }
}