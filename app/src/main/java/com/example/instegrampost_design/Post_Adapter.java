package com.example.instegrampost_design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Post_Adapter extends ArrayAdapter<post_list> {

    public Post_Adapter(@NonNull Context context, ArrayList<post_list> PostModelArrayList) {
        super(context, 0, PostModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in listview.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.post_design, parent, false);
        }

        post_list post = getItem(position);

        TextView userName;
        CircleImageView profile_img;
        ImageView post_Img;
        TextView post_description;

        userName = listitemView.findViewById(R.id.txt_name);
        profile_img = listitemView.findViewById(R.id.profile_img);
        post_Img = listitemView.findViewById(R.id.image1);
        post_description = listitemView.findViewById(R.id.txt3);


        userName.setText(post.getName());
        profile_img.setImageResource(post.getProfile_img());
        post_Img.setImageResource(post.getPost_img());
        post_description.setText(post.getPost_desc());

        return listitemView;


    }}

