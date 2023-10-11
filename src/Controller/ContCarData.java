/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Hp
 */
public class ContCarData {
    
      private String carRegistration;
    private String brand;
    private String model;
    private String status;
    private double price;

    public ContCarData(String carRegistration, String brand, String model, String status, double price) {
        this.carRegistration = carRegistration;
        this.brand = brand;
        this.model = model;
        this.status = status;
        this.price = price;
    }
    
     public String getCarRegistration() {
        return carRegistration;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }
    
}
