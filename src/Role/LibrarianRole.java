/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.AppSystem;
import Branch.Branch;
import UI.LibrarianJFrame;
import Useraccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author forumkaria
 */
public
        class LibrarianRole extends Role{
    
    @Override
    public JFrame getWorkArea(AppSystem appSystem, Branch branch, UserAccount useraccount){
        return new LibrarianJFrame(appSystem, branch, useraccount);
    }
}
