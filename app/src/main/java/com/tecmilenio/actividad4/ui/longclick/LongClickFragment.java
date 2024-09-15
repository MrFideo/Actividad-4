package com.tecmilenio.actividad4.ui.longclick;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.tecmilenio.actividad4.databinding.FragmentGalleryBinding;

public class LongClickFragment extends Fragment {

    private FragmentGalleryBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        LongClickViewModel galleryViewModel =
                new ViewModelProvider(this).get(LongClickViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLongClick;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        Button buttonLongClick = binding.buttonLongClick;

        buttonLongClick.setOnLongClickListener(v -> {
            Toast.makeText(getContext(),"Button Long Clicked", Toast.LENGTH_LONG).show();
            return true;
        });

        buttonLongClick.setOnClickListener(v -> {
            return;
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}