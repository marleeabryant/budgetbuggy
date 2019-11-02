package com.example.knownames;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Budget {

    ArrayList<Item> budItems;
    double totalCost;

    public Budget(ArrayList<Item> budItems, double totalCost) {
        this.budItems = budItems;
        this.totalCost = totalCost;
    }
   public Budget(){

   }
    public ArrayList<Item> getBudItems() {
        return budItems;
    }

    public void setBudItems(ArrayList<Item> budItems) {
        this.budItems = budItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Budget Items: " + budItems +
                "Budget Total: " + totalCost ;
    }
}
