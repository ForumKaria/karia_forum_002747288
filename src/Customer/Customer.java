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
import javax.swing.JOptionPane;

/**
 *
 * @author forumkaria
 */
public class Customer extends Person {

    private ArrayList<RentalRequest> customerRentalRequests;
    private RentalRequest curRentalRequest;

    public Customer() {
        super();
        this.customerRentalRequests = new ArrayList<RentalRequest>();
    }

    public RentalRequest getCurRentalRequest() {
        return curRentalRequest;
    }

    public void setCurRentalRequest(RentalRequest curRentalRequest) {
        this.curRentalRequest = curRentalRequest;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<RentalRequest> getCustomerRentalRequests() {
        return customerRentalRequests;
    }

    public RentalRequest addRequest(RentalRequest rr) {
        this.curRentalRequest = rr;
        this.customerRentalRequests.add(rr);

        return rr;

    }

    public void returnRequest(String id) {
        this.curRentalRequest.setStatus("Returned");

    }

    public RentalRequest findRequest(String id) {
        for (RentalRequest rentalReq : this.customerRentalRequests) {
            if (rentalReq.getId().equals(id)) {
                return rentalReq;
            }
        }
        return null;
    }
    
//    public boolean checkRentalRequest(String rentalRequest, String customerID) {

//    boolean requestAlreadyExists = false;

//
//    if (requestAlreadyExists) {
//        JOptionPane.showMessageDialog(null, "This rental request has already been added to your history.");
//        return false;
//    } else {
//        return true;
//    }
//}

}
