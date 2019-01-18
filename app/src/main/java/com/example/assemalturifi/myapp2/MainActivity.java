package com.example.assemalturifi.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goDialog(View view) {
        Intent intent = new Intent( getApplicationContext(), DialogFragmentActivity.class);
        startActivity( intent );
    }

    public void goListFragment(View view) {
        Intent intent = new Intent( getApplicationContext(), ListFragmentActivity.class);
        startActivity( intent );
    }

    public void goPreferences(View view) {

        Intent intent = new Intent( getApplicationContext(), PreferencesActivity.class);
        startActivity( intent );
    }
}

//Fragments,DialogFragments,preferences
