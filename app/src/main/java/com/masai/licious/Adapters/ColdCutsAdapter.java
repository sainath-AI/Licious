package com.masai.licious.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masai.licious.R;

import java.util.ArrayList;

public class ColdCutsAdapter extends RecyclerView.Adapter<COldCutsViewHolder> {

    ArrayList<ModelClass> modelClassArrayList;

    public ColdCutsAdapter(ArrayList<ModelClass> modelClassArrayList) {
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public COldCutsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chicken_item_layout,parent,false);
        return new COldCutsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  COldCutsViewHolder holder, int position) {
        ModelClass modelClass=modelClassArrayList.get(position);
        holder.setdata(modelClass);
    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }
}
class COldCutsViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvImage;
    private TextView mTvTitle, mTvDescription, mTvWeight, mTvPrice, mTvPlayVideo, mTvDeliveryTime;


    public COldCutsViewHolder(@NonNull View itemView) {
        super(itemView);
        iniViews(itemView);
    }

    private void iniViews(View itemView) {
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvTitle = itemView.findViewById(R.id.tvTitle);
        mTvDescription = itemView.findViewById(R.id.tvDescription);
        mTvWeight = itemView.findViewById(R.id.tvWeight);
        mTvPrice = itemView.findViewById(R.id.tvPrice);
        mTvPlayVideo = itemView.findViewById(R.id.tvPlayVideo);
        mTvDeliveryTime = itemView.findViewById(R.id.tvDeliveryTime);
    }

    public void setdata(ModelClass modelClass) {
        mIvImage.setBackgroundResource(modelClass.getImage());
        mTvTitle.setText(modelClass.getTitle());
        mTvDescription.setText(modelClass.getDescription());
        mTvWeight.setText(modelClass.getWeight());
        mTvPrice.setText(modelClass.getPrice());
        mTvPlayVideo.setText(modelClass.getPlayVideo());
        mTvDeliveryTime.setText(modelClass.getDeliveryTime());
    }
}