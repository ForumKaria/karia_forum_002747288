/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import AppSystem.AppSystem;
import Branch.Branch;
import Library.Employee.Employee;
import Library.Employee.EmployeeDirectory;
import Library.Library;
import Role.BranchManagerRole;
import Role.LibrarianRole;
import Useraccount.UserAccount;
import Useraccount.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author forumkaria
 */
public class EmployeeManagementJPanel extends javax.swing.JPanel {

    private AppSystem appSystem;
    private UserAccount userAccount;
    private DefaultTableModel employeeTableModel;
    private EmployeeDirectory employeeDirectory;

    /**
     * Creates new form EmployeeManagementJPanel
     */
    public EmployeeManagementJPanel() {
        initComponents();
    }

    public EmployeeManagementJPanel(AppSystem appSystem, Branch branch, UserAccount useraccount) {
        initComponents();

        this.setVisible(true);
        this.appSystem = appSystem;
        this.userAccount = useraccount;
        this.employeeTableModel = (DefaultTableModel) employeeTable.getModel();

        branchComboBox.setSelectedItem(null);
        populateTable();
        populateBranch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        experience = new javax.swing.JTextField();
        designationCombobox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        branchComboBox = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        employeeTable.setBackground(new java.awt.Color(204, 204, 204));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Username", "Password", "Designation", "Experience", "Branch"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        jLabel1.setText("USERNAME");

        jLabel2.setText("PASSWORD");

        username.setBackground(new java.awt.Color(204, 204, 204));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("NAME");

        name.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("DESIGNATION");

        jLabel5.setText("EXPERIENCE");

        experience.setBackground(new java.awt.Color(204, 204, 204));

        designationCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "librarian", "branch manager" }));
        designationCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationComboboxActionPerformed(evt);
            }
        });

        jLabel6.setText("BRANCH");

        branchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchComboBoxActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(branchComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(experience, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(designationCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(designationCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(branchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory uad = this.appSystem.getTopLevelUserAccountDirectory();

        String userName = username.getText();
        String pass = password.getText();
        String name = this.name.getText();

        int exp = Integer.valueOf(experience.getText());
        String role = (String) designationCombobox.getSelectedItem();
        String branch = (String) branchComboBox.getSelectedItem();
        UserAccountDirectory luad = this.appSystem.findBranch(branch).getBranchuseraccountDirectory();

        if (!uad.isUnique(userName)) {
            JOptionPane.showMessageDialog(null, "Credentials are taken, try another Credentials");
        } else {

            if (!luad.isUnique(userName)) {
                JOptionPane.showMessageDialog(null, "Credentials are taken, try another Credentials");
            } else {
                if (role.equals("librarian")) {

                    UserAccount user = this.appSystem.findBranch(branch).getBranchuseraccountDirectory().createUserAccount(userName, pass, new LibrarianRole());
                    Library lib = this.appSystem.findBranch(branch).getLibrary();
                    lib.getEmployeeDirectory().createEmployee(exp, role, name, user.getAccountId(), lib);
                } else if (role.equals("branch manager")) {
                    UserAccount user = this.appSystem.findBranch(branch).getBranchuseraccountDirectory().createUserAccount(userName, pass, new BranchManagerRole());
                    Library lib = this.appSystem.findBranch(branch).getLibrary();
                    lib.getEmployeeDirectory().createEmployee(exp, role, name, user.getAccountId(), lib);
                }
                populateTable();
            }
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void designationComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationComboboxActionPerformed

    private void branchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_branchComboBoxActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    public void populateBranch() {
        ArrayList<Branch> allbranches = this.appSystem.getBranches();
        for (Branch b : allbranches) {
            branchComboBox.addItem(b.getName());
        }
    }

    public void populateTable() {
        ArrayList<Branch> branches = this.appSystem.getBranches();

        employeeTableModel.setRowCount(0);
        for (Branch b : branches) {
            for (Employee e : b.getLibrary().getEmployeeDirectory().getEmployees()) {
                if (b.getLibrary().getEmployeeDirectory().getEmployees().size() > 0) {

                    Object[] row = new Object[7];
                    row[0] = e.getName();
                    row[1] = b.getBranchuseraccountDirectory().findById(e.getEmployeeId()).getUsername();
                    row[2] = b.getBranchuseraccountDirectory().findById(e.getEmployeeId()).getPassword();
                    row[3] = e.getDesignation();
                    row[4] = e.getExperience();
                    row[5] = b;
                    employeeTableModel.addRow(row);
                }
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> branchComboBox;
    private javax.swing.JComboBox<String> designationCombobox;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField experience;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
