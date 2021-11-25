package br.com.unip.hotelapp.ui.booking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import br.com.unip.hotelapp.databinding.FragmentBookingBinding;

public class BookingFragment extends Fragment {
    private FragmentBookingBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState
    ) {
        binding = FragmentBookingBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}