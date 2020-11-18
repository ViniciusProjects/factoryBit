package com.pim.factorybit.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.pim.factorybit.R;


public class AnaliseFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    Button btn_media_anual;
    View vista;
    private String mParam1;
    private String mParam2;

    public AnaliseFragment() {

    }


    public static AnaliseFragment newInstance(String param1, String param2) {
        AnaliseFragment fragment = new AnaliseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_analise, container, false);

        btn_media_anual = vista.findViewById(R.id.btn_analise_ativos);


        return vista;

    }


}
