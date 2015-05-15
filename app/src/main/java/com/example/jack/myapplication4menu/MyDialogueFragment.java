package com.example.jack.myapplication4menu;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by jack on 5/15/15.
 */
public class MyDialogueFragment extends DialogFragment {

    @Override
    public Dialog getDialog() {
        return super.getDialog();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

    /*    return new AlertDialog.Builder(getActivity())
                .setTitle("option settings")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                                Toast.makeText(getActivity(),"you clicked ok!",Toast.LENGTH_SHORT).show();

//                                ((FragmentAlertDialog) getActivity()).doPositiveClick();
                            }
                        }
                )
                .setNegativeButton("CANSEL",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                                Toast.makeText(getActivity(),"you clicked cansell!",Toast.LENGTH_SHORT).show();
//                                ((FragmentAlertDialog) getActivity()).doNegativeClick();
                            }
                        }
                )
                .create();*/




        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());




        theDialog.setTitle("option settings");
        theDialog.setMessage("hello I am a Dialog");

        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getActivity(), "you clicked ok!", Toast.LENGTH_SHORT).show();

            }
        });

        theDialog.setNegativeButton("CANSEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "you clicked cansel!", Toast.LENGTH_SHORT).show();

            }
        });



        //here is diffrent with the tutorial

        return   theDialog.create();
    }
}
