package com.tecmilenio.actividad4.ui.key;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tecmilenio.actividad4.R;
import com.tecmilenio.actividad4.databinding.FragmentFocusChangeBinding;
import com.tecmilenio.actividad4.databinding.FragmentKeyBinding;
import com.tecmilenio.actividad4.ui.focuschange.FocusChangeViewModel;

public class KeyFragment extends Fragment {

    private FragmentKeyBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        KeyViewModel keyViewModel =
                new ViewModelProvider(this).get(KeyViewModel.class);

        binding = FragmentKeyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textKey;
        keyViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        EditText editTextKey = binding.editTextKey;

        editTextKey.setOnKeyListener((v, keyCode, event) -> {
            if (keyCode == KeyEvent.KEYCODE_ENTER) {
                Toast.makeText(getContext(), "Enter Key Pressed", Toast.LENGTH_LONG).show();
                return true;
            }
            return false;
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}