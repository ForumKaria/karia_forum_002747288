/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

/**
 *
 * @author forumkaria
 */
public
        class Person {
    public String id;
    public  String firstName;
    public String lastName;

    public
    String getId() {
        return id;
    }

    public
    void setId(String id) {
        this.id = id;
    }

    
//    public
//    String getPersonType() {
//        return personType;
//    }
//
//    public
//    void setPersonType(String personType) {
//        this.personType = personType;
//    }

    
    public
    String getFirstName() {
        return firstName;
    }

    public
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public
    String getLastName() {
        return lastName;
    }

    public
    void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
        return this.id;
    }
    
}
