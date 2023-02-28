/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Personnel.Person;
import Library.RentalRequest.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class Customer extends Person{
   RentalRequest rentalRequestMade;
   private ArrayList<RentalRequest> customerRentalList;
   
   
   public Customer() {
        super();
//        this.personType = "Customer";
//        this.personType = "Librarian";
    }
   

    public
    RentalRequest getRentalRequestMade() {
        return rentalRequestMade;
    }

    public
    void setRentalRequestMade(RentalRequest rentalRequestMade) {
        this.rentalRequestMade = rentalRequestMade;
    }
   
   
           
}
