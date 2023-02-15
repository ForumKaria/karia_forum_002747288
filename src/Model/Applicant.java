/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.*;
import java.util.Date;

/**
 *
 * @author forumkaria
 */
public
        class Applicant {
        int applicantID;
        private String ownerFirstName;
        private String ownerLastName;
        Date applicationDate;
        Pet pet;

        public Applicant(int applicantID,
        String ownerFirstName,
        String ownerLastName,
        Date applicationDate,
        Pet pet){
        this.applicantID = applicantID;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.applicationDate = applicationDate;
        this.pet = pet;
        }

    
    public
    int getApplicantID() {
        return applicantID;
    }

    public
    void setApplicantID(int applicantID) {
        this.applicantID = applicantID;
    }

    public
    String getOwnerFirstName() {
        return ownerFirstName;
    }

    public
    void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public
    String getOwnerLastName() {
        return ownerLastName;
    }

    public
    void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public
    Date getApplicationDate() {
        return applicationDate;
    }

    public
    void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public
    Pet getPet() {
        return pet;
    }

    public
    void setPet(Pet pet) {
        this.pet = pet;
    }
 
        
}
