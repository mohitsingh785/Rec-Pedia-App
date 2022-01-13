package com.example.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recpedia.databinding.ActivityPediatalksBinding;

public class pediatalks extends AppCompatActivity {
ActivityPediatalksBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pediatalks);
        binding=ActivityPediatalksBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/tv/CNkny43DvEH/?utm_source=ig_web_copy_link"));
                startActivity(intent);
            }
        });
    }
}