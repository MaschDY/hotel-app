package br.com.unip.hotelapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
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
//        Client client = new ClientDao().selectClient();
//        System.out.println(client.getName());
//        ConnectionHelper connectionHelper = new ConnectionHelper();
//        Connection connection = connectionHelper.connect();
//        try {
//            if (connection != null) {
//                if (!connection.isClosed())
//                    Log.i("SQL", "Connection success!");
//                else
//                    Log.i("SQL", "Connection closed!");
//            } else {
//                Log.i("SQL", "Connection null, not performed!");
//            }
//        } catch (Exception e) {
//            //e.printStackTrace();
//            Log.e("Erro: ", "Connection failed!!! " + e.getMessage());
//        }

        List<Room> rooms = new RoomDao().selectRoom();
        binding.roomsRecyclerView.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
        RoomsAdapter adapter = new RoomsAdapter(rooms);
        binding.roomsRecyclerView.setAdapter(adapter);
        return binding.getRoot();
    }
}