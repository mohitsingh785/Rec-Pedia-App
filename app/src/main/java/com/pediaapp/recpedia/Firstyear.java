package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityFirstyearBinding;

public class Firstyear extends AppCompatActivity {
ActivityFirstyearBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding= ActivityFirstyearBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
    binding.mathdown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1q-Y7LwT2RrKqQXg1IO4NFkaZdUnj0fhH/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.csmedown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1rw69A3BojFhifaIBgYO3cnmHFyx8VO-I/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.medown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1rg8qw2XHD2fl4nvWgmEBL8TS68eQmESG/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.csdown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1reCo1gzG4860CaxWh3l7koeFd-uAJiMC/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.physicsdown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1rO_m9nX-VW5JiDj6fTu3E5g9sEUjBVQ7/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.physicsdown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1rO_m9nX-VW5JiDj6fTu3E5g9sEUjBVQ7/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.mathseconddown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1rUZ9mrzpk3vd4E-zWO8Lz6f9z8q5SY9b/view?usp=drivesdk"));
            startActivity(intent);
        }
    });
    binding.eesdown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1qWMPL079U0XBhCsY_L6qHOKci2VBdo4H/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.egdown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1qzY46z8t32_sg8B7VzhvT6jH9M_Xj2tW/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.chemistrydown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1pL6311Hk0N2gWUhQZkJ8_0sd8CmrITkU/view?usp=sharing"));
            startActivity(intent);
        }
    });
    binding.englishdown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://drive.google.com/file/d/1qINh5d3hZ1dH1GLgVbIbBkHse5nSJ_ps/view?usp=sharing"));
            startActivity(intent);
        }
    }); binding.downloadsyallbus.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/1130919100717.pdf"));
            startActivity(intent);
        }
    });
    }
}