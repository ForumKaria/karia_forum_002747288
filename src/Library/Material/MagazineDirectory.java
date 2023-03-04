/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author forumkaria
 */
public class MagazineDirectory {
    ArrayList<Magazine> magazines;
    
    public MagazineDirectory(){
        this.magazines = new ArrayList<Magazine>();
    }
    
    public Magazine addMagazine(String name, Date date, String company, String issueType){
        Magazine mag = new Magazine(name, date, company, issueType);
        this.magazines.add(mag);
        return mag;
    }

    public ArrayList<Magazine> getMagazines() {
        return magazines;
    }
    
    public Magazine findMagazineByName(String title){
        for (Magazine m: magazines){
            if (m.getName().equals(title)){
                return m;
            }
        }
        return null;
    }
    
    public Magazine findMagazineById(String magazineId){
        for (Magazine m: magazines){
            if (m.getMaterialId().equals(magazineId)){
                return m;
            }
        }
        return null;
    }
}
