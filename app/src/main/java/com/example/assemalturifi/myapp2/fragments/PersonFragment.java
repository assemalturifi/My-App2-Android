package com.example.assemalturifi.myapp2.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.assemalturifi.myapp2.R;
import com.example.assemalturifi.myapp2.person.Person;


import java.io.Serializable;
import java.util.List;
//step19

/**
 * A fragment representing a list of Items.
 * <p/>
 * interface.
 */

public class PersonFragment extends Fragment {
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PersonFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static PersonFragment newInstance(List<Person> people) {
        PersonFragment fragment = new PersonFragment();
        Bundle args = new Bundle();
        args.putSerializable( "people", (Serializable) people);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person_list, container, false);

        List<Person> people = (List<Person>) getArguments().getSerializable("people");

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyPersonRecyclerViewAdapter(people));
        }
        return view;
    }

}
