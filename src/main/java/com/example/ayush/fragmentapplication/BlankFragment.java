package com.example.ayush.fragmentapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BlankFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        ArrayList<Data> arrayList = new ArrayList<>();
        ListView listView = (ListView)view.findViewById(R.id.listView);

        //Values for the title and descriptions as well as location of the images are declared here
        String[] names = new String[]{"Youtube","Blogger"};
        String[] descriptions = new String[]{"Youtube description", "Blogger Description"};
        int id[] = new int[]{R.drawable.youtube_icon,R.drawable.blogger_icon};

        //THe values are stored in the arraylist
        for(int i = 0; i< names.length;i++ ){
            Data data = new Data();
            data.setName(names[i]);
            data.setDescription(descriptions[i]);
            data.setId(id[i]);
            arrayList.add(data);
        }
        //The adapter is connected to the arraylist and the view is finally returned
        CustomAdapter adapter = new CustomAdapter(this,arrayList);
        listView.setAdapter(adapter);
        return view;
    }


}
