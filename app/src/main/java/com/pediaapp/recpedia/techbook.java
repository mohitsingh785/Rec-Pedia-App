package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityTechbookBinding;

public class techbook extends AppCompatActivity {
ActivityTechbookBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityTechbookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.techbookdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1vwo1gL5vF0TQNhQBW5N4Zb7Wt8A9Fn-M/view?usp=sharing"));
                startActivity(intent);
            }
        });
    }
}