/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import Library.Author.Author;
import Library.Genre.Genre;
import java.util.Date;

/**
 *
 * @author forumkaria
 */
public class Book extends Material{
    private Author author;
    private Genre genre;
    private int pages;
    private String language;
    private String bindingType;
    Float price;


    
    
    public Book(String name, Date date, Author author, Genre genre, int pages, String language, String type, Float price){
        super();
        this.name = name;
        this.date = date;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.language = language;
        this.bindingType = type;
        this.materialType = "Book";
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }
        public
    Float getPrice() {
        return price;
    }

    public
    void setPrice(Float price) {
        this.price = price;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
    
}