/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Business;
import Model.InsurancePlan;
import javax.swing.JOptionPane;

/**
 *
 * @author forumkaria
 */
public
        class CreateInsuranceJPanel extends javax.swing.JPanel {

    private
            Boolean validate = false;
    
    /**
     * Creates new form CreateInsuranceJPanel
     */
    Business business;
    
    public
            CreateInsuranceJPanel(Business b) {
        initComponents();
        
        this.business = b;
        
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
        InsPlanIDTxtField = new javax.swing.JTextField();
        planIDJLabel = new javax.swing.JLabel();
        InsurancePlanHeader = new javax.swing.JLabel();
        planNameJLabel = new javax.swing.JLabel();
        InsPlanMonCostTxtField = new javax.swing.JTextField();
        planMonthCostJLabel = new javax.swing.JLabel();
        InsPlanNameTxtField = new javax.swing.JTextField();
        planAnnualCostJLabel = new javax.swing.JLabel();
        InsPlanAnnualCostTxtField = new javax.swing.JTextField();
        createPlanJBtn = new javax.swing.JButton();
        HappyPetsViewUpdate = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        planIDJLabel.setText("Plan ID:");

        InsurancePlanHeader.setText("INSURANCE PLAN DETAILS");

        planNameJLabel.setText("Plan Name:");

        InsPlanMonCostTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                InsPlanMonCostTxtFieldFocusLost(evt);
            }
        });

        planMonthCostJLabel.setText("Plan Monthly Cost:");

        planAnnualCostJLabel.setText("Plan Annual Cost:");

        InsPlanAnnualCostTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsPlanAnnualCostTxtFieldActionPerformed(evt);
            }
        });

        createPlanJBtn.setBackground(new java.awt.Color(51, 153, 255));
        createPlanJBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        createPlanJBtn.setText("CREATE PLAN");
        createPlanJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlanJBtnActionPerformed(evt);
            }
        });

        HappyPetsViewUpdate.setBackground(new java.awt.Color(153, 153, 255));
        HappyPetsViewUpdate.setFont(new java.awt.Font("Kokonor", 1, 18)); // NOI18N
        HappyPetsViewUpdate.setText("HAPPY PETS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(planIDJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(551, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(planNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InsPlanNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(planMonthCostJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InsPlanMonCostTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(InsPlanIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(planAnnualCostJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InsPlanAnnualCostTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(153, 153, 153))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InsurancePlanHeader)
                            .addComponent(createPlanJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(HappyPetsViewUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(HappyPetsViewUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsurancePlanHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planIDJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsPlanIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsPlanNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planMonthCostJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsPlanMonCostTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planAnnualCostJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InsPlanAnnualCostTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(createPlanJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void createPlanJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlanJBtnActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(InsPlanIDTxtField.getText());
        String planName = InsPlanNameTxtField.getText();
        
        float costPerMonth = Float.parseFloat(InsPlanMonCostTxtField.getText());
        float costPerAnnum = costPerMonth*12;
        InsurancePlan ip = new InsurancePlan(id, planName, costPerMonth, costPerAnnum);
        this.business.addToInsuranceDirectory(ip);
        
        JOptionPane.showMessageDialog(null, "Created Insurance Plan");

       
        
    }//GEN-LAST:event_createPlanJBtnActionPerformed

    private void InsPlanMonCostTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InsPlanMonCostTxtFieldFocusLost
        // TODO add your handling code here:
        InsPlanAnnualCostTxtField.setText(String.valueOf(Float.parseFloat (InsPlanMonCostTxtField.getText())*12));
    }//GEN-LAST:event_InsPlanMonCostTxtFieldFocusLost

    private void InsPlanAnnualCostTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsPlanAnnualCostTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsPlanAnnualCostTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HappyPetsViewUpdate;
    private javax.swing.JTextField InsPlanAnnualCostTxtField;
    private javax.swing.JTextField InsPlanIDTxtField;
    private javax.swing.JTextField InsPlanMonCostTxtField;
    private javax.swing.JTextField InsPlanNameTxtField;
    private javax.swing.JLabel InsurancePlanHeader;
    private javax.swing.JButton createPlanJBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel planAnnualCostJLabel;
    private javax.swing.JLabel planIDJLabel;
    private javax.swing.JLabel planMonthCostJLabel;
    private javax.swing.JLabel planNameJLabel;
    // End of variables declaration//GEN-END:variables
}
