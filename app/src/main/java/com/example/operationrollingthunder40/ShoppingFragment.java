package com.example.operationrollingthunder40;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*

 */


public class ShoppingFragment extends Fragment {


    View v;




    /*
        Method used to inflate the layout and initialize the elements in
        the Recycler View
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Set the view to inflate the Explore Fragment when selected
        v = inflater.inflate(R.layout.fragment_shopping, container, false);


        // Inflate the layout for this fragment
        return v;

    }




}