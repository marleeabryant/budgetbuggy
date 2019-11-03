package com.example.knownames;

import java.util.*;

public class ShoppingList {

    ArrayList<Item> shopItems;
    double cartCost;

    public ShoppingList() {

    }

    public ShoppingList(ArrayList<Item> shopItems, double cartCost) {
        this.shopItems = shopItems;
        this.cartCost = cartCost;
    }

    public ArrayList<Item> getShopItems() {
        return shopItems;
    }

    public void setShopItems(ArrayList<Item> shopItems) {
        this.shopItems = shopItems;
    }

    public double getCartCost() {
        return cartCost;
    }

    public void setCartCost(double cartCost) {
        this.cartCost = cartCost;
    }

    public void addItemToCart(Item myItem) {
        shopItems.add(myItem);
    }

    public double calcTotalCartCost() {
        double sum=0.0;
        for(int i=0;i<shopItems.size();i++) {
            sum += shopItems.get(i).getStrPrice();
        }
        return sum;
    }

}
