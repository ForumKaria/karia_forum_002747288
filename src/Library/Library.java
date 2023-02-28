/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import UserAccount.UserAccountDirectory;
import UserAccount.UserAccount;
import Library.Author.AuthorDirectory;
import Library.Material.BooksDirectory;
import Customer.CustomerDirectory;

/**
 *
 * @author forumkaria
 */
public
        class Library {
    private UserAccountDirectory userAccountDirectory;
    private BooksDirectory booksDirectory;
    private CustomerDirectory customerDirectory;
    
    public Library() {
        this.userAccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.booksDirectory = new BooksDirectory();
        
        // create a restaurant manager here
        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "SysAdmin");
        
    }
    

    public
    UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public
    void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }


    public
    BooksDirectory getBooksDirectory() {
        return booksDirectory;
    }

    public
    void setBooksDirectory(BooksDirectory booksDirectory) {
        this.booksDirectory = booksDirectory;
    }

    

}
