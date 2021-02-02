package org.launchcode.java.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

//    public ArrayList<MenuItem> addItem(MenuItem item) {
//        this.items.add(item);
//        return this.items;
//    }
//
//    public ArrayList<MenuItem> removeItem(MenuItem item) {
//        this.items.remove(item);
//        return this.items;
//    }
//
//    public String whenUpdated() {
//        return this.lastUpdated;
//    }
}