/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import Branch.Branch;
import Customer.CustomerDirectory;
import Role.AdminRole;
import Useraccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class AppSystem {
    ArrayList<Branch> branches;
    private UserAccountDirectory useraccountDirectory;
    private CustomerDirectory customerDirectory;

    
    public AppSystem(){
        this.branches = new ArrayList<Branch>();
        this.useraccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.useraccountDirectory.createUserAccount("admin", "admin", new AdminRole());
    }

    public
    ArrayList<Branch> getBranches() {
        return branches;
    }

    public
    void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public
    UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public
    void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public
    CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public
    void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
}
