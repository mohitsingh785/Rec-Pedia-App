package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityEventandcpmtetionBinding;

public class eventandcpmtetion extends AppCompatActivity {
ActivityEventandcpmtetionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventandcpmtetion);
        Intent event =getIntent();
        binding=ActivityEventandcpmtetionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.recpedia.org/events-competitions"));
                startActivity(intent);
            }
        });
    }
}