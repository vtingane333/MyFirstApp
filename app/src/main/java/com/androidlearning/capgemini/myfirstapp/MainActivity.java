package com.androidlearning.capgemini.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Test Code

        Toast.makeText(this,"Hello World",Toast.LENGTH_LONG).show();

        //Toast Added

        Toast.makeText(this,"On New Branch",Toast.LENGTH_LONG).show();

        //Toast Added

        //New Branch Added
        Toast.makeText(this,"On New Branch",Toast.LENGTH_LONG).show();

        //New Branch Added to test cls
        Toast.makeText(this,"On New Branch",Toast.LENGTH_LONG).show();

        //New Comment
    }
}
