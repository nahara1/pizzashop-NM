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

public class Customer {
    //Class Level Variables - Protect the data
    private int customerId;
    protected String custName, custPhone;


    public static void printCustomer(ArrayList<Customer> cList){
        for (Customer cust: cList){
            //System.out.println("Customer Id: " + cust.getCustomerId());
            System.out.printf("%-10s | %-12s\n", cust.getCustomerName(), cust.getCustomerPhone());
        //    System.out.println("Customer Name: " + cust.getCustomerName());
        //    System.out.println("Customer Phone: " + cust.getCustomerPhone());
        }
    }

    //Constructor

    public Customer(int _customerId) {
        this.customerId = _customerId;
    }
    public Customer(int _customerId, String name, String phoneNumber) {
        this.customerId = _customerId;
        this.custName  = name;
        this.custPhone = phoneNumber;
    }

    public void setCustomer(int _customerId, String name, String phoneNumber) {
        this.customerId = _customerId;
        this.custName  = name;
        this.custPhone = phoneNumber;
    }

    public static void listCust(ArrayList<Customer> cList) {
        for (Customer customer : cList) {
            System.out.println(customer.getCustomerName());
        }
    }


    //Setters and Getters
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int _customerId) {this.customerId = _customerId;}

    public String getCustomerName() { return custName; }
    public void setCustomerName(String _customerName) {this.custName = _customerName;}

    public String getCustomerPhone() { return custPhone; }
    public void setCustomerPhone(String _customerPhone) {this.custPhone = _customerPhone;}








/*
    public void addNewCustomer () {
        // get input for new customer
        Scanner input = new Scanner(System.in);

        System.out.println("Enter customer ID: ");
        customerId = input.nextInt();
        setCustomerId(customerId);

        System.out.println("Enter customer name: ");
        custName = input.nextLine() + " ";
        setCustomerName(custName);

        System.out.println("Enter customer phone number: ");
        custPhone = input.nextLine() + " ";
        setCustomerPhone(custPhone);
        printCustomers();


        new Customer(customerId, custName, custPhone);
}
*/




    public void printCustomers() {
        getCustomerId();
        getCustomerName();
        getCustomerPhone();

    }
}
