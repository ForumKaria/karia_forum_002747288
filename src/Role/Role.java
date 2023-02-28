/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import javax.swing.JFrame;

/**
 *
 * @author forumkaria
 */

    public abstract class Role {
    static String[] roles = {"librarian", "customer", "admin" };

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(Library library, UserAccount useraccount);
    

    
}
