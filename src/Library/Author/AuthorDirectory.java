/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Author;

import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class AuthorDirectory {
    ArrayList<Author> authorDirectory;

    public
    ArrayList<Author> getAuthorDirectory() {
        return authorDirectory;
    }

    public
    void addAuthor(Author author) {
        this.authorDirectory.add(author);
    }
    
}
