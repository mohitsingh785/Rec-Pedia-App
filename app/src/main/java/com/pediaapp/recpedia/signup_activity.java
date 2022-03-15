package com.pediaapp.recpedia;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivitySignupActivityBinding;
import com.pediaapp.recpedia.ui.Models.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class signup_activity extends AppCompatActivity {
     ActivitySignupActivityBinding binding;
    private FirebaseAuth auth;
     FirebaseDatabase database;
     ProgressDialog progessdialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_activity);
        Intent intent=getIntent();
        getSupportActionBar().hide();
        binding=ActivitySignupActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth=FirebaseAuth.getInstance();
        database=FirebaseDatabase.getInstance();
        progessdialog=new ProgressDialog(signup_activity.this);
        progessdialog.setTitle("Creating Account");
        progessdialog.setMessage("We're Creating your account");


        binding.signupButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String email=binding.signupEmail.getText().toString();
              String name=binding.sighupName.getText().toString();
              String password=binding.signupPassword.getText().toString();
              if (email.isEmpty() || password.isEmpty() || name.isEmpty()){
                  Toast.makeText(signup_activity.this, "Please fill the following Information", Toast.LENGTH_SHORT).show();
              }
              else {
                  progessdialog.show();
                  auth.createUserWithEmailAndPassword(binding.signupEmail.getText().toString(),binding.signupPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                      @Override
                      public void onComplete(@NonNull Task<AuthResult> task) {
                          progessdialog.dismiss();
                          if (task.isSuccessful()){
                              User users=new User(binding.sighupName.getText().toString(),binding.signupEmail.getText().toString(),binding.signupPassword.getText().toString());
                              String id=task.getResult().getUser().getUid();
                              database.getReference().child("User").child(id).setValue(users);
                              Toast.makeText(signup_activity.this, "User Created Suceesfully", Toast.LENGTH_SHORT).show();
                          }
                          else {
                              Toast.makeText(signup_activity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                          }
                      }
                  });
              }
            }
        });

        binding.signupAlreadyhaveaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(signup_activity.this,signin_activity.class);
                startActivity(intent1);
            }
        });

    }
}