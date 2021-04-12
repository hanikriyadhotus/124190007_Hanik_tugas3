package com.example.b3rc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TankAdapter extends RecyclerView.Adapter<TankAdapter.ViewHolder> {
    private Context context;
    private ArrayList<TankModel> tankModels;

    public TankAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<TankModel> getTankModels() {
        return tankModels;
    }

    public void setTankModels(ArrayList<TankModel> tankModels) {
        this.tankModels = tankModels;
    }

    @NonNull
    @Override
    public TankAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cetak, parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull TankAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getTankModels().get(position).getGambarTank()).into(holder.gambar);
        holder.text.setText(getTankModels().get(position).getNamaTank());
    }

    @Override
    public int getItemCount() {
        return getTankModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gambar;
        private TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.cetak_gambar);
            text = itemView.findViewById(R.id.cetak_text);
        }
    }
}
