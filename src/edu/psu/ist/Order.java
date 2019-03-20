/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Nahara M.
Date Developed: 3/13/19
Last Date Changed: 3/19/19
Rev: 8
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
    int cCount = 0;

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
    /*
    public Order setOrderItems() {
        return or;
    }
*/

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


    // Finish this method to generate order id for each new order
    public Order order() {
        Order or = new Order(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Menu ID: ");
        //or.setOrder(scnr.nextLine());
        cust.setCustomerPhone(scnr.nextLine());
        or.setorderId(cCount);


        return or;
    }



}
