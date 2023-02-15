/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author forumkaria
 */
public
        class Vaccine {
        private String vaccineName;
        private boolean courseCompleted;
        private int vaccineId;
        
        public Vaccine(String vaccineName, boolean courseCompleted, int vaccineId){
            this.vaccineName = vaccineName;
            this.courseCompleted = courseCompleted;
            this.vaccineId = vaccineId;
}

    public
    int getVaccineId() {
        return vaccineId;
    }

    public
    void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }
        
    public
    String getVaccineName() {
        return vaccineName;
    }

    public
    void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public
    boolean isCourseCompleted() {
        return courseCompleted;
    }

    public
    void setCourseCompleted(boolean courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
        
}
