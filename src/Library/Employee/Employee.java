/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;

import Library.Library;
import Personnel.Person;

/**
 *
 * @author forumkaria
 */
public class Employee extends Person{
    
    private String employeeId;
    private int experience;
    private String designation;
    private Library lib;
    private int libraryBuildingNo;
    
    public Employee(int experience, String designation, String id, Person p){
//        super(p.personid, p.name);
        super();
        this.employeeId = id; 
        this.experience = experience;
        this.designation = designation;
        //this.libraryBuildingNo = this.lib.getBuildingNo();
    }
    
    public Employee(int experience, String designation, String id){
//        super(p.personid, p.name);
        super();
        this.employeeId = id; 
        this.experience = experience;
        this.designation = designation;
       
    }

    public
    Library getLib() {
        return lib;
    }

    
    public void setLibrary(Library lib){
        this.lib = lib;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    @Override
    public String toString(){
        return this.employeeId;
    }
}
