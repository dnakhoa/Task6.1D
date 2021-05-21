package com.example.FoodRescueApp.model;

import android.graphics.Bitmap;

import java.io.ByteArrayOutputStream;
import java.util.Date;

public class Food
{
    // Variables
    private int food_id;
    private int user_id;
    private Bitmap image;
    private String title;
    private String description;
    private long date;
    private long time;
    private int quantity;
    private String location;

    // Constructors
    public Food()
    {

    }

    public Food(int user_id, Bitmap image, String title, String description, long date, long time, int quantity, String location) {
        this.user_id = user_id;
        this.image = image;
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
        this.quantity = quantity;
        this.location = location;
    }

    // Extra method to get image's blob
    public byte[] getImageBlob()
    {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        this.image.compress(Bitmap.CompressFormat.PNG, 0, outputStream);
        return outputStream.toByteArray();
    }


    // Getter and Setter

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public String getShortDescription()
    {
        if (description.length() < 60) return description;
        else return description.substring(0, 80) + "....";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time.getTime();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
