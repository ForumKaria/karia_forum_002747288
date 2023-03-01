/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.AppSystem;
import Useraccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author forumkaria
 */

    public abstract class Role {
    static String[] roles = {"admin","customer","librarian","branch manager"};

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(AppSystem appSystem, UserAccount userAccount);
    
    
}
