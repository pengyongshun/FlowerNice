package com.example.flowernice.module_ording.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flowernice.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrdingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrdingFragment extends Fragment {
    private Context context;

    // TODO: Rename and change types and number of parameters
    public static OrdingFragment newInstance() {
        OrdingFragment fragment = new OrdingFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=getContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ording, container, false);
        return view;
    }

}
