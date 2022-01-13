package com.example.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recpedia.databinding.ActivityWorkshopBinding;

public class workshop extends AppCompatActivity {
    ActivityWorkshopBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);

        binding= ActivityWorkshopBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/recpedia0301/"));
                startActivity(intent);
            }
        });
    }
}