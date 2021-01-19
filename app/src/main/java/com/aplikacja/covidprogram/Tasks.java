package com.aplikacja.covidprogram;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tasks#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tasks extends Fragment {
    public ImageView wTub;
    public ImageView wHands;
    public ImageView wMask;
    public ImageView dezHands;
    public ImageView mAllegro;
    public ImageView mTesco;
    public ImageView mGov;
    public ImageView mPyszne;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Tasks() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tasks.
     */
    // TODO: Rename and change types and number of parameters
    public static Tasks newInstance(String param1, String param2) {
        Tasks fragment = new Tasks();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_tasks, container, false);
        wTub = (ImageView) v.findViewById(R.id.workTube);
        wHands = (ImageView) v.findViewById(R.id.washHand);
        wMask = (ImageView) v.findViewById(R.id.wearMask);
        dezHands = (ImageView) v.findViewById(R.id.dezynHands);
        mAllegro = (ImageView) v.findViewById(R.id.myAllegro);
        mTesco = (ImageView) v.findViewById(R.id.myTesco);
        mGov = (ImageView) v.findViewById(R.id.myGov);
        mPyszne = (ImageView) v.findViewById(R.id.myPyszne);

        wTub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), WorkTubeList.class);
                startActivity(in);
            }
        });

        wHands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Handss",Toast.LENGTH_SHORT);
            }
        });

        wMask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Mask",Toast.LENGTH_SHORT);

            }
        });
        dezHands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Dezy",Toast.LENGTH_SHORT);

            }
        });
        mAllegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), WebAction.class);
                in.putExtra("side",0);
                startActivity(in);
            }
        });
        mTesco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), WebAction.class);
                in.putExtra("side",1);
                startActivity(in);
            }
        });
        mGov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), WebAction.class);
                in.putExtra("side",2);
                startActivity(in);
            }
        });
        mPyszne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), WebAction.class);
                in.putExtra("side",3);
                startActivity(in);
            }
        });

        // Inflate the layout for this fragment
        return v;


    }
}