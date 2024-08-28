package org.samsung;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(String name, String number, String email) {
        if (isEmailUnique(email)) {
            Customer customer = new Customer(name, number, email);
            customers.add(customer);
            System.out.println("Customer have been added!");
        } else {
            System.out.println("Email already exists. Can't add new customer.");
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    private boolean isEmailUnique(String email) {
        for (Customer c : customers) {
            if (c.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }
}

