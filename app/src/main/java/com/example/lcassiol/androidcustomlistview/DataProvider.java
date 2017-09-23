package com.example.lcassiol.androidcustomlistview;

/**
 * Created by lcass on 9/23/2017.
 */

public class DataProvider {
    private int icon;
    private String name;
    private String description;

    public DataProvider(int icon, String name, String description) {
        this.icon = icon;
        this.name = name;
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
