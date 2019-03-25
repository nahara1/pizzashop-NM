/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Nahara M.
Date Developed: 3/13/19
Last Date Changed: 3/24/19
Rev: 9
 */

package edu.psu.ist;

import java.util.*;

enum Size {small, medium, large}

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
        for (MenuItem menuitem : mList) {
            System.out.println(menuitem.getmenuItem());

        }
    }

    public MenuItem printMenuInfo() {

        //System.out.print("-------------------------\n");​
        System.out.printf("%-1s | %-12s | %-12s\n", menuId, itemName, "$" + price);
        return null;

    }


}

