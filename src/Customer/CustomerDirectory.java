/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class CustomerDirectory {
    
    ArrayList<Customer> customerlist;
    
    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }

    public
    ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public
    void addtoCustomerlist(Customer customer) {
        this.customerlist.add(customer);
    }
    
    public Customer createCustomer() {
        return null;
    }
}
