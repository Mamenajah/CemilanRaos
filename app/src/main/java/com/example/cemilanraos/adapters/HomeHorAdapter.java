package com.example.cemilanraos.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cemilanraos.R;
import com.example.cemilanraos.models.HomeHorModel;
import com.example.cemilanraos.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    private final Context context;
    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    List<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(Context context, UpdateVerticalRec updateVerticalRec, Activity activity, List<HomeHorModel> list) {
        this.context = context;
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    public HomeHorAdapter(Context context, List<HomeHorModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horiz_item,parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position){
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {

            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.camilan, "Dimsum", "10:00 - 23:00", "4.9", "Rp.50.000"));
            homeVerModels.add(new HomeVerModel(R.drawable.chicken, "Chiken", "10:00 - 23:00", "5.0", "Rp.60.000"));
            homeVerModels.add(new HomeVerModel(R.drawable.pastry, "Pastry", "10:00 - 23:00", "4.7", "Rp.30.000"));
            homeVerModels.add(new HomeVerModel(R.drawable.indonesia, "Indonesia Cuisine", "10:00 - 23:00", "4.9", "Rp.75.000"));
            homeVerModels.add(new HomeVerModel(R.drawable.pasta, "Pasta", "10:00 - 23:00", "4.6", "Rp.45.000"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index = position;
                    notifyDataSetChanged();

                    if (position == 0){

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.camilan,"Dimsum","10:00 - 23:00","4.9","Rp.50.000"));


                        updateVerticalRec.callBack(position,homeVerModels);
                    } else if (position == 1) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.chicken,"Chiken","10:00 - 23:00","5.0","Rp.60.000"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }else if (position == 2) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pastry,"Pastry","10:00 - 23:00","4.7","Rp.30.000"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }else if (position == 3) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.indonesia,"Indonesia Cuisine","10:00 - 23:00","4.9","Rp.75.000"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }else if (position == 4) {
                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pasta,"Pasta","10:00 - 23:00","4.6","Rp.45.000"));

                        updateVerticalRec.callBack(position,homeVerModels);

                    }
                }
            });

            if (select){
                if (position == 0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select = false;
                }
            }
            else {
                if (row_index == position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }


    @Override
    public int getItemCount() {

        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;

        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.chicken);
            name = itemView.findViewById(R.id.chicken_text);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
