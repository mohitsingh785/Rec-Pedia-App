package com.example.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recpedia.databinding.ActivityInternshipBinding;

public class internship extends AppCompatActivity {
 ActivityInternshipBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internship);
        binding=ActivityInternshipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.cliclkgere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/10PcyUEz16lIKVC2lrZKLsEKvFQPVdv4G/view"));
                startActivity(intent);
            }
        });
        binding.button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://dare2compete.com/job/campus-ambassador-internship-rewa-engineering-college-rec-rewa-madhya-pradesh-166070"));
                startActivity(intent);
            }
        });
        binding.button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://internshala.com/internship/detail/campus-ambassador-programme-at-rec-pedia1621263914"));
                startActivity(intent);
            }
        });
    }
}