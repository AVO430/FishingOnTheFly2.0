package com.example.operationrollingthunder40;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/*
    This class is used to create the Home Fragment view
    and functionality.
 */

public class HomeFragment extends Fragment {



    /*
       -Creates a new List Array using the Setting Model
       Class to initialize the elements for the river recycler
       view.

       -Initializes the Adapter, RecyclerView and View to inflate.
    */

    //Declare River list variable
    ArrayList<SettingModel> riverList;
    MyAdapter myAdapter;
    View v;

    //Declare Variable for Recycler View
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Set the view to inflate the Home Fragment when selected
        v = inflater.inflate(R.layout.fragment_home, container, false);

        //Connect the Recycler View
        recyclerView = v.findViewById(R.id.recyclerView);

        //Create Integer Array of Images
        Integer[] riverImages = {R.drawable.bigflat, R.drawable.muskie, R.drawable.pequest,
                R.drawable.paulinskill, R.drawable.rockaway};

        //Create String Array of River Names
        String riverNames[] = {"Big Flatbrook", "Muskie", "Pequest",
                "Paulinskill", "Rockaway"};

        //Initialize the Array for the River Image and Name
        riverList = new ArrayList<>();
        for (int counter=0; counter < riverImages.length; counter++){

            SettingModel riverInfo = new SettingModel(riverImages[counter],
                                        riverNames[counter]);
            riverList.add(riverInfo);
        }

        //Create the adapter and pass the created list of river elements
        myAdapter = new MyAdapter(riverList, getContext());
        recyclerView.setAdapter(myAdapter);



        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL,  false));

        //return the inflated view
        return v;



    }


    /*
        Method to initialize the river images and text
     */

    /*
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);



    }

     */


}