package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivitySecondyearBinding;

public class secondyear extends AppCompatActivity {
ActivitySecondyearBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySecondyearBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.medecondyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1uCUsJ7f_GzVCtEmz-cUUS8GBrhKNB43W/view?usp=sharing"));
                startActivity(intent);
            }
        });
        binding.cedecondyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1u5ToOrbH3HSLyV78-DvFBhVaqBPT6rLc/view?usp=sharing"));
                startActivity(intent);
            }
        }); binding.eedecondyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(secondyear.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        }); binding.ecdecondyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1u5MuBHCL1yxzLEdTAKTCIo6BOzaTzcMU/view?usp=sharing\n"));
                startActivity(intent);
            }
        }); binding.csdecondyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1uA9HSZd48uQr2TPN-LHQW3h8yXo3BXDe/view?usp=sharing"));
                startActivity(intent);
            }
        });

    }
}