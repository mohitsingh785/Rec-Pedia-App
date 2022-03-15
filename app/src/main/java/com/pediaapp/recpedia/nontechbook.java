package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityNontechbookBinding;

public class nontechbook extends AppCompatActivity {
ActivityNontechbookBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityNontechbookBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.nontechdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1r4Rr1tBlhysMGNk96F7Bj3Brz-_8MUmK/view?usp=sharing"));
                startActivity(intent);
            }
        });
    }
}