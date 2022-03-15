package com.pediaapp.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivityContestBinding;

public class contest extends AppCompatActivity {
ActivityContestBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest);
        binding=ActivityContestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://docs.google.com/spreadsheets/u/0/d/e/2CAIWO3elBgQQdEaGOTk2PiJCUv-WCo5yRHrbOsjwev0eK_ifPTJE8zXodhuH6i3dGq3cidFqMRvSmkfdcHg/gviz/chartiframe?oid=1731865497"));
                startActivity(intent);
            }
        });
    }
}