/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Hp
 */
public class ContCustomerData {
        private String customerID ;
    private String customerName ;
    private String address ;
    private String phone ;
  

    public ContCustomerData(String customerID, String customerName, String address, String phone) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
      
    }
    
     public String getcustomerID() {
        return customerID;
    }

    public String getcustomerName() {
        return customerName;
    }

    public String getaddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

 
    
}
