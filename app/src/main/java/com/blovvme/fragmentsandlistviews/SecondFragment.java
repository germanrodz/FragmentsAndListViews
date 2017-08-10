package com.blovvme.fragmentsandlistviews;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static com.blovvme.fragmentsandlistviews.R.id.imageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }

    TextView tv1,tv2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        Bundle bundle = getArguments();
        Integer celebPhoto = bundle.getInt("flag3");
        String celebNames = bundle.getString("flag");
        String celebNationality = bundle.getString("flag2");
        TextView tv1 =(TextView) view.findViewById(R.id.tv1);
        TextView tv2 = (TextView) view.findViewById(R.id.tv2);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);



        tv1.setText(celebNames);
        tv2.setText(celebNationality);
        imageView.setImageResource(celebPhoto);


        return view;
    }

}
