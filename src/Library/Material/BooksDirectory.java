/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import Library.Author.Author;
import Library.Genre.Genre;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author forumkaria
 */
public class BooksDirectory {
    ArrayList<Book> books;
    
    public BooksDirectory(){
        this.books = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public Book addBook(String name, Date date, Author author, Genre genre, int pages, String language, String type, Float price){
        Book book = new Book(name, date, author, genre, pages, language, type, price);
        this.books.add(book);
        
        return book;
    }
    
    public Book findBook(String title){
        for (Book b: books){
            if (b.getName().equals(title)){
                return b;
            }
        }
        return null;
    }
    
    public Book findBookById(String bookId){
        for (Book b: books){
            if (b.getMaterialId().equals(bookId)){
                return b;
            }
        }
        return null;
    }
    
    
}
