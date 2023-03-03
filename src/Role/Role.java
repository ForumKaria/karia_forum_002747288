/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.AppSystem;
import Branch.Branch;
import Useraccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author forumkaria
 */
    
    public abstract class Role {
    
    private static String[] roles = {"admin","customer","librarian","branch manager"};
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame getWorkArea(AppSystem appSystem, Branch branch, UserAccount useraccount);
}

