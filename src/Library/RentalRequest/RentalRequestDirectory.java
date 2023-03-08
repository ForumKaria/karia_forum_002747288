/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.RentalRequest;

import Customer.Customer;
import Library.Library;
import Library.Material.Book;
import Library.Material.Magazine;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public class RentalRequestDirectory {

    private ArrayList<RentalRequest> rentalRequests;

    public RentalRequestDirectory() {
        this.rentalRequests = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getMasterRequestList() {
        return rentalRequests;
    }

    public RentalRequest requestRent(int duration, Book book, Magazine magazine, String branchName, Customer customer) {
        RentalRequest rr = new RentalRequest(duration, book, magazine, branchName, customer);
        rentalRequests.add(rr);
        System.out.println("SIZE" + rentalRequests);
        return rr;
    }
    
    public void removeFromRentalRequests(String id) {
        for (RentalRequest rr : this.rentalRequests) {
            if(rr.getId().equals(id)){
                this.rentalRequests.remove(rr);
            }
        }
    }
    
    public RentalRequest findRentalRequests(String id) {
        for (RentalRequest rr : rentalRequests) {
            if(rr.getId().equals(id)){
                return rr;
            }
        }
        return null;
    }

    
    public int calculateTotalRevenue() {
        int sum = 0;
        for (RentalRequest rr : rentalRequests) {
            if (rr.getStatus().equals("Rented") || rr.getStatus().equals("Returned")) {
                sum = sum + rr.getPrice();
            }

        }
        return sum;
    }

}
