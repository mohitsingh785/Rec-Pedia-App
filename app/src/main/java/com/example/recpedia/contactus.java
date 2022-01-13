package com.example.recpedia;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class contactus extends Fragment implements OnClickListener {

    private ContactusViewModel mViewModel;


    public static contactus newInstance() {
        return new contactus();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1){
            if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(getActivity(), "Permission Granted", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getActivity(), "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel=
                new ViewModelProvider(this).get(ContactusViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contactus3, container, false);
        Intent intent=getActivity().getIntent();
        final Button send=root.findViewById(R.id.sendyourmessage);
        final Button call=root.findViewById(R.id.call);
        final EditText name=root.findViewById(R.id.enteryourname);
        final EditText message=root.findViewById(R.id.enteryourmessage);
        call.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(getActivity().getApplicationContext().checkSelfPermission(Manifest.permission.CALL_PHONE)==PackageManager.PERMISSION_GRANTED){
                        String phone_number
                                = "+91 9424002624";


                        Intent phone_intent
                                = new Intent(Intent.ACTION_CALL);
                        phone_intent
                                .setData(Uri.parse("tel:"
                                        + phone_number));
                        startActivity(phone_intent);
                    }
                    else{
                        requestPermissions(new String[]{Manifest.permission.CALL_PHONE},1);
                    }
                    }
                }



        });

            send.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    String getname=name.getText().toString();
                    String getmessage=message.getText().toString();
                    if (getmessage.isEmpty() || getname.isEmpty()){
                        Toast.makeText(getActivity(), "Please Enter Following Details", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        send.setText("MESSAGE SENT");
                        String subjectmail=message.getText().toString();
                        String subjectname=name.getText().toString();
                        String [] addresses={"info@recpedia.org"};
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("*/*");
                        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
                        intent.putExtra(Intent.EXTRA_SUBJECT, subjectname);
                        intent.putExtra(Intent.EXTRA_TEXT, subjectmail);
                        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                            Toast.makeText(getActivity(), "We Will Contact You Soon "+subjectname+", Response Submitted", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        }
                    }
                }


            });


        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {


            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ContactusViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onClick(View v) {
//        Toast.makeText(getContext(), "sjdhjknkjankanka", Toast.LENGTH_SHORT).show();
    }
}