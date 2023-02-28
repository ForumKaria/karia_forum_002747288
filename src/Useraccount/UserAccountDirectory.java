/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Useraccount;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class UserAccountDirectory {

    private
            ArrayList<UserAccount> userAccounts;

    public
            UserAccountDirectory() {
        this.userAccounts = new ArrayList<UserAccount>();
    }

    public
            ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public
            void setUserAccounts(ArrayList<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public void 
            createUserAccount(String id, String password, Role role) {
        UserAccount user = new UserAccount(id, password, role);
        this.userAccounts.add(user);
//        return user;
    }

    public
            UserAccount findById(String id) {
        for (UserAccount u : this.userAccounts) {
            if (u.getAccountId().equals(id)){
            return u;
        }
        }
        return null;
    
    }
            
    public UserAccount getUserAccount(String id, String password, Role role){
        for(UserAccount u : this.userAccounts){
            if(u.getAccountId().equals(id) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return u;
            }
        }
        return null;
    }
    
    public Boolean accountExists(String username, String password, String role) {
        for(UserAccount u: this.userAccounts) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;
            }
        }
        
        return false;
    }
    
}
