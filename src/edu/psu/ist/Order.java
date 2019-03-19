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


public class Order {
    private double price;
    //Class Level Variables - Protect the data
    private int orderId;
    private Customer cust;
    private MenuItem menu;
    private int custID, quantity;
    private double totalPrice;

    //Constructor Method
    public Order(int _orderId) {
        this.orderId = _orderId;
    }
    public Order() {
    }

    public Order(int _orderId, double _totalPrice) {
        this.orderId = _orderId;
        this.price = _totalPrice;

    }


    public int getOrder (){
        return orderId;
    }


    public int getQuantity() {
        Scanner input = new Scanner(System.in);
        quantity = input.nextInt();
        return quantity;

    }


    public void printOrder(double _subtotal, double _price, int _quantity, String menuItem) {

        System.out.printf("\n" + menuItem, "$ " + _price, " * " +  _quantity, "=" + _subtotal);

    }

    //Setters and Getters
    public int getorderId() {
        return orderId;
    }

    public void setorderId(int _orderId) {
        this.orderId = _orderId;
    }

    //print order details
    public static void listOrder(ArrayList<Order> oList) {
        for (Order orderDetails : oList) {
            System.out.println(orderDetails.getOrder());
        }
    }

    public double getSubTotal(double _price, double quantity) {
        double subTotal = _price * quantity;
        totalPrice += subTotal;
        return subTotal;
    }



}
