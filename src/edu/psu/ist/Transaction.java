/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author: Nahara M.
Date Developed: 3/13/19
Last Date Changed: 3/26/19
Rev: 10
 */
package edu.psu.ist;

import java.util.*;

enum PaymentType {credit, cash}

public class Transaction {

    //Class Level Variables - Protect the data
    private int transactionId;
    private Order order;
    private PaymentType payment;
    private final double tax = 0.05;

    //Constructor Method
    public Transaction(){}

    public Transaction(int _transactionId, Order _order, PaymentType _pType){
        this.transactionId = _transactionId;
        this.order = _order;
        this.payment = _pType;
    }

    public Transaction(int _transactionId) {
        this.transactionId = _transactionId;
    }


    // get order total ??
    public String getOrderTotal (Order order) {
            Transaction transaction = new Transaction();

            return "Total: $ ";
    }

/*
    public String getTotal (Order order) {
        Transaction transaction = new Transaction();
        transaction.setPaymentType();

        return "Total: $ ";
    }

    */

    //Setters and Getters
    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int _transactionId) {this.transactionId = _transactionId;}

    public PaymentType selectPayType() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter payment type: ");
            payment = PaymentType.valueOf(input.next().toLowerCase());
            // add if statement for cash payment to calculate change
            return payment;
        }

    public static void listTransactions(ArrayList<Transaction> tList){
        for (Transaction trans: tList){
            System.out.println("Transaction ID: " + trans.getTransactionId());
            //System.out.println("Order:" + trans.getOrder());  //TODO: Print order
            System.out.println("Payment Type: " + trans.getPaymentType());
        }
    }
    public Order getOrder() { return order; }
    public void setOrder(Order _order) {this.order = _order;}

    public PaymentType getPaymentType() { return payment; }
    public void setPaymentType(PaymentType _payment) {this.payment = _payment;}

    public void printReceipt(double _total, PaymentType _payment) {

        System.out.println("Customer Name:         ");
        System.out.printf("%-10s _ %-10s", "Order         ", "$ ");
        System.out.printf("%.2f\n", _total);

        double total = _total + _total*tax;

        System.out.printf("%-10s _ %-10s", "Tax           ", "$ ");

        System.out.print(" ");

        System.out.printf("%.2f\n", tax*_total);

        System.out.printf("%-10s _ %-10s", "Total w/ tax  ", "$    ");

        System.out.printf("%.2f\n", total);

        System.out.printf("%-10s _ %-10s\n", "Payment type  ", "    ", _payment);

    }
/*
    public PaymentType getPaymentType() { return PaymentType; }
    public void setPaymentType(PaymentType _paymentType) {PaymentType = _paymentType;}
*/
}
