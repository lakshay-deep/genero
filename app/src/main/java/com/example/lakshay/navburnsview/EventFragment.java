package com.example.lakshay.navburnsview;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {


    private TextView mTvCultural;
    private TextView mTvLiterary;
    private TextView mTvTechME;
    private TextView mTvTechCs;
    private TextView mTvTechCivil;
    private TextView mTvInformals;
    private TextView mTvTechEE;
    private TextView mTvEgaming;

    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTvCultural = (TextView) view.findViewById(R.id.tv_cultural);
        mTvCultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EachEventActivity.class);
                startActivity(intent);
            }
        });

        mTvLiterary = (TextView) view.findViewById(R.id.tv_literary);
        mTvLiterary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EachEventActivity.class);
                startActivity(intent);
            }
        });

        mTvTechME = (TextView) view.findViewById(R.id.tv_techme);
        mTvTechME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EachEventActivity.class);
                startActivity(intent);
            }
        });
        mTvTechCs = (TextView) view.findViewById(R.id.tv_techcs);
        mTvTechCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EachEventActivity.class);
                startActivity(intent);
            }
        });
        mTvTechCivil = (TextView) view.findViewById(R.id.tv_techcivil);
        mTvTechCivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EachEventActivity.class);
                startActivity(intent);
            }
        });
        mTvInformals = (TextView) view.findViewById(R.id.tv_informals);
        mTvInformals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EachEventActivity.class);
                startActivity(intent);
            }
        });
        mTvTechEE = (TextView) view.findViewById(R.id.tv_techee);
        mTvTechEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EachEventActivity.class);
                startActivity(intent);
            }
        });
        mTvEgaming = (TextView) view.findViewById(R.id.tv_egaming);
        mTvEgaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EachEventActivity.class);
                startActivity(intent);
            }
        });

    }


}
