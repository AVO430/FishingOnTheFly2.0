package com.example.operationrollingthunder40;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;


/*
    The Main Activity is used to hold a container for the selected fragment
    and to display the bottom navigation bar.
 */


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        /*
            Variables used to create a bottom navigation view
            to hold the bottom nav items. Connects to the Frame
            Layout to be used as a container for the selected fragment.
         */
        BottomNavigationView btnNav = findViewById(R.id.bottomNavigationview);
        FrameLayout frameLayout = findViewById(R.id.fragment_layout);

        //Creates a new Home Fragment when the app starts,
        //sets the Home Fragment to be the default nav Item.
        setFragment(new HomeFragment());



        /*
            Creates a navbar listener to determine which of the menu items
            has been selected. A switch statement is used to determine the
            choice and create a new fragment using setFragment method
         */
        btnNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {
                    case R.id.item1:
                        setFragment(new HomeFragment());
                        return true;

                    case R.id.item2:
                        setFragment(new ExploreFragment());
                        return true;

                    case R.id.item3:
                        setFragment(new ShoppingFragment());
                        return true;

                    default:
                        return false;
                }
            }
        });


    }

    /*
        Method used to start the Fragment transaction of the selected Fragment.
        The Frame Layout is swapped out for the fragment
     */

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_layout, fragment);
        fragmentTransaction.commit();

    }

}




