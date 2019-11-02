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
    Date lastPurchased;
    ArrayList<Date> times;
    boolean budgetStatus;

    public Item(String ty, String nm, String strnm, double strpr, boolean need) {
        type = ty;
        name = nm;
        price = new Choice(strnm, strpr);
        if(need) {
            listStatus = true;
            budgetStatus = true;
        }
        else {
            listStatus = false;
            budgetStatus = false;
        }
    }
}





