package br.com.unip.hotelapp.ui.booking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import java.math.BigInteger;

import br.com.unip.hotelapp.dao.ClientDao;
import br.com.unip.hotelapp.databinding.FragmentBookingBinding;
import br.com.unip.hotelapp.model.Client;

public class BookingFragment extends Fragment {
    private FragmentBookingBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState
    ) {
        binding = FragmentBookingBinding.inflate(getLayoutInflater());
        Bundle args = getArguments();

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireView()).popBackStack();
            }
        });

        binding.reserveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Client client = new Client(
                        binding.nameInput.getText().toString(),
                        BigInteger.valueOf(Long.valueOf(binding.telephoneInput.getText().toString())),
                        binding.nationalityInput.getText().toString(),
                        binding.addressInput.getText().toString(),
                        binding.genderInput.getText().toString(),
                        binding.birthdayInput.getText().toString(),
                        binding.documentInput.getText().toString(),
                        binding.arrivalInput.getText().toString(),
                        binding.exitInput.getText().toString(),
                        args.getInt("room_id")
                );

                int response = ClientDao.selectClient(client);

                if (response <= 0) {
                    Toast.makeText(getContext(), "Reserva não realizada!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Reserva realizada com sucesso!", Toast.LENGTH_SHORT).show();
                    Navigation.findNavController(requireView()).popBackStack();
                }
            }
        });

        return binding.getRoot();
    }
}