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
    public String personid;
    public  String name;
    
    public Person(){
        
    }
    
    public Person(String id, String name) {
        personid = id;
        name = name;
    }

    public
    String getId() {
        return personid;
    }

    public
    void setId(String id) {
        this.personid = id;
    }


    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    
    
    @Override
    public String toString() {
        return this.personid;
    }
    
}
