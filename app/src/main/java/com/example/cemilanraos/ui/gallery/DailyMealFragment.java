package com.example.cemilanraos.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cemilanraos.R;
import com.example.cemilanraos.adapters.DailyMealAdapter;
import com.example.cemilanraos.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.dailymeal_fragment, container, false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.indonesia,"Indonesia Cuisine","40% Off","Murah Meriah","indonesia"));
        dailyMealModels.add(new DailyMealModel(R.drawable.indonesia,"Indonesia Cuisine","40% Off","Murah Meriah","indonesia"));
        dailyMealModels.add(new DailyMealModel(R.drawable.indonesia,"Indonesia Cuisine","40% Off","Murah Meriah","indonesia"));
        dailyMealModels.add(new DailyMealModel(R.drawable.indonesia,"Indonesia Cuisine","40% Off","Murah Meriah","indonesia"));
        dailyMealModels.add(new DailyMealModel(R.drawable.indonesia,"Indonesia Cuisine","40% Off","Murah Meriah","indonesia"));

        dailyMealAdapter = new DailyMealAdapter(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }
}