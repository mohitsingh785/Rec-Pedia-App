package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityNoticeandupdateBinding;

public class noticeandupdate extends AppCompatActivity {
ActivityNoticeandupdateBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticeandupdate);
        Intent intent=getIntent();
        binding=ActivityNoticeandupdateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.recentActvity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.recpedia.org/notice-updates"));
                startActivity(intent);
            }
        });
    }
}