package com.pediaapp.recpedia;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pediaapp.recpedia.databinding.ActivitySigninActivityBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signin_activity extends AppCompatActivity {
    ActivitySigninActivityBinding binding;
    FirebaseAuth auth;
    ProgressDialog progessdialog,progressDialogreset;
    Animation scaleup,scaledown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_activity);
        getSupportActionBar().hide();
        Intent intent=getIntent();
        scaleup= AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown= AnimationUtils.loadAnimation(this,R.anim.scale_down);
        binding= ActivitySigninActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth=FirebaseAuth.getInstance();
        progessdialog=new ProgressDialog(signin_activity.this);
        progessdialog.setTitle("Login Account");
        progessdialog.setMessage("Login to your Account");
        progressDialogreset=new ProgressDialog(signin_activity.this);
        progressDialogreset.setTitle("Reset Password ");
        progressDialogreset.setMessage("Sending Mail");
        binding.signinButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=binding.signinEmail.getText().toString();
                String password=binding.signinPassword.getText().toString();
                if (email.isEmpty() || password.isEmpty()){
                    Toast.makeText(signin_activity.this, "Please Fill the information", Toast.LENGTH_SHORT).show();
                }
                else {
                    progessdialog.show();
                    auth.signInWithEmailAndPassword(binding.signinEmail.getText().toString(),binding.signinPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progessdialog.dismiss();
                            if (task.isSuccessful()){
                                Intent intent1=new Intent(signin_activity.this,MainActivity.class);
                                startActivity(intent1);
                            }
                            else {
                                Toast.makeText(signin_activity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
        binding.forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText resetmail=new EditText(v.getContext());
                AlertDialog.Builder passwordResetDialog=new AlertDialog.Builder(v.getContext());
                passwordResetDialog.setTitle("Reset Password ?");
                passwordResetDialog.setMessage("Enter Your Email To Received Reset Link.");
                passwordResetDialog.setView(resetmail);
                passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        Extract the email and send reset Link
                        progressDialogreset.show();
                    String mail=resetmail.getText().toString();
                    auth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(signin_activity.this,"Reset Link Sent To Your Email.",Toast.LENGTH_SHORT).show();
                            progressDialogreset.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            progressDialogreset.dismiss();
                            Toast.makeText(signin_activity.this,"Error ! Reset Link is Not Sent "+e.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    });
                    }
                });
                passwordResetDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//             Closing Dialog
                    }
                });
                passwordResetDialog.create().show();
            }
        });
        binding.signinRegisteryourself.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(signin_activity.this,signup_activity.class);
                startActivity(intent1);
            }
        });
        if (auth.getCurrentUser()!=null){
            Intent intent1=new Intent(signin_activity.this,MainActivity.class);
            startActivity(intent1);
        }
    }
}