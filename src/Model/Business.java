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
        class Business {
        ArrayList<Applicant> applicantsDirectory;
        ArrayList<InsurancePlan> insuranceDirectory;
        
        public Business(){
            this.applicantsDirectory = new ArrayList<Applicant>();
            this.insuranceDirectory = new ArrayList<InsurancePlan>();
               
        }

    public
    ArrayList<Applicant> getApplicantsDirectory() {
        return applicantsDirectory;
    }

    
    public
    ArrayList<InsurancePlan> getInsurancePlans() {
        return insuranceDirectory;
    }
    
    public void addToInsuranceDirectory(InsurancePlan ip){
        this.insuranceDirectory.add(ip);
    }
    
    public void addToApplicantsDirectory(Applicant a){
        this.applicantsDirectory.add(a);
    }
    
    public InsurancePlan findIpById(int id){
        for(InsurancePlan ip : this.insuranceDirectory){
            if(id == ip.getPlanID()){
                return ip;
            }
        }
        return this.insuranceDirectory.get(0);
    }
    
    public Applicant findApplicantById(int id){
        for(Applicant a : this.applicantsDirectory){
            if(id == a.getApplicantID()){
                return a;
            }
        }
        return this.applicantsDirectory.get(0);
    }
        
}
