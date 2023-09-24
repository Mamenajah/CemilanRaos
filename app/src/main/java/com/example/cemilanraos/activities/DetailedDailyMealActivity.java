package com.example.cemilanraos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.cemilanraos.R;
import com.example.cemilanraos.adapters.DetailedDailyAdapter;
import com.example.cemilanraos.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_gbr);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if (type != null && type.equalsIgnoreCase("indonesia")){

            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pasta,"pasta","deskripsi","5.0","Rp.40.000","10 AM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chicken,"ayam", "deskripsi","5.0","Rp.40.000","10 AM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pastry,"makaron","deskripsi","5.0","Rp.40.000","10 AM"));
            dailyAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("indonesia")){

            imageView.setImageResource(R.drawable.indonesia);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pasta,"pasta","deskripsi","5.0","Rp.40.000","10 AM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.chicken,"ayam","deskripsi","5.0","Rp.40.000","10 AM"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pastry,"makaron","deskripsi","5.0","Rp.40.000","10 AM"));
            dailyAdapter.notifyDataSetChanged();
        }




    }
}