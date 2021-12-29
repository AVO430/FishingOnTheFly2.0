package com.example.operationrollingthunder40;


/*
   Class used to initialize the river images and text
   passed from the Setting Fragment Class
 */

public class SettingModel {

    int images;
    String text;

    public SettingModel(int images, String text) {
        this.images = images;
        this.text = text;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
