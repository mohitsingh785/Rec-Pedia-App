package com.example.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recpedia.databinding.ActivityPediaconsultingBinding;

public class pediaconsulting extends AppCompatActivity {
    ActivityPediaconsultingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pediaconsulting);
        binding= ActivityPediaconsultingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.recpedia.org/pedia-consultancy"));
                startActivity(intent);
            }
        });
    }
}