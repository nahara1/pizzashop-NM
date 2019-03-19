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

        // prompt user
        userAction = getAction(PROMPT_ACTION);

        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE:
                    cList.add(cust.addCustomer());

                    break;
                case MENU_CODE:
                    MenuItem.listMenu(mList);
                    break;

                case CUST_PRNT:
                    System.out.printf("%-10s | %-12s | %-10s\n", "ID", "Name", "Phone Number");
                    Customer.printCustomer(cList);
                    break;

                // clean it up
                case ORDER_CODE: //addOrders();
                    // add loop to prompt user to order more items
                    String userInput = "Type 'Y'es to order or type 'N'o to go back to the main menu: ";
                    userAction = getAction(userInput);
                    while (userAction != 'N') {
                        MenuItem.listMenu(mList);
                        //oList.add(main.addOrder());
                        Order o1 = new Order();
                        o1.getorderId();
                        oList.add(main.addOrder());
                        //get input menu id
                        Scanner input = new Scanner(System.in);
                        System.out.println("Enter menu item id: ");
                        int menuId = input.nextInt();
                        System.out.println("Enter quantity: ");
                        int qty = o1.getQuantity();
                        switch (menuId) {
                            case 1:
                                subTotal = o1.getSubTotal(menu1.getPrice(1), qty);
                                System.out.println("$ " + subTotal);
                                orderTotal += subTotal;
                                //o1.printOrder(subTotal, menu1.getPrice(1), qty, menu1.getmenuItem());
                                userAction = getAction(userInput);
                                break;
                            case 2:
                                subTotal = o1.getSubTotal(menu2.getPrice(2), qty);
                                System.out.println("$ " + subTotal);
                                orderTotal += subTotal;
                                userAction = getAction(userInput);
                                break;
                            case 3:
                                subTotal = o1.getSubTotal(menu3.getPrice(3), qty);
                                System.out.println("$ " + subTotal);
                                orderTotal += subTotal;
                                userAction = getAction(userInput);
                                break;
                            case 4:
                                subTotal = o1.getSubTotal(menu4.getPrice(4), qty);
                                System.out.println("$ " + subTotal);
                                orderTotal += subTotal;
                                userAction = getAction(userInput);
                                break;
                        }
                    }


                    //print order
                    break;
                case TRAN_CODE: //listTransactions();
                    //                 System.out.println("Enter payment type: " + trans1.setPaymentType());
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
/*
    public Customer addCustomer() {
        Customer cust = new Customer(cCount++);
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        cust.setCustomerName(scnr.nextLine());
        System.out.println("Please Enter your Phone: ");
        cust.setCustomerPhone(scnr.nextLine());


        return cust;
    }
*/
    // add order method

    public Order addOrder() {
        Order or = new Order(cCount++);

        return or;
    }



}

