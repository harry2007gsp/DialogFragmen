package com.harry;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class MyDialogFragment extends DialogFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_dialog, container, false);
        getDialog().setTitle("Final Title");
        return view;
    }


}
