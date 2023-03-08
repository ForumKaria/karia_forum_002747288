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
public class Librarian extends Person{
    public ArrayList<RentalRequest> requestList;
    
    public Librarian(){
        super();
        this.requestList = new ArrayList<RentalRequest>();
    }

    public ArrayList<RentalRequest> getRequestList() {
        return requestList;
    }
}
