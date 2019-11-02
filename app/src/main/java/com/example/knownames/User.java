package com.example.knownames;

import java.io.*;
import java.lang.*;
import java.util.*;

public class User {

    String Username;
    String Password;
    Budget currBudget;
    ArrayList<Item> userItems;
    ShoppingList currShopList;
    Double budgetAmt;
    ArrayList<Store> preferredStores;
    int shopPeriod;
    int budgetPeriod;


    public User(String UN, String PW) {
        Username = UN;
        Password = PW;
        currBudget = new Budget();
        currShopList = new ShoppingList();
        budgetAmt = 100.0;
        shopPeriod = 14;
        budgetPeriod = 30;
    }

        public void setBudgetAmt ( double amt){
            budgetAmt = amt;
        }

        public void setBudgetPeriod ( int per){
            budgetPeriod = per;
        }

        public void setShopPeriod ( int per){
            shopPeriod = per;
        }

        public void addStore (String name){
            Store pref = new Store(name);
            preferredStores.add(pref);
        }

        public void addItem (String ty, String nm, boolean need){
            Item myItem = new Item(ty, nm, strprice, need);
            userItems.add(myItem);
        }

    }

