package org.samsung;

import java.util.Scanner;

public class CustomerApp {
    private static CustomerService customerService = new CustomerService();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Choose an option: 1 (create customers), 2 (show all customers), 3 (exit)");
            int option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {
                case 1:
                    createCustomer(scanner);
                    break;
                case 2:
                    viewCustomers();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("No option.");

            }
        }
    }

    private static void createCustomer(Scanner scanner)
    {

        System.out.print("Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Customer Number: ");
        String number = scanner.nextLine();
        System.out.print("Customer Email: ");
        String email = scanner.nextLine();

        customerService.addCustomer(name, number, email);

    }

    private static void viewCustomers() {
        System.out.println("Show All Customers:");
        for (Customer customer : customerService.getCustomers())
        {
            System.out.println(customer);

        }
    }
}
