package br.com.unip.hotelapp.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.unip.hotelapp.databinding.ItemListHomeRoomBinding;
import br.com.unip.hotelapp.model.Room;

public class RoomsAdapter extends RecyclerView.Adapter<RoomsAdapter.ViewHolder> {
    private List<Room> list;

    public RoomsAdapter(List<Room> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListHomeRoomBinding binding = ItemListHomeRoomBinding.inflate(
                LayoutInflater.from(parent.getContext())
        );
        return new ViewHolder(binding);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.bind(list.get(position));
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ItemListHomeRoomBinding binding;
        public ViewHolder(ItemListHomeRoomBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        private void bind(Room item) {
//            binding.typeTextView.setText(item.getType());
        }

        @Override
        public void onClick(View v) {

        }
    }
}