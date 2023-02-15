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

    private
            String petName;
    private
            int petAge;
    private
            boolean isFemale;
    private
            String petType;
    private
            String petBreed;
    ArrayList<Vaccine> vaccination_history;
    InsurancePlan insurancePlanOpted;

    public
            Pet(String petName, int petAge, boolean isFemale,String petType, 
                    String petBreed, InsurancePlan insurancePlanOpted) {
        this.petName = petName;
        this.petAge = petAge;
        this.isFemale = isFemale;
        this.petType = petType;
        this.petBreed = petBreed;
        this.insurancePlanOpted = insurancePlanOpted;
        this.vaccination_history = new ArrayList<Vaccine>();
    }

    public
            boolean isIsFemale() {
        return isFemale;
    }

    public
            void setIsFemale(boolean isFemale) {
        this.isFemale = isFemale;
    }

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
            String getPetType() {
        return petType;
    }

    public
            void setPetType(String petType) {
        this.petType = petType;
    }

    public
            String getPetBreed() {
        return petBreed;
    }

    public
            void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public
            ArrayList<Vaccine> getVaccines() {
        return vaccination_history;
    }

    public
            void addToVaccinationHistory(Vaccine vaccine) {
        this.vaccination_history.add(vaccine);
    }

    public
            InsurancePlan getInsurancePlanOpted() {
        return insurancePlanOpted;
    }

    public
            void setInsurancePlanOpted(InsurancePlan isInsurancePlanOpted) {
        this.insurancePlanOpted = isInsurancePlanOpted;
    }
            
    public Vaccine findVaccineById(int id){
        for(Vaccine v : this.vaccination_history){
            if(id == v.getVaccineId()){
                return v;
            }
        }
        return this.vaccination_history.get(0);
    }

}
