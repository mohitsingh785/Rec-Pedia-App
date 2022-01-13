package com.example.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recpedia.databinding.ActivityCovid19SupportBinding;

public class covid19_support extends AppCompatActivity {
  ActivityCovid19SupportBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid19_support);
        binding= ActivityCovid19SupportBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.recpedia.org/contact"));
                startActivity(intent);
            }
        });
    }
}