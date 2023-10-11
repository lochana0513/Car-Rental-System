/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.ContCarData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Controller.ContRentData;
/**
 *
 * @author Hp
 */
public class MRent {
    
      
      
    public List<ContCarData> getAvailableCarData() {
        List<ContCarData> carDataList = new ArrayList<>();

        try (Connection connection = DbConnection.getConnection()){
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT carRegistration, brand, model, status, price FROM Car Where status='Available'");
             ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String carRegistration = resultSet.getString("carRegistration");
                String brand = resultSet.getString("brand");
                String model = resultSet.getString("model");
                String status = resultSet.getString("status");
                double price = resultSet.getDouble("price");

                ContCarData carData = new ContCarData(carRegistration, brand, model, status, price);
                carDataList.add(carData);
            }
        } catch (SQLException ex) {
        }

        return carDataList;
    }
    
    
    
      public double getCarPriceByRegistration(String carRegistration) {
        double carPrice = 0.0;

        try (Connection connection = DbConnection.getConnection()) {
            String sql = "SELECT price FROM Car WHERE carRegistration = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, carRegistration);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                carPrice = resultSet.getDouble("price");
            } else {
                System.out.println("Car not found.");
            }
        } catch (SQLException ex) {
        }

        return carPrice;
    }
    
        public double calculatePrice(Date rentalDate, Date returnDate, double carPrice) {
        double totalPrice = 0.0;

        if (rentalDate != null && returnDate != null) {
            // Calculate the number of milliseconds in a day
            long millisecondsPerDay = 24 * 60 * 60 * 1000;

            // Calculate the number of days between rental and return dates
            long differenceInMilliseconds = returnDate.getTime() - rentalDate.getTime();
            int numberOfDays = (int) (differenceInMilliseconds / millisecondsPerDay);

            // Calculate the total price
            totalPrice = numberOfDays * carPrice;
        } else {
            // Handle the case where dates are not selected
        }

        return totalPrice;
    }
        
     
     public boolean saveRent( String carRegistration, String customerId,
            Date rentdate, Date returndate, double rentfee) {
        try (Connection connection = DbConnection.getConnection()) {
            String sql = "INSERT INTO rent ( carRegistration, customerId, rentdate, returndate, RENTFEE) VALUES ( ?, ?, ?, ?, ?)";
            String sql1 = "INSERT INTO RentHistory (carRegistration, customerId, rentdate, returndate, RENTFEE) VALUES ( ?, ?, ?, ?, ?)";
            String sqlUpdate = "UPDATE car SET status = 'Booked' WHERE carRegistration = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    PreparedStatement preparedStatement2 = connection.prepareStatement(sqlUpdate);
                    PreparedStatement preparedStatement3 = connection.prepareStatement(sql1)) {
               
                preparedStatement.setString(1, carRegistration);
                preparedStatement.setString(2, customerId);
                preparedStatement.setDate(3, new java.sql.Date(rentdate.getTime()));
                preparedStatement.setDate(4, new java.sql.Date(returndate.getTime()));
                preparedStatement.setDouble(5, rentfee);

              
                preparedStatement3.setString(1, carRegistration);
                preparedStatement3.setString(2, customerId);
                preparedStatement3.setDate(3, new java.sql.Date(rentdate.getTime()));
                preparedStatement3.setDate(4, new java.sql.Date(returndate.getTime()));
                preparedStatement3.setDouble(5, rentfee);

                preparedStatement2.setString(1, carRegistration);

                int rowsAffected = preparedStatement.executeUpdate();
                preparedStatement3.executeUpdate();
                preparedStatement2.executeUpdate();

                     return rowsAffected > 0;
            }
        } catch (SQLException ex) {
            return false;
        }
        
        
            }
     
        public List<ContRentData> getRentedData() {
        List<ContRentData> rentDataList = new ArrayList<>();

        try (Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT rentid, carRegistration,customerId, rentdate, returndate,RENTFEE FROM rent");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
               String rentid = resultSet.getString("rentid");
                String carRegistration = resultSet.getString("carRegistration");
                String customerId = resultSet.getString("customerId");
                Date rentalDate = resultSet.getDate("rentdate");
                Date returnsDate = resultSet.getDate("returndate");
                double rentFee = resultSet.getDouble("RENTFEE");

                ContRentData rentData = new ContRentData(rentid,carRegistration, customerId, rentalDate, returnsDate, rentFee);
                rentDataList.add(rentData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return rentDataList;
    }
      
     
     
}
