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
        InsurancePlans insurancePlans;
        
        public Business(){
            this.applicantsDirectory = new ArrayList<Applicant>();
            this.insurancePlans = new InsurancePlans();
               
        }

    public
    ArrayList<Applicant> getApplicantsDirectory() {
        return applicantsDirectory;
    }

    public
    InsurancePlans getInsurancePlans() {
        return insurancePlans;
    }
        
}
