/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Applicant;
import Model.ApplicantsDirectory;
import Model.Business;
import Model.InsurancePlan;
import Model.Pet;
import Model.Vaccine;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author forumkaria
 */
public
        class ViewApplicantJPanel extends javax.swing.JPanel {

    Business business;
    DefaultTableModel viewTableModel;
    DefaultTableModel vaccinesTable;
    ApplicantsDirectory selectedApplicant;

    /**
     * Creates new form ViewApplicantJPanel
     */
    public
            ViewApplicantJPanel(Business b) {
        initComponents();
        this.business = b;
        this.viewTableModel = (DefaultTableModel) viewApplicantJTable.getModel();
        this.vaccinesTable = (DefaultTableModel) vaccineTable.getModel();

//        genderSelection();
        ArrayList<Applicant> applicants = this.business.getApplicantsDirectory();

        displayApplicants(applicants);
    }

    public
            void displayApplicants(ArrayList<Applicant> applicants) {

        if (applicants.size() > 0) {
            // display

            viewTableModel.setRowCount(0);

            for (Applicant a : applicants) {

                // number of columns in the table = 3 and row should be framed
                Object row[] = new Object[3];
                row[0] = a.getApplicantID();
                row[1] = a.getOwnerFirstName();
                row[2] = a.getOwnerLastName();

                // add the row to the table
                viewTableModel.addRow(row);
            }
        }
    }

    public
            void displayVaccines(ArrayList<Vaccine> vaccines) {

        if (vaccines.size() > 0) {
            // display

            vaccinesTable.setRowCount(0);

            for (Vaccine v : vaccines) {

                // number of columns in the table = 3 and row should be framed
                Object row[] = new Object[3];
                row[0] = v.getVaccineId();
                row[1] = v.getVaccineName();
                row[2] = v.isCourseCompleted() ? "Completed" : "Pending";

                // add the row to the table
                vaccinesTable.addRow(row);
            }
        }
        else {
            System.out.print("Empty list");
        }
    }

    public
            boolean genderSelection() {

        if (malecheckBox.isSelected()) {

            return false;
        }
        else {
            return true;

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
        applicantIDJLabel = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        ApplicantDetailsJLabel = new javax.swing.JLabel();
        firstNameJLabel = new javax.swing.JLabel();
        lastNameJLabel = new javax.swing.JLabel();
        petNameTxt = new javax.swing.JTextField();
        petNameJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        petAgeTxt = new javax.swing.JTextField();
        petAgeJLabel = new javax.swing.JLabel();
        PetDetailsJLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        VaccinationDetailsJLabel = new javax.swing.JLabel();
        femaleCheckBox = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        applicantIDSearchTxt = new javax.swing.JTextField();
        petTypeTxt = new javax.swing.JTextField();
        malecheckBox = new javax.swing.JCheckBox();
        PetGenderJLabel1 = new javax.swing.JLabel();
        MaleTxt = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        InsurancePlanIdTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewApplicantJTable = new javax.swing.JTable();
        searchAppliNameJBtn = new javax.swing.JButton();
        deleteApplicantJBtn = new javax.swing.JButton();
        viewApplicantJBtn = new javax.swing.JButton();
        applicantIDTxt = new javax.swing.JTextField();
        applicantNameSearchTxt = new javax.swing.JTextField();
        lastNameTxt1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        vaccineTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        applicantIDJLabel1 = new javax.swing.JLabel();
        firstNameJLabel1 = new javax.swing.JLabel();
        searchAppliIDJBtn1 = new javax.swing.JButton();
        petBreedTxt = new javax.swing.JTextField();
        applicantIDJLabel2 = new javax.swing.JLabel();
        vaccineNameTxt = new javax.swing.JTextField();
        firstNameJLabel2 = new javax.swing.JLabel();
        coursecheckBx = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 204, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        applicantIDJLabel.setText("Applicant ID: ");
        jPanel1.add(applicantIDJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 150, 30));

        ApplicantDetailsJLabel.setText("APPLICANT DETAILS");
        jPanel1.add(ApplicantDetailsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        firstNameJLabel.setText("Applicant First Name: ");
        jPanel1.add(firstNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lastNameJLabel.setText("Last Name: ");
        jPanel1.add(lastNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));
        jPanel1.add(petNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 110, -1));

        petNameJLabel.setText("Name: ");
        jPanel1.add(petNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        jLabel7.setText("Type: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));
        jPanel1.add(petAgeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 110, -1));

        petAgeJLabel.setText("Age: ");
        jPanel1.add(petAgeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        PetDetailsJLabel.setText("PET DETAILS");
        jPanel1.add(PetDetailsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 90, 30));

        jLabel12.setText("Breed: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        VaccinationDetailsJLabel.setText("VACCINATION DETAILS");
        jPanel1.add(VaccinationDetailsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));
        jPanel1.add(femaleCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, 29));

        jLabel15.setText("Insurance Plan Opted:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, 20));
        jPanel1.add(applicantIDSearchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 150, 30));
        jPanel1.add(petTypeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 110, -1));
        jPanel1.add(malecheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, 29));

        PetGenderJLabel1.setText("Gender: ");
        jPanel1.add(PetGenderJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        MaleTxt.setText("Male");
        jPanel1.add(MaleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        jLabel16.setText("Female");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        InsurancePlanIdTxt.setEditable(false);
        jPanel1.add(InsurancePlanIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 110, -1));

        viewApplicantJTable.setBackground(new java.awt.Color(153, 153, 255));
        viewApplicantJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Applicant ID", "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewApplicantJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 190));

        searchAppliNameJBtn.setText("Go");
        searchAppliNameJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAppliNameJBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchAppliNameJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 70, 30));

        deleteApplicantJBtn.setBackground(new java.awt.Color(153, 153, 255));
        deleteApplicantJBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deleteApplicantJBtn.setText("DELETE");
        deleteApplicantJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteApplicantJBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteApplicantJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        viewApplicantJBtn.setBackground(new java.awt.Color(153, 153, 255));
        viewApplicantJBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        viewApplicantJBtn.setText("VIEW");
        viewApplicantJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewApplicantJBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewApplicantJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        applicantIDTxt.setEditable(false);
        jPanel1.add(applicantIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 150, 30));
        jPanel1.add(applicantNameSearchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, 30));
        jPanel1.add(lastNameTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 150, 30));

        vaccineTable.setBackground(new java.awt.Color(153, 153, 255));
        vaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vaccine  ID", "Vaccine Name", "Courses"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(vaccineTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 290, 160));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton2.setText("UPDATE ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, -1, -1));

        applicantIDJLabel1.setText("Applicant ID: ");
        jPanel1.add(applicantIDJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        firstNameJLabel1.setText("First Name: ");
        jPanel1.add(firstNameJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        searchAppliIDJBtn1.setText("Go");
        searchAppliIDJBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAppliIDJBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(searchAppliIDJBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 70, 30));
        jPanel1.add(petBreedTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 110, -1));

        applicantIDJLabel2.setText("Vaccine Name:");
        jPanel1.add(applicantIDJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, -1));
        jPanel1.add(vaccineNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 110, -1));

        firstNameJLabel2.setText("Course Completed: ");
        jPanel1.add(firstNameJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        coursecheckBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursecheckBxActionPerformed(evt);
            }
        });
        jPanel1.add(coursecheckBx, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void coursecheckBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursecheckBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursecheckBxActionPerformed

    private void searchAppliIDJBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAppliIDJBtn1ActionPerformed
        // TODO add your handling code here:
        if (this.business.checkIfApplicantExists(Integer.parseInt(applicantIDSearchTxt.getText()))) {

            Applicant a = this.business.findApplicantById(Integer.parseInt(applicantIDSearchTxt.getText()));
            ArrayList<Applicant> applicants = new ArrayList<>();
            applicants.add(a);
            displayApplicants(applicants);
        }else{
            JOptionPane.showMessageDialog(null, "ID doesn't exist!");
            displayApplicants(this.business.getApplicantsDirectory());
        }
    }//GEN-LAST:event_searchAppliIDJBtn1ActionPerformed

    private void searchAppliNameJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAppliNameJBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<Applicant> applicants = this.business.findApplicantByName(applicantNameSearchTxt.getText());
        displayApplicants(applicants);
    }//GEN-LAST:event_searchAppliNameJBtnActionPerformed

    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (malecheckBox.isSelected() && femaleCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select only one Gender");
        }
        else {

            //    this.business.findIpById((int)viewTableModel.getValueAt(selectedRow,0)).setPlanName(InsPlanNameTxtField.getText());
            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).setOwnerFirstName(firstNameTxt.getText());

            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).setOwnerLastName(lastNameTxt1.getText());

            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).getPet().setPetName(petNameTxt.getText());

            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).getPet().setPetAge(Integer.parseInt(petAgeTxt.getText()));

            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).getPet().setPetType(petTypeTxt.getText());

            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).getPet().setPetBreed(petBreedTxt.getText());

            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).getPet().setIsFemale(genderSelection());

            int selectedRow = vaccineTable.getSelectedRow();

            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).getPet().findVaccineById(Integer.parseInt(String.valueOf(vaccineTable.getValueAt(selectedRow, 0)))).setVaccineName(vaccineNameTxt.getText());
            this.business.findApplicantById(Integer.parseInt(applicantIDTxt.getText())).getPet().findVaccineById(Integer.parseInt(String.valueOf(vaccineTable.getValueAt(selectedRow, 0)))).setCourseCompleted(coursecheckBx.isSelected());

            JOptionPane.showMessageDialog(null, "Applicant Updated!");

            displayApplicants(this.business.getApplicantsDirectory());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void viewApplicantJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewApplicantJBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = viewApplicantJTable.getSelectedRow();

        if (selectedRow >= 0) {

            applicantIDTxt.setText(String.valueOf(viewTableModel.getValueAt(selectedRow, 0)));
            firstNameTxt.setText(String.valueOf(viewTableModel.getValueAt(selectedRow, 1)));
            lastNameTxt1.setText(String.valueOf(viewTableModel.getValueAt(selectedRow, 2)));

            Applicant a = this.business.findApplicantById(Integer.parseInt(String.valueOf(viewTableModel.getValueAt(selectedRow, 0))));
            Pet p = a.getPet();

            petNameTxt.setText(p.getPetName());
            petAgeTxt.setText(String.valueOf(p.getPetAge()));
            malecheckBox.setSelected(!p.isIsFemale());
            femaleCheckBox.setSelected(p.isIsFemale());
            petTypeTxt.setText(p.getPetType());
            petBreedTxt.setText(p.getPetBreed());
            InsurancePlanIdTxt.setText(p.getInsurancePlanOpted().getPlanName());

            displayVaccines(p.getVaccines());

        }
        else {
            // NO SELECTION MADE BY USER
            JOptionPane.showMessageDialog(null, "Please select row");
        }
    }//GEN-LAST:event_viewApplicantJBtnActionPerformed

    private void deleteApplicantJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteApplicantJBtnActionPerformed
        // TODO add your handling code here:

        this.business.deleteApplicantById(Integer.parseInt(String.valueOf(applicantIDTxt.getText())));
        displayApplicants(this.business.getApplicantsDirectory());

    }//GEN-LAST:event_deleteApplicantJBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApplicantDetailsJLabel;
    private javax.swing.JTextField InsurancePlanIdTxt;
    private javax.swing.JLabel MaleTxt;
    private javax.swing.JLabel PetDetailsJLabel;
    private javax.swing.JLabel PetGenderJLabel1;
    private javax.swing.JLabel VaccinationDetailsJLabel;
    private javax.swing.JLabel applicantIDJLabel;
    private javax.swing.JLabel applicantIDJLabel1;
    private javax.swing.JLabel applicantIDJLabel2;
    private javax.swing.JTextField applicantIDSearchTxt;
    private javax.swing.JTextField applicantIDTxt;
    private javax.swing.JTextField applicantNameSearchTxt;
    private javax.swing.JCheckBox coursecheckBx;
    private javax.swing.JButton deleteApplicantJBtn;
    private javax.swing.JCheckBox femaleCheckBox;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JLabel firstNameJLabel1;
    private javax.swing.JLabel firstNameJLabel2;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameTxt1;
    private javax.swing.JCheckBox malecheckBox;
    private javax.swing.JLabel petAgeJLabel;
    private javax.swing.JTextField petAgeTxt;
    private javax.swing.JTextField petBreedTxt;
    private javax.swing.JLabel petNameJLabel;
    private javax.swing.JTextField petNameTxt;
    private javax.swing.JTextField petTypeTxt;
    private javax.swing.JButton searchAppliIDJBtn1;
    private javax.swing.JButton searchAppliNameJBtn;
    private javax.swing.JTextField vaccineNameTxt;
    private javax.swing.JTable vaccineTable;
    private javax.swing.JButton viewApplicantJBtn;
    private javax.swing.JTable viewApplicantJTable;
    // End of variables declaration//GEN-END:variables
}
