/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Nahara M.
Date Developed: 3/13/19
Last Date Changed: 3/17/19
Rev: 7
 */

package edu.psu.ist;

import java.util.*;

enum size {small, medium, large}

public class MenuItem {

    //Class Level Variables - Protect the data
    private int menuId;
    protected ArrayList menuList;
    protected double price;
    protected String itemName;



    public MenuItem() {
        menuList = new ArrayList<MenuItem>();
    }

    public void addItem(MenuItem _item) {
        menuList.add(_item);
    }


    //Constructor Method
    public MenuItem(int _menuId, String _itemName, double _price) {
        this.menuId = _menuId;
        this.itemName = _itemName;
        this.price = _price;
    }




    //Setters and Getters
    public int getmenuId() {
        return menuId;
    }


    public void setmenuId(int _menuId) {
        this.menuId = _menuId;
    }

    public String getmenuItem() {
        return itemName;
    }
    // public void setmenuItem(String _itemName) {this.itemName = _itemName;}

    public void setmenuItem(String _itemName) {
        menuList.add(_itemName);
    }

    public void setPrice(double _price) {
        menuList.add(_price);
    }

    public double getPrice(int _menuId) {
        this.menuId = _menuId;
        return price;
    }

    //add method to change menuItem price depending on the size

    public static void listMenu(ArrayList<MenuItem> mList) {
        for (MenuItem menu : mList) {
            System.out.println(menu.getmenuItem());
        }
    }

    public void printMenuInfo() {
        System.out.printf("%-10s | %-12s\n", " ", "Price");
        //System.out.print("-------------------------\n");​
        System.out.printf("%-10s | %-12s\n", itemName, price);

    }


}

