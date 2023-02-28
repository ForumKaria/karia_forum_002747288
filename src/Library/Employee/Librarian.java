/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;

import Library.RentalRequest.RentalRequest;
import Personnel.Person;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class Librarian extends Person{

    ArrayList<RentalRequest> rentalRequests;
    
    public Librarian(int id, String firstName, String lastName){
        super();
        this.personType = "Librarian";
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.rentalRequests = new ArrayList<RentalRequest>();
    }


    public
    ArrayList<RentalRequest> getRentalRequest() {
        return rentalRequests;
    }

    public
    void addToRentalRequests(RentalRequest rentalRequest) {
        this.rentalRequests.add(rentalRequest);
        
    }
    
    public void acceptRentalRequest( int id){
        for( RentalRequest rr : this.rentalRequests){
            if(id == rr.getId()){
                rr.setIsAccepted(true);
            }
        }
    }
    
    public void rejectRentalRequest( int id){
        for( RentalRequest rr : this.rentalRequests){
            if(id == rr.getId()){
                rr.setIsAccepted(false);
            }
        }
    }
   
    
}
