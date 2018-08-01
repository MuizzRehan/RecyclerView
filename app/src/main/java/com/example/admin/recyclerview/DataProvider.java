package com.example.admin.recyclerview;

public class DataProvider {
    private int image_res;
    private String title;
    private String description;


    public DataProvider(int image_res, String title, String description) {
        this.image_res = image_res;
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage_res() {
        return image_res;
    }

    public void setImage_res(int image_res) {
        this.image_res = image_res;
    }
}
