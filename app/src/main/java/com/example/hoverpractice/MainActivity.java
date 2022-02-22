package com.example.hoverpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.example.hoverpractice.Adapter.MainAdapter;
import com.example.hoverpractice.Pojo.MainModel;
import com.example.hoverpractice.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding activityMainBinding;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        activityMainBinding.mainRecyclerView .setLayoutManager(layoutManager);

        List<MainModel> mainModels = new ArrayList<>();
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainModels.add(new MainModel(R.drawable.first, ""));
        mainModels.add(new MainModel(R.drawable.second, ""));
        mainModels.add(new MainModel(R.drawable.third, ""));
        mainAdapter = new MainAdapter(mainModels);
        activityMainBinding.mainRecyclerView .setAdapter(mainAdapter);
        mainAdapter.notifyDataSetChanged();

//     CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
//     compositePageTransformer.addTransformer(new MarginPageTransformer(40));
//     compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
//      @Override
//      public void transformPage(@NonNull View page, float position) {
//       float r = 1 - Math.abs(position);
//       page.setScaleY(0.85f + r + 0.15f);
//      }
//     });
//
//     activityMainBinding.mainRecyclerView.setPageTransformer(compositePageTransformer);



    }
}