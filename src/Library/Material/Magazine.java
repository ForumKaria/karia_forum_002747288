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
public class Magazine extends Material{
    private String company;
    private String issueType;
            Float price;

    public
    Float getPrice() {
        return price;
    }

    public
    void setPrice(Float price) {
        this.price = price;
    }
    
    public Magazine(String name, Date date, String company, String issueType, Float price){
        super();
        this.name = name;
        this.date = date;
        this.company = company;
        this.issueType = issueType;
        this.materialType = "Magazine";
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
    
    
            
}
