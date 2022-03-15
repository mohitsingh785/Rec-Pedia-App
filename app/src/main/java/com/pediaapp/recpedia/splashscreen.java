package com.pediaapp.recpedia;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivitySplashscreenBinding;

public class splashscreen extends AppCompatActivity {
ActivitySplashscreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySplashscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();;
        Thread thread=new Thread(){

            @RequiresApi(api = Build.VERSION_CODES.Q)
            public void run() {
              try {


                  sleep(2000);

              }
              catch (Exception e){
               e.printStackTrace();
              }
              finally {
                  Intent intent =new Intent(splashscreen.this,signin_activity.class);
                 startActivity(intent);
              }
            }
        };
        thread.start();

    }
}