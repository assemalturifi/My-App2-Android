package com.example.assemalturifi.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.assemalturifi.myapp2.fragments.PersonFragment;
import com.example.assemalturifi.myapp2.person.Person;

import java.util.ArrayList;
//step4

public class ListFragmentActivity extends AppCompatActivity {


    private EditText mPersonGender;
    private EditText mPersonAge;
    private EditText mPersonName;


    //step17
    private ArrayList<Person> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fragment);


        //step15
        bindViews();


    }

    //step14
    private void bindViews() {
        mPersonName = findViewById(R.id.etPersonName);
        mPersonAge = findViewById(R.id.etPersonAge);
        mPersonGender = findViewById(R.id.etPersonGender);
    }

    //step18
    public void addPerson(View view) {
        Person person = new Person(mPersonName.getText().toString(),mPersonAge.getText().toString(),mPersonGender.getText().toString());

        people.add(person);
        Toast.makeText( this, "Added person:"+person.toString(), Toast.LENGTH_SHORT ).show();
    }

    public void displayPeople(View view) {
        if ( getSupportFragmentManager().findFragmentByTag("people") == null ){
            getSupportFragmentManager().beginTransaction()
                    .add( R.id.svDisplayPeople, PersonFragment.newInstance( people ), "people")
                    .addToBackStack( "people" )
                    .commit();
        }
    }
}
