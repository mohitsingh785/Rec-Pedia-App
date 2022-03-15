package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityThirdyearBinding;

public class thirdyear extends AppCompatActivity {
 ActivityThirdyearBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityThirdyearBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        binding.methirdyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1uJUE_U0B82fEH2CwJyGQhcuBU8MyWM0A/view?usp=sharing"));
                startActivity(intent);
            }
        });
        binding.cethirdyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1u8attwsv-ccCXUNC7ShOVWVGT8ojtYnj/view?usp=sharing"));
                startActivity(intent);
            }
        }); binding.eethirdyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(thirdyear.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        }); binding.ecthirdyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1uD4CUD0eVQMsrODMJMSZ6LCvM4PN9EDs/view?usp=sharing"));
                startActivity(intent);
            }
        }); binding.csethirdyear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1uBJQBYMVts_aVeDbHIHEBosP4E7_rMDt/view?usp=sharing\n"));
                startActivity(intent);
            }
        });
    }
}