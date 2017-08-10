package com.blovvme.fragmentsandlistviews;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    int temp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        // Inflate the layout for this fragment

        final String[] celebNames = {"Jennifer Lopez"
                ,"Maripily"
                ,"Pamela Anderson"
                ,"Shakira"
                ,"Rihanna"
                , "Sophia Vergara"
                ,"Lebron James"
                ,"Michael Jordan"
                ,"Kobe Bryant"
                ,"Carmelo Anthony"};
        final String[] celebNatiolality = {"United States"
                ,"Puerto Rico"
                ,"United States"
                ,"Colombia"
                ,"United States"
                ,"Colombia"
                ,"United States"
                ,"United States"
                ,"United States"
                ,"United States"};
        //final String[] celebPhoto = {"a","b", "c", "d", "e","f", "g", "h","i","j"};



        ListView listView = (ListView) view.findViewById(R.id.celebListView);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,celebNames
        );

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                temp = 0;
                temp = temp + i;
                Bundle bundle =new Bundle();
                bundle.putString("flag",celebNames[temp]);
                bundle.putString("flag2",celebNatiolality[temp]);
                //Images
                Integer[] imgArray = {R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j };
                bundle.putInt("flag3",imgArray[temp]);



                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                SecondFragment secondFragment =new SecondFragment();
                secondFragment.setArguments(bundle);

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,secondFragment);
                fragmentTransaction.addToBackStack(null).commit();

            }
        });


        return view;
    }//

}////
