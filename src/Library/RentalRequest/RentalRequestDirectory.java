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
    
    public RentalRequestDirectory(){
        this.rentalRequests = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getMasterRequestList() {
        return rentalRequests;
    }

    public void requestRent(int duration, Book book, Magazine magazine, Library library, Customer customer) {
        RentalRequest rr = new RentalRequest( duration, book,  magazine,  library,  customer);
        rentalRequests.add(rr);
    }
    
    public int calculateTotalRevenue(){
        int sum = 0;
        for(RentalRequest rr : rentalRequests){
            sum = sum + rr.getPrice() * rr.getDuration();
        }
        return sum;
    }
    
    

}
