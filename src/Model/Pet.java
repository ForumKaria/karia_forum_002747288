/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class Pet {
        private String petName;
        private int petAge;
        private int petGender;
        private int petType;
        private int petBreed;
        ArrayList<Vaccine> vaccination_history;
        InsurancePlans isInsurancePlanOpted;

    public
    String getPetName() {
        return petName;
    }

    public
    void setPetName(String petName) {
        this.petName = petName;
    }

    public
    int getPetAge() {
        return petAge;
    }

    public
    void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public
    int getPetGender() {
        return petGender;
    }

    public
    void setPetGender(int petGender) {
        this.petGender = petGender;
    }

    public
    int getPetType() {
        return petType;
    }

    public
    void setPetType(int petType) {
        this.petType = petType;
    }

    public
    int getPetBreed() {
        return petBreed;
    }

    public
    void setPetBreed(int petBreed) {
        this.petBreed = petBreed;
    }
    
    public ArrayList<Vaccine> getVaccines() {
        return vaccination_history;
    }

    public
    void addToVaccinationHistory(Vaccine vaccine) {
        this.vaccination_history.add(vaccine);
    }

    public
    InsurancePlans getIsInsurancePlanOpted() {
        return isInsurancePlanOpted;
    }

    public
    void setIsInsurancePlanOpted(InsurancePlans isInsurancePlanOpted) {
        this.isInsurancePlanOpted = isInsurancePlanOpted;
    }

        
}
