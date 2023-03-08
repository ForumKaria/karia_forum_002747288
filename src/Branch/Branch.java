/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Branch;

import Customer.Customer;
import Customer.CustomerDirectory;
import Library.Library;
import Useraccount.UserAccount;
import Useraccount.UserAccountDirectory;

/**
 *
 * @author forumkaria
 */
public
        class Branch {
    private String name;
    private Library library;
    UserAccountDirectory branchuseraccountDirectory;
    CustomerDirectory customerDirectory;

    
    
    public Branch(String name){
        this.name = name; 
        this.branchuseraccountDirectory = new UserAccountDirectory();
        this.library = new Library(01);
    }

    public
    Library getLibrary() {
        return library;
    }

    public
    void setLibrary(Library library) {
        this.library = library;
    }

    
    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }
    
    public Library addLibrary(int buildingNo){
        return this.library = new Library(buildingNo);
    }
    
    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }
    
    public
    CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public
    void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public UserAccount findById(String id){
        for (UserAccount u: branchuseraccountDirectory.getUserAccounts()){
            if (u.getAccountId().equals(id)){
                return u;
            }
        }
        return null;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
