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
        class InsurancePlans {
        private int planID;
        private String planName;
        private float costPerMonth;
        private float costPerAnnum;
        

    public
    int getPlanID() {
        return planID;
    }

    public
    void setPlanID(int planID) {
        this.planID = planID;
    }

    public
    String getPlanName() {
        return planName;
    }

    public
    void setPlanName(String planName) {
        this.planName = planName;
    }

    public
    float getCostPerMonth() {
        return costPerMonth;
    }

    public
    void setCostPerMonth(float costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public
    float getCostPerAnnum() {
        return costPerAnnum;
    }

    public
    void setCostPerAnnum(float costPerAnnum) {
        this.costPerAnnum = costPerAnnum;
    }
        
}
