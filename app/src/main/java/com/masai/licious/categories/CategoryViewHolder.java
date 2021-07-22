package com.masai.licious.categories;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.masai.licious.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvImage;
    private TextView mTvTitle, mTvDescription, mTvWeight, mTvPrice, mTvPlayVideo, mTvDeliveryTime;

    public CategoryViewHolder(@NonNull View itemView) {
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

    public void setData(CategoryModel categoryModel) {
        mIvImage.setBackgroundResource(categoryModel.getImage());
        mTvTitle.setText(categoryModel.getTitle());
        mTvDescription.setText(categoryModel.getDescription());
        mTvWeight.setText(categoryModel.getWeight());
        mTvPrice.setText(categoryModel.getPrice());
        mTvPlayVideo.setText(categoryModel.getPlayVideo());
        mTvDeliveryTime.setText(categoryModel.getDeliveryTime());
    }
}