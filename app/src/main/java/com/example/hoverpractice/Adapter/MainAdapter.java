package com.example.hoverpractice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.hoverpractice.Pojo.MainModel;
import com.example.hoverpractice.R;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private Context context;
    List<MainModel> mainModel;

    public MainAdapter(List<MainModel> mainModel) {
        this.mainModel = mainModel;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MainModel mainMmodel = mainModel.get(position);
        holder.text.setText(mainMmodel.getText());
        holder.image.setImageResource(mainMmodel.getImage());
    }

    @Override
    public int getItemCount() {
        return mainModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            text = itemView.findViewById(R.id.text);


//            itemView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//                @Override
//                public void onFocusChange(View v, boolean hasFocus) {
//                    if (hasFocus) {
//                        Animation anim = AnimationUtils.loadAnimation(context, R.anim.scale_in_tv);
//                        itemView.startAnimation(anim);
//                        anim.setFillAfter(true);
//                    } else {
//                        Animation anim = AnimationUtils.loadAnimation(context, R.anim.scale_out_tv);
//                        itemView.startAnimation(anim);
//                        anim.setFillAfter(true);
//                    }
//                }
//            });
        }


    }
}
