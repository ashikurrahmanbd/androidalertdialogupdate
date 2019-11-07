package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    AlertDialog.Builder alertDailogBuiler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDailogBuiler = new AlertDialog.Builder(MainActivity.this);

                alertDailogBuiler.setTitle("Exit Notification");

                alertDailogBuiler.setMessage("Are you sure to Exit");

                alertDailogBuiler.setIcon(R.drawable.ic_launcher_background);

                alertDailogBuiler.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

               alertDailogBuiler.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                alertDailogBuiler.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You have selected Cancel", Toast.LENGTH_SHORT).show();
                    }
                });




                AlertDialog alertDialog = alertDailogBuiler.create();

                alertDialog.show();



            }
        });
    }
}
