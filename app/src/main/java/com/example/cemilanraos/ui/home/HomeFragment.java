package com.example.cemilanraos.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cemilanraos.R;
import com.example.cemilanraos.adapters.HomeHorAdapter;
import com.example.cemilanraos.adapters.HomeVerAdapter;
import com.example.cemilanraos.adapters.UpdateVerticalRec;
import com.example.cemilanraos.models.HomeHorModel;
import com.example.cemilanraos.models.HomeVerModel;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;

    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;
    private Context context;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container,false);

        homeHorizontalRec = root.findViewById(R.id.home_horizrec);
        homeVerticalRec = root.findViewById(R.id.home_ver_rec);


        homeHorModelList = new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.chicken, "Chicken"));
        homeHorModelList.add(new HomeHorModel(R.drawable.pasta, "Pasta"));
        homeHorModelList.add(new HomeHorModel(R.drawable.pastry, "Pastry"));
        homeHorModelList.add(new HomeHorModel(R.drawable.indonesia, "Indonesian Cuisine"));
        homeHorModelList.add(new HomeHorModel(R.drawable.camilan, "DimSum"));

        homeHorAdapter = new HomeHorAdapter(context, this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL, false));
        homeHorizontalRec.setHasFixedSize(true);
        homeHorizontalRec.setNestedScrollingEnabled(false);


        homeHorModelList = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL, false));

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }
}