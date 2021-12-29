package com.example.operationrollingthunder40;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


/*
    Class used to create the adapter for the functionality
    of the Recycler View in the Setting Fragment Class
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    //Local variables to hold the list and context
    List<SettingModel> mList;
    Context context;


    /*
        Adapter Class used to receive the data from the Setting
        Fragment Class and initialize the Array List and Context
        to load the current layout in addition to the Recycler
        View Layout.
     */
    public MyAdapter(List<SettingModel> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }




    /*
        Creates the layout to hold the entire view.
        Loads the current view and adds another view
        to hold the Recycler view elements.
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        //Load the current view
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        //Inflate the new view on top on the current view
        View view = layoutInflater.inflate(R.layout.my_row, parent, false);

        //Return the new view as a whole to be displayed
        return new MyViewHolder(view);
    }

    /*
        Initializes the item view holder to the river image
        and text. Uses the array list to connect all elements
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Sets Image and Text using array list
        holder.myImage.setImageResource(mList.get(position).getImages());
        holder.textView1.setText(mList.get(position).getText());
    }


    /*
        Gets the count of the Array List to creates the
        necessary size depending on how many items are
        in the array list
     */
    @Override
    public int getItemCount() {
        return mList.size();
    }

    //Used to display and change the elements as the user scrolls
    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView1;
        ImageView myImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //Sets the River Image and Text
            myImage = itemView.findViewById(R.id.myImage);
            textView1 = itemView.findViewById(R.id.textview);

        }
    }

}
