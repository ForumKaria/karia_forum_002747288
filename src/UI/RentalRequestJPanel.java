/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import AppSystem.AppSystem;
import Branch.Branch;
import Library.Library;
import Library.RentalRequest.RentalRequest;
import Useraccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author forumkaria
 */
public
        class RentalRequestJPanel extends javax.swing.JPanel {
    
    private AppSystem appSystem;
    private UserAccount userAccount;
    Branch currentBranch;
    Library currentLib;
    DefaultTableModel tableModel;
    
    /**
     * Creates new form RentalRequestJPanel
     */
    public
            RentalRequestJPanel() {
        initComponents();
    }
            
    public
            RentalRequestJPanel(AppSystem appSystem, Branch branch, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        
        this.appSystem = appSystem;
        this.tableModel = (DefaultTableModel) reqTable.getModel();
        this.userAccount = userAccount;
        this.currentBranch = branch;
        this.currentLib = branch.getLibrary();
        populate();
    }

            
    public void populate(){
        if (this.currentLib.getRentalRequestDirectory().getMasterRequestList().size()>0){
            tableModel.setRowCount(0);
            for (RentalRequest rr : this.currentLib.getRentalRequestDirectory().getMasterRequestList()) {

                Object[] row = new Object[8];

                row[0] = rr.getId();
                row[1] = rr.getCustomer().getPersonid();
                row[2] = (rr.getBook() == null) ? "-" : rr.getBook().getName(); 
                row[3] = (rr.getMagazine()== null) ? "-" :rr.getMagazine().getName();
                row[4] = rr.getDuration();
                row[5] = rr.getPrice();
                row[6] = rr.getStatus();
                

                tableModel.addRow(row);
            }
        }   
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reqTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setText("APPROVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reqTable.setBackground(new java.awt.Color(204, 204, 204));
        reqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Customer Id", "Book", "Magazine", "Duration", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reqTable);

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton3.setText("DENY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Big Caslon", 1, 18)); // NOI18N
        jLabel1.setText("RENTAL REQUESTS RECEIVED");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButton1)
                .addContainerGap(617, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(635, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addComponent(jButton1)
                .addContainerGap(331, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(133, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(262, 262, 262)
                    .addComponent(jButton3)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = reqTable.getSelectedRow();
        String rrId = (String) reqTable.getValueAt(selectedRow, 0);
        String uId = (String) reqTable.getValueAt(selectedRow, 1);
        String mType = (String) reqTable.getValueAt(selectedRow, 2) == "-"? "Magazine":"Book";
        this.currentBranch.getLibrary().acceptRentalReq(rrId,mType);
        this.appSystem.getCustomerDirectory().findById(uId).getCurRentalRequest().setStatus("Rented");
        JOptionPane.showMessageDialog(null, "Customer Request accepted");
        populate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = reqTable.getSelectedRow();
        String rrId = (String) reqTable.getValueAt(selectedRow, 0);
        String uId = (String) reqTable.getValueAt(selectedRow, 1);
        this.currentBranch.getLibrary().rejectRentalReq(rrId);
        this.appSystem.getCustomerDirectory().findById(uId).getCurRentalRequest().setStatus("Rejected");
        JOptionPane.showMessageDialog(null, "Customer Request rejected");
        populate();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reqTable;
    // End of variables declaration//GEN-END:variables
}
