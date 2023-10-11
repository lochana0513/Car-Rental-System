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
public class ContReturnData {
    
    private int returnid ;
    private int rentid ;
    private Date returnedDate ;
    private int delay ;
    private Double fine;
    private Double totalfee;
  

    public ContReturnData(int returnid ,int rentid,Date returnedDate, int delay, Double fine, Double totalfee) {
        this.returnid = returnid;
        this.rentid = rentid;
        this.returnedDate = returnedDate;
        this.delay = delay;
        this.fine = fine;
        this.totalfee = totalfee;
      
    }
    
     public int getreturnid() {
        return returnid;
    }

    public int getrentid() {
        return rentid;
    }

    public Date getreturnedDate() {
        return returnedDate;
    }

    public int getdelay() {
        return delay;
    }
    
    public Double getfine() {
        return fine;
    }
    
    public Double gettotalfee() {
        return totalfee;
    }



}
