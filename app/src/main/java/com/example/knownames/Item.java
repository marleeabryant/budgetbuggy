package com.example.knownames;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Item {

    String [] types = {"Food", "Toiletry", "Cosmetic", "Cleaning", "Office", "Other"};
    String name;
    Choice price;
    int time;
    boolean listStatus;
    ArrayList<Choice> possiblePrices;
    Date lastPurchased;
    ArrayList<Date> times;
    boolean budgetStatus;
}
