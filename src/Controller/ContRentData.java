/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Date;

/**
 *
 * @author Hp
 */
public class ContRentData {
    
    private String rentid ;
    private String carRegistration ;
    private String customerId ;
    private Date rentdate ;
    private Date returndate;
    private Double rentfee;
  

    public ContRentData(String rentid,String carRegistration,String customerId, Date rentdate, Date returndate, Double rentfee) {
        this.rentid = rentid;
        this.carRegistration = carRegistration;
        this.customerId = customerId;
        this.rentdate = rentdate;
        this.returndate = returndate;
        this.rentfee = rentfee;
      
    }
    
     public String getrentid() {
        return rentid;
    }

    public String getcarRegistration() {
        return carRegistration;
    }

    public String getcustomerId() {
        return customerId;
    }

    public Date getrentdate() {
        return rentdate;
    }
    
    public Date getreturndate() {
        return returndate;
    }
    
    public Double getrentfee() {
        return rentfee;
    }



 
    
}
