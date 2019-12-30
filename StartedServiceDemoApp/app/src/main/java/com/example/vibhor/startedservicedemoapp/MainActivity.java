package com.example.vibhor.startedservicedemoapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //start the service
    public void onClickStartServie(View V) {
        //start the service from here //MyService is your service class name
        startService(new Intent(this, MyService.class));
    }

    //Stop the started service
    public void onClickStopService(View V) {
        //Stop the running service from here//MyService is your service class name
        //Service will only stop if it is already running.
        stopService(new Intent(this, MyService.class));
    }
}