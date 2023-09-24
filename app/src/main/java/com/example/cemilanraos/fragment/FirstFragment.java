package com.example.cemilanraos.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cemilanraos.R;
import com.example.cemilanraos.adapters.FeaturedAdapter;
import com.example.cemilanraos.adapters.FeaturedVerAdapter;
import com.example.cemilanraos.models.FeaturedModel;
import com.example.cemilanraos.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {



    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);



        recyclerView = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));

        featuredModelList = new ArrayList<>();

        featuredModelList.add(new FeaturedModel(R.drawable.chicken,"Featured 1","Description"));
        featuredModelList.add(new FeaturedModel(R.drawable.indonesia,"Featured 2","Description"));
        featuredModelList.add(new FeaturedModel(R.drawable.macaron,"Featured 3","Description"));

        featuredAdapter = new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);


        recyclerView2 = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        featuredVerModelList = new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.camilan,"Featured 1","deskripsi","4.0","10AM"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.carbonara,"Featured 2","deskripsi","4.0","10AM"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.macaron,"Featured 3","deskripsi","4.0","10AM"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);


        return view;
    }
}