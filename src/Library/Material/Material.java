/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library.Material;

import java.util.Date;

/**
 *
 * @author forumkaria
 */
public class Material {
    private static int count = 0;
    private String materialId;
    String name;
    Date date;
    Boolean isAvailable = true;
    
    public Material(){
        this.materialId = "MaterialID_" + count++; 
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public String getAvailability(Boolean isAvailable){
        if (isAvailable){
            return "YES";
        }
        return "NO";
    }
    
    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String serialNo) {
        this.materialId = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
