package com.example.knownames;

public class Choice {

    private String storeName;
    private double priceAtStore;

    public Choice() {
    }

    public Choice(String storeName, double priceAtStore) {
        this.storeName = storeName;
        this.priceAtStore = priceAtStore;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getPriceAtStore() {
        return priceAtStore;
    }

    public void setPriceAtStore(double priceAtStore) {
        this.priceAtStore = priceAtStore;
    }

    @Override
    public String toString() {
        return "Store name: " + storeName + "\n" +
                "Store Price: " + priceAtStore;
    }
}
