package br.com.unip.hotelapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.List;

import br.com.unip.hotelapp.dao.RoomDao;
import br.com.unip.hotelapp.databinding.FragmentHomeBinding;
import br.com.unip.hotelapp.model.Room;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState
    ) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());

        List<Room> rooms = new RoomDao().selectRoom();

        binding.roomsRecyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        RoomsAdapter adapter = new RoomsAdapter(rooms);
        binding.roomsRecyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener((v, position) -> {
            final Room item = rooms.get(position);
            Integer roomId = item.getId();
            navigateToReserve(roomId);
        });

        return binding.getRoot();
    }

    private void navigateToReserve(int roomId) {
        Navigation.findNavController(requireView()).navigate(HomeFragmentDirections.actionHomeFragmentToBookingFragment(roomId));
    }
}