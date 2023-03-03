/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

//import UserAccount.UserAccountDirectory;
//import UserAccount.UserAccount;
import Library.Author.AuthorDirectory;
import Library.Material.BooksDirectory;
import Customer.CustomerDirectory;
import Library.Employee.EmployeeDirectory;
import Library.Employee.Librarian;
import Library.Genre.GenreDirectory;
import Library.Material.MagazineDirectory;

/**
 *
 * @author forumkaria
 */
public
        class Library {
//    private UserAccountDirectory userAccountDirectory;
    private AuthorDirectory authorDirectory;
    private BooksDirectory bookDirectory;
    private MagazineDirectory magazineDirectory;
    private GenreDirectory genreDirectory;
    private int buildingNo;
    private Librarian librarian;
    private EmployeeDirectory employeeDirectory;
    
    
    public Library(int buildingNo) {
        this.buildingNo = buildingNo;
//        this.userAccountDirectory = new UserAccountDirectory();
        this.authorDirectory  = new AuthorDirectory();
        this.bookDirectory = new BooksDirectory();
        this.magazineDirectory = new MagazineDirectory();
        this.genreDirectory = new GenreDirectory();
        this.librarian = new Librarian();
        this.employeeDirectory = new EmployeeDirectory();
        
        // create a restaurant manager here
//        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "SysAdmin");
        
    }
    

    public
    EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public
    void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public
    int getBuildingNo() {
        return buildingNo;
    }

    public
    void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public
    AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public
    BooksDirectory getBookDirectory() {
        return bookDirectory;
    }

    public
    MagazineDirectory getMagazineDirectory() {
        return magazineDirectory;
    }

    public
    GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public
    CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public
    Librarian getLibrarian() {
        return librarian;
    }

    @Override
    public String toString(){
        return String.valueOf(this.buildingNo);
    }


}
