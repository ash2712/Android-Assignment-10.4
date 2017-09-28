package com.example.ayush.fragmentapplication;

/**
 * Created by ayush on 9/28/2017.
 */

public class Data {

    //Creates a data type where the title, description and image can be stored

    String name;
    String description;
    int id;
    //id stores the location of the image

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }
}
