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
    double budgetAmt;
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

    public void setBudgetAmt (double amt){
            budgetAmt = amt;
        }

        public void setBudgetPeriod ( int per){
            budgetPeriod = per;
        }

        public void setShopPeriod ( int per){
            shopPeriod = per;
        }

        public int getShopPeriod () {return shopPeriod;}

        // add methods to MainActivity
       /* public void addStore (String name){
            Store pref = new Store(name);
            preferredStores.add(pref);
        } */

        public void addItem (String ty, String nm, String strnm, double strprc, boolean need){
            Item myItem = new Item(ty, nm, strnm, strprc, need);
            userItems.add(myItem);
        }

        public void createBudget () {
            for(int i = 0; i < userItems.size(); i++)
            {
                if(userItems.get(i).budgetStatus) {
                    currBudget.addItem(userItems.get(i));
                }
            }
        }

        public void createShoppingList () {
            for(int i = 0; i < userItems.size(); i++)
            {
                if(userItems.get(i).listStatus) {
                    currShopList.addItemToCart(userItems.get(i));
                }
            }
        }
    }

