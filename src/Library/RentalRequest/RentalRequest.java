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
    Magazine magazine;
    String id;
    private static int count = 0;
    int price = 10;
    String status;
    int duration;
    Customer customer;
    Library library;
    
    
    public RentalRequest(int duration, Book book, Magazine magazine, Library library, Customer customer){
        this.count++;
        this.id = "RequestId" + this.count;
        this.customer = customer;
        this.magazine = magazine;
        this.book = book;
        this.library = library;
        this.duration = duration;
        this.status = "Created";
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
    Magazine getMagazine() {
        return magazine;
    }

    public
    void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public
    String getId() {
        return id;
    }

    public
    void setId(String id) {
        this.id = id;
    }

    public static
    int getCount() {
        return count;
    }

    public static
    void setCount(int count) {
        RentalRequest.count = count;
    }

    public
    int getPrice() {
        return price;
    }

    public
    String getStatus() {
        return status;
    }

    public
    void setStatus(String status) {
        this.status = status;
    }

    public
    int getDuration() {
        return duration;
    }

    public
    void setDuration(int duration) {
        this.duration = duration;
    }

    public
    Customer getCustomer() {
        return customer;
    }

    public
    void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public
    Library getLibrary() {
        return library;
    }

    public
    void setLibrary(Library library) {
        this.library = library;
    }

    @Override
    public String toString(){
        return this.id;
    }
    
    
}
