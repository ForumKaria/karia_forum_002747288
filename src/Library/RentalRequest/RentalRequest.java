/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.RentalRequest;

import Customer.Customer;
import Library.Library;
import Library.Material.Book;
import Library.Material.Magazine;

/**
 *
 * @author forumkaria
 */
public
        class RentalRequest {
    
    Book book;
    Magazine mag;
    String id;
    private static int count = 0;
    int price;
    boolean isAccepted;
    int duration;
    Customer customer;
    Library library;
    
    public RentalRequest(int duration, Book book, Magazine magazine, Library library, Customer customer){
        
    }

    public
    Book getBook() {
        return book;
    }

    public
    void setBook(Book book) {
        this.book = book;
    }

    public
    int getPrice() {
        return price;
    }

    public
    void setPrice(int price) {
        this.price = price;
    }

    public
    boolean isIsAccepted() {
        return isAccepted;
    }

    public
    void setIsAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public
    int getDuration() {
        return duration;
    }

    public
    void setDuration(int duration) {
        this.duration = duration;
    }
    
    
}
