package com.example.lcassiol.androidcustomlistview;

/**
 * Created by lcass on 9/24/2017.
 */

public class Person {

    private String name;
    private String description;
    private int image;


    public Person(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
