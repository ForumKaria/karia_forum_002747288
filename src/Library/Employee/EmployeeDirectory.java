/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Employee;

import Library.Library;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public class EmployeeDirectory {
    public ArrayList<Employee> employees = new ArrayList<Employee>();
    private Library library;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public Library getLibrary() {
        return library;
    }
    
    public Employee createEmployee(int exp, String des, String name, String id, Library lib){
        Employee e = new Employee(exp, des, id);
        
        e.setId(e.getEmployeeId());
        e.setName(name);
        
        e.setLibrary(lib);
        this.library = lib;
        
        this.employees.add(e);
        return e;
    }

    
    
    
}
