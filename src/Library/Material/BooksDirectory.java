/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class BooksDirectory {
    ArrayList<Book> booksDirectory;


    public
    ArrayList<Book> getBooksDirectory() {
        return booksDirectory;
    }

    public
    void addToBookDirectory(Book book) {
        this.booksDirectory.add(book);
    }
    
}
