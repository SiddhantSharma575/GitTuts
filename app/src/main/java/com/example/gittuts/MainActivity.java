package com.example.gittuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("This is Our Second Commit");
        System.out.println("Local Changes");
        System.out.println("Change 4");
        System.out.println("This Line Will Be Merge");
        System.out.println("Hello From Your Friend Siddhant");
    }
}