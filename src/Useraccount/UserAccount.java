/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Useraccount;

import Role.Role;
import javax.swing.JFrame;

/**
 *
 * @author forumkaria
 */
public class UserAccount {

    private static int count = 0;
    private String accountId;
    private String username;
    private String password;
    private Role role;

//
//    public UserAccount() {
//        this.accountId = "ACC" + count++;
//        this.username = username;
//        this.password = password;
//        this.role = role;
//    }

    public UserAccount(String username, String password, Role role) {
        this.accountId = "role" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = this.role;
    }
    

//    public JFrame getWorkArea(String role, Business business, UserAccount useraccount) {
//        // the abstract class way
//        if (role.equals("manager")) {
//            return new ManagerRole().getWorkArea(business, useraccount);
//        }
//        if (role.equals("customer")) {
//            return new CustomerJFrame(business, useraccount);
//        }
//        if (role.equals("agent")) {
//            return new AgentJFrame(business, useraccount);
//        }
//        return null;
//    }

}
