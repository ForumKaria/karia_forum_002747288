/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppSystem;

import Branch.Branch;
import Customer.CustomerDirectory;
import Role.AdminRole;
import Useraccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 * 
 */
public
        class AppSystem {

    ArrayList<Branch> branches;
    private UserAccountDirectory topLevelUserAccountDirectory;

    
    public AppSystem(){
        this.branches = new ArrayList<Branch>();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        
        // CREATING ADMIN
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new AdminRole());
    }
    
    public static
        AppSystem getInstance() {
        return new AppSystem();
    }
        
    public static AppSystem getAppSystem(){
        return new AppSystem();
    }
    
    public
    ArrayList<Branch> getBranches() {
        return branches;
    }

    public
    void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }
    
    public Branch createBranch(String name){
        Branch b = new Branch(name);
        this.branches.add(b);
        return b;
    }
    
    public Branch findBranch(String name){
        for (Branch b: this.getBranches()){
            if (b.getName().equals(name)){
                return b;
            }
        }
        return null;  
    }
    
    public void deleteBranch(Branch b){
        this.branches.remove(b);
    }
}
