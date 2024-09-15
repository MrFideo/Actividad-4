package com.tecmilenio.actividad4.ui.focuschange;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tecmilenio.actividad4.R;
import com.tecmilenio.actividad4.databinding.FragmentClickBinding;
import com.tecmilenio.actividad4.databinding.FragmentFocusChangeBinding;
import com.tecmilenio.actividad4.ui.click.ClickViewModel;

public class FocusChangeFragment extends Fragment {

    private FragmentFocusChangeBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        FocusChangeViewModel focusChangeViewModel =
                new ViewModelProvider(this).get(FocusChangeViewModel.class);

        binding = FragmentFocusChangeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFocus;
        focusChangeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        EditText editTextFocus = binding.editTextFocus;

        editTextFocus.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Toast.makeText(getContext(), "EditText Focused", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getContext(), "EditText Lost Focus", Toast.LENGTH_LONG).show();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}