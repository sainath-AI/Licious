package com.masai.licious.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masai.licious.Cart.BuyItemClickListner;
import com.masai.licious.R;

import java.util.ArrayList;

public class PrawnAdapter extends RecyclerView.Adapter<PrawnViewHolder> {

    ArrayList<ModelClass> modelClassArrayList;
    BuyItemClickListner listner ;

    public PrawnAdapter(ArrayList<ModelClass> modelClassArrayList,BuyItemClickListner listner) {
        this.listner=listner;
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public PrawnViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chicken_item_layout,parent,false);
        return new PrawnViewHolder(view,listner);
    }

    @Override
    public void onBindViewHolder(@NonNull  PrawnViewHolder holder, int position) {
        ModelClass modelClass=modelClassArrayList.get(position);
        holder.setdata(modelClass);
    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }
}
class PrawnViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvImage;
    private TextView mTvTitle, mTvDescription, mTvWeight, mTvPrice, mTvPlayVideo, mTvDeliveryTime;
    Button mBtnAddToCart;
    BuyItemClickListner listner;


    public PrawnViewHolder(@NonNull View itemView, BuyItemClickListner listner) {
        super(itemView);
        this.listner=listner;
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
        mBtnAddToCart=itemView.findViewById(R.id.btnAddToCart);
    }

    public void setdata(ModelClass modelClass) {
        mBtnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listner.onItemClick(modelClass,getAdapterPosition());
            }
        });
        mIvImage.setBackgroundResource(modelClass.getImage());
        mTvTitle.setText(modelClass.getTitle());
        mTvDescription.setText(modelClass.getDescription());
        mTvWeight.setText(modelClass.getWeight());
        mTvPrice.setText(modelClass.getPrice());
        mTvPlayVideo.setText(modelClass.getPlayVideo());
        mTvDeliveryTime.setText(modelClass.getDeliveryTime());
    }
}