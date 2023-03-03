/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import AppSystem.AppSystem;
import Branch.Branch;
import UI.CustomerJFrame;
import Useraccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author forumkaria
 */
public
        class CustomerRole extends Role {

    @Override
    public JFrame getWorkArea(AppSystem appSystem, Branch branch, UserAccount userAccount) {
        return new CustomerJFrame(appSystem, branch, userAccount);
    }
}
