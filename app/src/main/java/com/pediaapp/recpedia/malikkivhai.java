package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityMalikkivhaiBinding;

public class malikkivhai extends AppCompatActivity {
ActivityMalikkivhaiBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malikkivhai);
        binding=ActivityMalikkivhaiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.getasip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/p/CI3Vf4arEKF/?utm_source=ig_web_copy_link"));
                startActivity(intent);
            }
        });
    }
}