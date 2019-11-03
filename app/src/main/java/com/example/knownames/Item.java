package com.example.knownames;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Item {
    String type;
    String name;
    Choice price;
    int time;
    boolean listStatus;
    int lastPurchased;
    ArrayList<Integer> times;
    boolean budgetStatus;

    public Item(String ty, String nm, String strnm, double strpr, boolean need) {
        type = ty;
        name = nm;
        price = new Choice(strnm, strpr);
        if (need) {
            listStatus = true;
            budgetStatus = true;
        } else {
            listStatus = false;
            budgetStatus = false;
        }
    }

    public double getStrPrice() {
        return price.getPriceAtStore();
    }


    public void addDate(int tm, int lp) {
        lastPurchased = lp;
        time = tm;
        int tmp = tm - lp;
        Integer nextTime = new Integer(tmp);
        changeBS(nextTime);
        changeLS(nextTime);
        times.add(tm);
    }

    public void changeBS(int nxTime) {
        if (nxTime < 30)
            budgetStatus = true;
    }

    public void changeLS(int nxTime) {
        if (nxTime < 14)
            listStatus = true;
    }
}





