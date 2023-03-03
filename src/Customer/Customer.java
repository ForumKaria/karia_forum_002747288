/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Library.Library;
import java.util.ArrayList;
import Personnel.Person;
import Library.RentalRequest.RentalRequest;
import Library.Material.Book;
import Library.Material.Magazine;

/**
 *
 * @author forumkaria
 */
public
        class Customer extends Person{
   private ArrayList<RentalRequest> customerRentalRequests;
   
   
   public Customer() {
        super();
        this.customerRentalRequests = new ArrayList<RentalRequest>();
    }

    public
    ArrayList<RentalRequest> getCustomerRentalRequests() {
        return customerRentalRequests;
    }

    public RentalRequest addRequest(int duration, Book book, Magazine magazine, Library library, Customer customer){
        RentalRequest rentalReq = new RentalRequest(duration, book, magazine, library, customer);
        this.customerRentalRequests.add(rentalReq);
        
        return rentalReq;
        
    }
   
    public RentalRequest findRequest(String id){
        for (RentalRequest rentalReq: this.customerRentalRequests){
            if (rentalReq.getId().equals(id)){
                return rentalReq;
            }
        }
        return null;
    }
   
           
}
