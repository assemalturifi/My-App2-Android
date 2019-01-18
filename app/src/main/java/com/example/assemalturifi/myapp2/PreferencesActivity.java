package com.example.assemalturifi.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.assemalturifi.myapp2.fragments.CustomPreferenceFragment;


//step6
public class PreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        //step26

        CustomPreferenceFragment customPreferenceFragment = new CustomPreferenceFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.llPreferencesHolder, customPreferenceFragment)
                .commit();
    }
}
