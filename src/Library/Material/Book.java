/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import Library.Author.Author;

/**
 *
 * @author forumkaria
 */
public
        class Book {
    
    Author author;
    String title;
    String genre;
    int bookId;

    public
    Author getAuthor() {
        return author;
    }

    public
    void setAuthor(Author author) {
        this.author = author;
    }

    public
    String getTitle() {
        return title;
    }

    public
    void setTitle(String title) {
        this.title = title;
    }

    public
    String getGenre() {
        return genre;
    }

    public
    void setGenre(String genre) {
        this.genre = genre;
    }

    public
    int getBookId() {
        return bookId;
    }

    public
    void setBookId(int bookId) {
        this.bookId = bookId;
    }
    
    
}
