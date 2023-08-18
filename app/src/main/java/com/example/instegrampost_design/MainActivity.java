package com.example.instegrampost_design;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView l;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l= findViewById(R.id.listview);

        ArrayList<post_list> productArray = new ArrayList<post_list>();

        productArray.add(new post_list(R.drawable.user1,"Marwaa Nasser",R.drawable.user1,"image image image"));
        productArray.add(new post_list(R.drawable.user1,"Marwaa Nasser",R.drawable.user1,"image image image"));
        productArray.add(new post_list(R.drawable.user1,"Marwaa Nasserr",R.drawable.user1,"image image image"));
        Post_Adapter adapter = new Post_Adapter(this,productArray );
        l.setAdapter(adapter);
    }
}