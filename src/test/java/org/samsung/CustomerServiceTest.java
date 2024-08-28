package org.samsung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class CustomerServiceTest
{
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        customerService = new CustomerService();
    }

    @Test
    public void testAddCustomerWithUniqueEmail() {
        customerService.addCustomer("An", "A001", "An@gmail.com");
        assertEquals(1, customerService.getCustomers().size());
    }

    @Test
    public void testAddCustomerWithDuplicateEmail() {
        customerService.addCustomer("Ngoc", "C001", "Minh@example.com");
        customerService.addCustomer("Minh", "C002", "Minh@example.com");
        assertEquals(1, customerService.getCustomers().size());
    }

    @Test
    public void testGetCustomers() {
        customerService.addCustomer("Ngoc", "C001", "Minh@example.com");
        customerService.addCustomer("Minh", "C002", "Minh@example.com");
        assertEquals(1, customerService.getCustomers().size());
    }
}
