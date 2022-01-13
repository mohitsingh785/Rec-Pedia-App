package com.example.recpedia.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.recpedia.R;
import com.example.recpedia.ui.CourseModel;

import java.util.ArrayList;

public class MainAdapter extends ArrayAdapter<CourseModel> {
    public MainAdapter(@NonNull Context context, ArrayList<CourseModel> courseModelArrayList) {
        super(context, 0, courseModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.row_item, parent, false);
        }
        CourseModel courseModel = getItem(position);
        ImageView courseIV = listitemView.findViewById(R.id.idIVcourse);
        courseIV.setImageResource(courseModel.getImgid());
        return listitemView;
    }
}
