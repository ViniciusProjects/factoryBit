package com.pim.factorybit.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.pim.factorybit.R;


public class InvestirFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    Button btn_comprar;
    View vista;
    private String mParam1;
    private String mParam2;

    public InvestirFragment() {

    }


    public static InvestirFragment newInstance(String param1, String param2) {
        InvestirFragment fragment = new InvestirFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_investir, container, false);

        btn_comprar = vista.findViewById(R.id.btn_comprar_ativos);
        return vista;

    }


}
