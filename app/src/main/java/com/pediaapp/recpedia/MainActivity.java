package com.pediaapp.recpedia;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
//    ActivityMainBinding binding;
    Animation scaleup,scaledown;
      FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
//        binding= ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        auth=FirebaseAuth.getInstance();
        Toolbar toolbar = findViewById(R.id.toolbar);
        scaleup= AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown= AnimationUtils.loadAnimation(this,R.anim.scale_down);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery,R.id.contactus3,R.id.aboutus,R.id.joinourteam2,R.id.academics,R.id.ELIBRARY,R.id.antiragging,R.id.videolecture,R.id.rgpvlogin)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public void onBackPressed() {

        Dialog dialog=new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.layout_exit);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.getWindow().setWindowAnimations(R.style.animationfordialog);
        ImageView closebtn;
        closebtn=dialog.findViewById(R.id.closelogout);
        Button exit;
        exit=dialog.findViewById(R.id.surelogout);
        Button no;
        no=dialog.findViewById(R.id.No);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
            }
        });
        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
//        AlertDialog.Builder builder=new AlertDialog.Builder(this);
//        builder.setMessage("Are You Sure To Exit ?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                finishAffinity();
//                System.exit(0);
//            }
//        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.cancel();
//            }
//        });
//        AlertDialog alertDialog= builder.create();
//        alertDialog.show();
////        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

//
public void know_more(View view){
    Intent intent=new Intent(this,MainActivity2.class);
    startActivity(intent);
};
 public void noticeupdate(View view){
        Intent intent=new Intent(this,noticeandupdate.class);
        startActivity(intent);
    };
 public void talent_shoutouts(View view){
        Intent intent=new Intent(this,talent_shoutout.class);
        startActivity(intent);
    };
 public void factcheck(View view){
        Intent intent=new Intent(this,fact_check.class);
        startActivity(intent);
    };
 public void covid(View view){
        Intent intent=new Intent(this,covid19_support.class);
        startActivity(intent);
    };
 public void malik_ki_chai(View view){
        Intent intent=new Intent(this,malikkivhai.class);
        startActivity(intent);
    };
 public void pedis_plus(View view){
        Intent intent=new Intent(this,pediaplus.class);
        startActivity(intent);
    };
 public void pedia_talks(View view){
        Intent intent=new Intent(this,pediatalks.class);
        startActivity(intent);
    };
 public void contests(View view){
        Intent intent=new Intent(this,contest.class);
        startActivity(intent);
    };
 public void internship(View view){
        Intent intent=new Intent(this,internship.class);
        startActivity(intent);
    };
 public void workshop(View view){
        Intent intent=new Intent(this,workshop.class);
        startActivity(intent);
    };
 public void consulting(View view){
        Intent intent=new Intent(this,pediaconsulting.class);
        startActivity(intent);
    };
 public void firstyear(View view){
        Intent intent=new Intent(this,Firstyear.class);
        startActivity(intent);
    };
 public void secondyear(View view){
        Intent intent=new Intent(this,secondyear.class);
        startActivity(intent);
    };
 public void thirdyear(View view){
        Intent intent=new Intent(this,thirdyear.class);
        startActivity(intent);
    };
 public void fourthyear(View view){
        Intent intent=new Intent(this,fourthyear.class);
        startActivity(intent);
    };
 public void techbook(View view){
        Intent intent=new Intent(this,techbook.class);
        startActivity(intent);
    };
 public void nonteckbook(View view){
        Intent intent=new Intent(this,nontechbook.class);
        startActivity(intent);
    };
 public void instabuttom(View view){
     Intent intent = new Intent();
     intent.setAction(Intent.ACTION_VIEW);
     intent.addCategory(Intent.CATEGORY_BROWSABLE);
     intent.setData(Uri.parse("https://www.instagram.com/recpedia0301/"));
     startActivity(intent);
    };
 public void linkibuttom(View view){
     Intent intent = new Intent();
     intent.setAction(Intent.ACTION_VIEW);
     intent.addCategory(Intent.CATEGORY_BROWSABLE);
     intent.setData(Uri.parse("https://www.linkedin.com/authwall?trk=gf&trkInfo=AQGLjylhlO3Z1gAAAX38Br3AFmynKMv-Lslb7hbneG-RG_Eav-cYVJRrsOEdwsKlnTgdM0WEqZrfLFaQB2a1zPn-GRfOSsQ9Ag4Gu0tTjDlHi_RtWHt4-rOQLtcjHDyedUZnLlw=&originalReferer=https://www.recpedia.org/&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Frecpedia0301"));
     startActivity(intent);
    }; public void ytbuttom(View view){
     Intent intent = new Intent();
     intent.setAction(Intent.ACTION_VIEW);
     intent.addCategory(Intent.CATEGORY_BROWSABLE);
     intent.setData(Uri.parse("https://www.youtube.com/watch?v=qlFuZzUsHN0"));
     startActivity(intent);
    };
    public void fbbuttom(View view){
     Intent intent = new Intent();
     intent.setAction(Intent.ACTION_VIEW);
     intent.addCategory(Intent.CATEGORY_BROWSABLE);
     intent.setData(Uri.parse("https://www.facebook.com/recpedia/"));
     startActivity(intent);
    };
    public void twitterbuttom(View view){
     Intent intent = new Intent();
     intent.setAction(Intent.ACTION_VIEW);
     intent.addCategory(Intent.CATEGORY_BROWSABLE);
     intent.setData(Uri.parse("https://twitter.com/RECPedia0301"));
     startActivity(intent);
    };

    public void linktojoin(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.recpedia.org/join-our-team?siteRevision=1916"));
        startActivity(intent);
    };
    public void antiragging(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.recpedia.org/anti-ragging"));
        startActivity(intent);
    };
    public void nodues(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://drive.google.com/file/d/1CfJbFfYVUZbMz7v-6d7qBEfn5cETKdkw/view?usp=drivesdk"));
        startActivity(intent);
    };




    public void eventandcpmtetion(View view){
        Intent event=new Intent(this,eventandcpmtetion.class);
        startActivity(event);}



        public void logout(View view){
            Dialog dialog=new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.dialog_logout);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.getWindow().setWindowAnimations(R.style.animationfordialog);
            ImageView closebtn;
            closebtn=dialog.findViewById(R.id.closelogout);
            Button logoutbtm;
            logoutbtm=dialog.findViewById(R.id.surelogout);
            Button cancel;
            cancel=dialog.findViewById(R.id.cancel);
          logoutbtm.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  auth.signOut();
                  Intent intent1=new Intent(MainActivity.this,signin_activity.class);
                  startActivity(intent1);
              }
          });
          cancel.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  dialog.dismiss();
              }
          });
          closebtn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  dialog.dismiss();
              }
          });
 dialog.show();
    }
}