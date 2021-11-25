package br.com.unip.hotelapp.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.unip.hotelapp.R;
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
            if (item.getType().equals("Master")) {
                binding.roomImageView.setImageDrawable(
                        ContextCompat.getDrawable(itemView.getContext(), R.drawable.master_room)
                );
                binding.descriptionTextView.setText(R.string.description_master_room_list);
            } else {
                binding.roomImageView.setImageDrawable(
                        ContextCompat.getDrawable(itemView.getContext(), R.drawable.simple_room)
                );
                binding.descriptionTextView.setText(R.string.description_default_room_list);
            }
            binding.typeTextView.setText(item.getType());
            binding.dailyPriceTextView.setText("R$ " + item.getPrice() + "/diária");
            binding.statusTextView.setText("Status: " + item.getStatus());
        }

        @Override
        public void onClick(View v) {

        }
    }
}