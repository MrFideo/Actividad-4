package com.tecmilenio.actividad4.ui.click;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tecmilenio.actividad4.R;
import com.tecmilenio.actividad4.databinding.FragmentClickBinding;

public class ClickFragment extends Fragment {

    private FragmentClickBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        ClickViewModel clickViewModel =
                new ViewModelProvider(this).get(ClickViewModel.class);

        binding = FragmentClickBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textClick;
        clickViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        Button buttonClick = binding.buttonClick;

        buttonClick.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Button Clicked", Toast.LENGTH_LONG).show();
            System.out.println("Click");  //true indica que el evento ha sido manejado
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}