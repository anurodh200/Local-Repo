package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AlertSeekProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_seek_progress);
    }

    public void  openAlertDialog(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(AlertSeekProgress.this);
        alertDialogBuilder.setIcon(R.drawable.baseline_email_24);
        alertDialogBuilder.setTitle("Close Window");
        alertDialogBuilder.setMessage("Do you wnat to close the Window ??");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(AlertSeekProgress.this,"YOu clicked NO...",Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(AlertSeekProgress.this,"You Clicked Yes....!!",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.show();


    }

}