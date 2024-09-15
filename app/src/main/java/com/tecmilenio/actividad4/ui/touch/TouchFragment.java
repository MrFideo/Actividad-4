package com.tecmilenio.actividad4.ui.touch;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tecmilenio.actividad4.R;
import com.tecmilenio.actividad4.databinding.FragmentClickBinding;
import com.tecmilenio.actividad4.databinding.FragmentTouchBinding;
import com.tecmilenio.actividad4.ui.click.ClickViewModel;

public class TouchFragment extends Fragment {

    private FragmentTouchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        TouchViewModel touchViewModel =
                new ViewModelProvider(this).get(TouchViewModel.class);

        binding = FragmentTouchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTouch;
        touchViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        Button buttonTouch = binding.buttonTouch;

        buttonTouch.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(getContext(), "Button Touched", Toast.LENGTH_LONG).show();
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