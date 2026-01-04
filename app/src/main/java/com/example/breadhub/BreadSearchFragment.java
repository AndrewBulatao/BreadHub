package com.example.breadhub;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

// TODO: USE SAME FRAGMENT TO DISPLAY SEARCH RESULTS. DISPLAY TABLE AT BOTTOM OF SEARCH
public class BreadSearchFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_bread_search, container, false);
        // Find widgets
        Spinner spinner = view.findViewById(R.id.sandwichTypeSpinner);
        Button goBackBtn = view.findViewById(R.id.goBackBtn);
        Button searchBtn = view.findViewById(R.id.addRecipeBtn);

        // Use string array from xml file
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.sandwich_types,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        goBackBtn.setOnClickListener(v -> {
            if (getActivity() == null) return;

            new AlertDialog.Builder(requireContext())
                    .setTitle("Confirm Exit")
                    .setMessage("Are you sure you want to leave? All progress will be lost.")
                    .setPositiveButton("Yes", (dialog, which) -> {
                        // User confirmed, go back
                        getActivity().getSupportFragmentManager().popBackStack();
                    })
                    .setNegativeButton("No", (dialog, which) -> {
                        // User canceled, do nothing
                        dialog.dismiss();
                    })
                    .show();
        });

        return view;
    }

}