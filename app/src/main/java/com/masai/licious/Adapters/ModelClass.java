package com.masai.licious.Adapters;

public class ModelClass {
    private final int image;
    private final String title;
    private final String description;
    private final String weight;
    private final String price;
    private final String playVideo;
    private final String deliveryTime;



    public ModelClass(int image, String title, String description, String weight, String price, String playVideo, String deliveryTime) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.weight = weight;
        this.price = price;
        this.playVideo = playVideo;
        this.deliveryTime = deliveryTime;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getWeight() {
        return weight;
    }

    public String getPrice() {
        return price;
    }

    public String getPlayVideo() {
        return playVideo;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

}
