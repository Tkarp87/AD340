package com.example.travis.ad340.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.travis.ad340.MainActivity;
import com.example.travis.ad340.R;

import java.util.ArrayList;


public class SelectPreference extends DialogFragment {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final ArrayList mSelectedPreferences = new ArrayList();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.preference_title)
                .setMultiChoiceItems(R.array.preference_array, null,
                        new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which,
                                                boolean isChecked) {
                                if (isChecked) {

                                    mSelectedPreferences.add(which);
                                } else if (mSelectedPreferences.contains(which)) {
                                    mSelectedPreferences.remove(Integer.valueOf(which));
                                }
                            }
                        })

                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Log.d(TAG, mSelectedPreferences.toString());
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        return builder.create();
    }
}
