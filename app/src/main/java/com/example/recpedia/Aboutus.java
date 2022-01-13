package com.example.recpedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class Aboutus extends Fragment {

    private AboutusViewModel aboutusViewModel;

    public static Aboutus newInstance() {
        return new Aboutus();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        aboutusViewModel=
                new ViewModelProvider(this).get(AboutusViewModel.class);
        View root = inflater.inflate(R.layout.recpedia, container, false);
            final Button buttonaboutus=root.findViewById(R.id.apply);
        final Button linkidinabhishek=root.findViewById(R.id.abhisheklinkidin);
        final Button linkidinbhalekar=root.findViewById(R.id.bhalekarlinki);
        final Button linkidinambar=root.findViewById(R.id.ambarlinki);
        final Button linkidinsomya=root.findViewById(R.id.soumyalinki);
        final Button linkidinaditya=root.findViewById(R.id.adityalinki);
        final Button linkidinsansakar=root.findViewById(R.id.sansakarlinki);
        final Button linkidinghulam=root.findViewById(R.id.ghulamlinki);
        final Button linkidinsohan=root.findViewById(R.id.sohanlinki);
        final Button linkidinmohit=root.findViewById(R.id.mohitlinki);
        final Button inkidinanu=root.findViewById(R.id.anulinki);
        final Button linkidinaastha=root.findViewById(R.id.aasthalinki);
        final Button linkisakshi=root.findViewById(R.id.sakshilinki);
        final Button linkidinvarsha=root.findViewById(R.id.varshalinki);
        final Button linkidinashutose=root.findViewById(R.id.ashutoselinki);
        final Button linkidinritik=root.findViewById(R.id.ritiklinki);
        final Button linkidinpiyush=root.findViewById(R.id.piyushlinki);
        final Button linkidinvaishali=root.findViewById(R.id.vaishalilinki);
        final Button linkidinshiksha=root.findViewById(R.id.shikshalinki);
        final Button linkkidinjuhi=root.findViewById(R.id.juhilinki);
        final Button linkidinsumit=root.findViewById(R.id.sumitlinki);
        final Button linkidinsuyush=root.findViewById(R.id.suyushlinki);
            buttonaboutus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getActivity().getApplicationContext(),MainActivity2.class);
                    startActivity(intent);
                }
            });
            linkidinabhishek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("https://www.linkedin.com/authwall?trk=bf&trkInfo=AQHS8Ht1fakTCwAAAX3RE2UohEeScs5FwBK_6vxYdIEDE3Ogns5tm055MByVq-4vZVvvVkk89JomuBz5l08cdA5gNfY4-bPNLLHQpUnOeK4rnVTh92v2hUitbjNZKPi6Xe6yWec=&originalReferer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fin%2Fabhishek-upadhyay-037b6a200"));
                    startActivity(intent);
                }
            });
        linkidinbhalekar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/abhishek-bhalekar-82a7b8182"));
                startActivity(intent);
            }
        });
        linkidinambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/ambar-tripathi-75a621174"));
                startActivity(intent);
            }
        });
        linkidinsomya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/somya-jain-bb6283202"));
                startActivity(intent);
            }
        });
        linkidinaditya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/aditya-agrahari"));
                startActivity(intent);
            }
        });
        linkidinsansakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/sanskar-agrawal-7117a21a4"));
                startActivity(intent);
            }
        });
        linkidinghulam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/ashrafghulam"));
                startActivity(intent);
            }
        });
        linkidinsohan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/sohan-lal-patel-77a2a41b8"));
                startActivity(intent);
            }
        });
        linkidinmohit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/mohit-singh-37966720b"));
                startActivity(intent);
            }
        });
        inkidinanu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/anu-mishra-567701220 "));
                startActivity(intent);
            }
        });
        linkidinaastha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/aastha-namdeo-ba7414221"));
                startActivity(intent);
            }
        });
        linkisakshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/sakshi-raghuwanshi-236298207"));
                startActivity(intent);
            }
        });
        linkidinvarsha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/varsha-tripathi-28288121b"));
                startActivity(intent);
            }
        });
        linkidinashutose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/ashutosh-tiwari-a01800228"));
                startActivity(intent);
            }
        });
        linkidinritik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/ritik-trivedi-598a4b21b"));
                startActivity(intent);
            }
        });
        linkidinpiyush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/piyush-kesarwani-909745211"));
                startActivity(intent);
            }
        });
        linkidinvaishali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/vaishali-tripathi-545783225  "));
                startActivity(intent);
            }
        });
        linkidinshiksha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/aryu-dwivedi-a69186229/ "));
                startActivity(intent);
            }
        });
        linkkidinjuhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/juhi-singh-258803228"));
                startActivity(intent);
            }
        });
        linkidinsumit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("www.linkedin.com/in/sumit-sourav-choudhury-946aa9227"));
                startActivity(intent);
            }
        });
        linkidinsuyush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/suyashtiwariii"));
                startActivity(intent);
            }
        });
        aboutusViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {


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
        aboutusViewModel = new ViewModelProvider(this).get(AboutusViewModel.class);
        // TODO: Use the ViewModel
    }

}