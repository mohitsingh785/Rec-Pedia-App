package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityTalentShoutoutBinding;

public class talent_shoutout extends AppCompatActivity {
 ActivityTalentShoutoutBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talent_shoutout);
        binding= ActivityTalentShoutoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.shoutoutbuttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/p/CBiyLgOpsuD/?utm_source=ig_web_copy_link"));
                startActivity(intent);
            }
        });
    }
}