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
import java.io.PrintStream;


public class Main {
    private String customerName;
    private String customerPhoneNumber;
    int cCount = 1;


    public static void main(String[] args) {

        Main main = new Main();

        // Customer obj
        Customer cust = new Customer();
        // Customer obj
        Order or = new Order();
        // Transaction obj
        Transaction trans = new Transaction();

        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<MenuItem> mList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();
        double subTotal;
        double orderTotal = 0;


        final char EXIT_CODE = 'E';
        final char CUST_CODE = 'C';
        final char CUST_PRNT = 'P';
        final char MENU_CODE = 'M';
        final char ORDER_CODE = 'O';
        final char TRAN_CODE = 'T';
        final char HELP_CODE = '?';

        char userAction;

        final String PROMPT_ACTION = "Add 'C'ustomer, 'P'rint Customers, List 'M'enu, Add 'O'rder, List 'T'ransaction or 'E'xit: ";


        MenuItem menu1 = new MenuItem(1, "Plain", 11.99);
        MenuItem menu2 = new MenuItem(2, "Meat", 12.99);
        MenuItem menu3 = new MenuItem(3, "Extra", 13.99);
        MenuItem menu4 = new MenuItem(4, "Veg", 12.99);

        mList.add(menu1);
        mList.add(menu2);
        mList.add(menu3);
        mList.add(menu4);


        // prompt user
        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE:
                    cList.add(cust.addCustomer());

                    break;
                case MENU_CODE:
                    //MenuItem.listMenu(mList);
                   // System.out.printf("%-1s | %-12s | %-12s\n", " ", "Item  ", "Price");
                    System.out.println("Pizza Shop Menu");
                    //MenuItem.listMenu(mList);
                    menu1.printMenuInfo();
                    menu2.printMenuInfo();
                    menu3.printMenuInfo();
                    menu4.printMenuInfo();
                    break;

                case CUST_PRNT:
                    System.out.printf("%-10s | %-12s | %-10s\n", "ID", "Name", "Phone Number");
                    Customer.printCustomer(cList);
                    break;


                case ORDER_CODE: //addOrders();
                    // add loop to prompt user to order more items
                    String userInput = "Type 'Y'es to order or type 'N'o to go back to the main menu: ";
                    userAction = getAction(userInput);
                    while (userAction != 'N') {
                        //oList.add(main.addOrder());

                        /*Order o1 = new Order();
                        o1.getorderId();
                        oList.add(main.addOrder());
                        */

                        //get input menu id
                        Scanner input = new Scanner(System.in);
                        menu1.printMenuInfo();
                        menu2.printMenuInfo();
                        menu3.printMenuInfo();
                        menu4.printMenuInfo();


                        //using order() method
                        //or.order();


                        System.out.println("Enter menu item id: ");
                        int menuId = input.nextInt();
                        System.out.println("Enter quantity: ");
                        int qty = or.getQuantity();
                        or.setQuantity(qty);

                        oList.add(or.order());

                        switch (menuId) {
                            case 1:
                                subTotal = or.getSubTotal(menu1.getPrice(1), qty);
                                //System.out.println("$ " + subTotal);
                                orderTotal += subTotal;
                                or.printOrder(subTotal, menu1.getPrice(1), qty, menu1.getmenuItem());
                                userAction = getAction(userInput);
                                break;
                            case 2:
                                subTotal = or.getSubTotal(menu2.getPrice(2), qty);
                                //System.out.println("$ " + subTotal);
                                orderTotal += subTotal;
                                or.printOrder(subTotal, menu2.getPrice(2), qty, menu1.getmenuItem());
                                userAction = getAction(userInput);
                                break;
                            case 3:
                                subTotal = or.getSubTotal(menu3.getPrice(3), qty);
                                //System.out.println("$ " + subTotal);
                                orderTotal += subTotal;
                                or.printOrder(subTotal, menu3.getPrice(3), qty, menu1.getmenuItem());
                                userAction = getAction(userInput);
                                break;
                            case 4:
                                subTotal = or.getSubTotal(menu4.getPrice(4), qty);
                                //System.out.println("$ " + subTotal);
                                orderTotal += subTotal;
                                or.printOrder(subTotal, menu4.getPrice(4), qty, menu1.getmenuItem());
                                userAction = getAction(userInput);
                                break;
                        }

                    }


                    //print order

                    or.listOrder(oList);
                    break;
                case TRAN_CODE: //listTransactions();
                    //                 System.out.println("Enter payment type: " + trans1.setPaymentType());

                    /* doesn't work - needs fixing
                    String input_cust = "Type 'N' to add a new customer or 'E' for an existing customer";
                    userAction = getAction(input_cust);

                    if (userAction == 'E') {

                        System.out.println(cust.getCustomerName(cust.getCust()) + "Your order total is: $ " + orderTotal);


                        System.out.println("Enter Customer ID: ");
                        Scanner scnr = new Scanner(System.in);
                        int input = scnr.nextInt();
                        System.out.println(cust.getCustomerName(input) + "Your order total is: $ " + orderTotal);


                    }

                    if (userAction == 'N') {
                        cList.add(cust.addCustomer());
                        cust.getCust();

                    }
                    */

                    Transaction trans1 = new Transaction(1);
                    tList.add(trans1);
                    System.out.println("Your order total is: $ " + orderTotal);
                    // trans1.selectPayType();
                    trans1.setPaymentType(trans1.selectPayType());

                    System.out.println("Receipt: ");
                    trans1.printReceipt(orderTotal, trans1.getPaymentType());
                    trans1.listTransactions(tList);


                    break;
                case HELP_CODE: //
                    break;
            }

            userAction = getAction(PROMPT_ACTION);
        }
    }

    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.println(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }
}