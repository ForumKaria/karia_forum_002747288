/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Applicant;
import Model.Business;
import Model.InsurancePlan;
import Model.Pet;
import Model.Vaccine;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author forumkaria
 */
public
        class CreateApplicantJPanel extends javax.swing.JPanel {
    
    Business business;

    /**
     * Creates new form CreateApplicantJPanel
     */
    public
            CreateApplicantJPanel(Business b) {
        initComponents();
        
        this.business = b;
        
        populateDropdowns();
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
        dateJLabel = new javax.swing.JLabel();
        petNameTxt = new javax.swing.JTextField();
        petNameJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        petAgeTxt = new javax.swing.JTextField();
        petAgeJLabel = new javax.swing.JLabel();
        PetDetailsJLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        VaccinationDetailsJLabel = new javax.swing.JLabel();
        femaleCheckBox = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        insurancePlansComboBox = new javax.swing.JComboBox();
        applicantIDTxt = new javax.swing.JTextField();
        lastNameTxt = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        petBreedTxt = new javax.swing.JTextField();
        petTypeTxt = new javax.swing.JTextField();
        vaccineNameTxt = new javax.swing.JTextField();
        courseCompletedCheckBox = new javax.swing.JCheckBox();
        malecheckBox = new javax.swing.JCheckBox();
        PetGenderJLabel1 = new javax.swing.JLabel();
        MaleTxt = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CreateJBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        applicantIDJLabel.setText("Applicant ID: ");
        jPanel1.add(applicantIDJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 62, -1, -1));
        jPanel1.add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 115, 150, 30));

        ApplicantDetailsJLabel.setText("APPLICANT DETAILS");
        jPanel1.add(ApplicantDetailsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 23, -1, -1));

        firstNameJLabel.setText("First Name: ");
        jPanel1.add(firstNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 120, -1, -1));

        lastNameJLabel.setText("Last Name: ");
        jPanel1.add(lastNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 177, -1, -1));

        dateJLabel.setText("Application Date:");
        jPanel1.add(dateJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 232, -1, -1));
        jPanel1.add(petNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 57, 105, -1));

        petNameJLabel.setText("Name: ");
        jPanel1.add(petNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel7.setText("Type: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));
        jPanel1.add(petAgeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 110, -1));

        petAgeJLabel.setText("Age: ");
        jPanel1.add(petAgeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        PetDetailsJLabel.setText("PET DETAILS");
        jPanel1.add(PetDetailsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLabel11.setText("Vaccine Name:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        jLabel12.setText("Breed: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel13.setText("Course Completed: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        VaccinationDetailsJLabel.setText("VACCINATION DETAILS");
        jPanel1.add(VaccinationDetailsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 334, -1, -1));
        jPanel1.add(femaleCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, 29));

        jLabel15.setText("INSURANCE PLAN OPTED");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 20));

        insurancePlansComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insurancePlansComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(insurancePlansComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 144, -1));
        jPanel1.add(applicantIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 57, 150, 30));
        jPanel1.add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 172, 150, 30));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 232, 150, -1));
        jPanel1.add(petBreedTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 110, 30));
        jPanel1.add(petTypeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 110, -1));
        jPanel1.add(vaccineNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 110, 30));
        jPanel1.add(courseCompletedCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 425, -1, 29));
        jPanel1.add(malecheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, 29));

        PetGenderJLabel1.setText("Gender: ");
        jPanel1.add(PetGenderJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        MaleTxt.setText("Male");
        jPanel1.add(MaleTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 186, -1, -1));

        jLabel16.setText("Female");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 186, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 763, -1));

        CreateJBtn.setText("CREATE");
        CreateJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJBtnActionPerformed(evt);
            }
        });
        add(CreateJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJBtnActionPerformed
        // TODO add your handling code here:
        
        int applicantID = Integer.parseInt( applicantIDTxt.getText());
        String ownerFirstName = firstNameTxt.getText();
        String ownerLastName = lastNameTxt.getText();
        Date applicationDate = jDateChooser1.getDate();
        String petName = petNameTxt.getText();
        int petAge = Integer.parseInt( petAgeTxt.getText());
 
        boolean isfemale = isFemale();
        String petType = petTypeTxt.getText();
        String petBreed = petBreedTxt.getText();
        String vaccinationName = vaccineNameTxt.getText();
        boolean courseCompleted = courseCompletedCheckBox.isSelected();
        
        int ip_id = (int) insurancePlansComboBox.getSelectedItem();
        
        
        InsurancePlan ip = this.business.findIpById(ip_id);
        
        Pet pet = new Pet(petName, petAge, isfemale, petType, petBreed, ip);
        Applicant applicant = new Applicant(applicantID, ownerFirstName, ownerLastName, applicationDate, pet);
        Vaccine vaccine = new Vaccine(vaccinationName, courseCompleted, (int) Math.random());
        pet.addToVaccinationHistory(vaccine);
        
        
        if(malecheckBox.isSelected() && femaleCheckBox.isSelected()){
            JOptionPane.showMessageDialog(null, "Select only one Gender");
            
        }else{
           this.business.addToApplicantsDirectory(applicant);
           JOptionPane.showMessageDialog(null, "Applicant Created!");

        }
        
        
    }//GEN-LAST:event_CreateJBtnActionPerformed

    public boolean isFemale(){
       
        if(malecheckBox.isSelected()){
    
       return false;
        }else{
            return true;
            
        }
    }
    private void insurancePlansComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insurancePlansComboBoxActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_insurancePlansComboBoxActionPerformed

    public void populateDropdowns(){
        
        ArrayList<InsurancePlan> insurancePlans = this.business.getInsurancePlans();
        
//        insurancePlansComboBox

    for( InsurancePlan ip : insurancePlans){
        insurancePlansComboBox.addItem(ip.getPlanID());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApplicantDetailsJLabel;
    private javax.swing.JButton CreateJBtn;
    private javax.swing.JLabel MaleTxt;
    private javax.swing.JLabel PetDetailsJLabel;
    private javax.swing.JLabel PetGenderJLabel1;
    private javax.swing.JLabel VaccinationDetailsJLabel;
    private javax.swing.JLabel applicantIDJLabel;
    private javax.swing.JTextField applicantIDTxt;
    private javax.swing.JCheckBox courseCompletedCheckBox;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JCheckBox femaleCheckBox;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JComboBox insurancePlansComboBox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JCheckBox malecheckBox;
    private javax.swing.JLabel petAgeJLabel;
    private javax.swing.JTextField petAgeTxt;
    private javax.swing.JTextField petBreedTxt;
    private javax.swing.JLabel petNameJLabel;
    private javax.swing.JTextField petNameTxt;
    private javax.swing.JTextField petTypeTxt;
    private javax.swing.JTextField vaccineNameTxt;
    // End of variables declaration//GEN-END:variables
}
