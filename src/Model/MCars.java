/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Controller.ContCars;
import Controller.ContCarData;

/**
 *
 * @author Hp
 */
public class MCars {
    
     public boolean saveCar(String carRegistration, String brand, String model, String status, double price) {
        try (Connection connection = DbConnection.getConnection()) {
            String sql = "INSERT INTO Car (carRegistration, brand, model, status, price) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, carRegistration);
            preparedStatement.setString(2, brand);
            preparedStatement.setString(3, model);
            preparedStatement.setString(4, status);
            preparedStatement.setDouble(5, price);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
     public List<ContCarData> getAllCarData() {
        List<ContCarData> carDataList = new ArrayList<>();

        try (Connection connection = DbConnection.getConnection()){
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT carRegistration, brand, model, status, price FROM Car");
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
    
    
     public boolean deleteCar(String carRegistration) {
        try (Connection connection = DbConnection.getConnection()){
            // Define the SQL query to delete the car
            String sql = "DELETE FROM Car WHERE carRegistration = ?";
            
            // Prepare the SQL statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, carRegistration);
            
            // Execute the SQL query and get the number of affected rows
            int rowsAffected = preparedStatement.executeUpdate();
            
            return rowsAffected > 0;
        } catch (SQLException ex) {
// Handle any database-related exceptions here
                        return false;
        }
    } 
     
     public boolean updateCar(String updatedCarRegistration, String updatedBrand, String updatedModel, String updatedStatus, double updatedPrice) {
        try {
            // Establish a database connection
           Connection connection = DbConnection.getConnection();

            // Define the SQL query to update the record in the database
            String sql = "UPDATE Car SET brand=?, model=?, status=?, price=? WHERE carRegistration=?";

            // Prepare the statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, updatedBrand);
            preparedStatement.setString(2, updatedModel);
            preparedStatement.setString(3, updatedStatus);
            preparedStatement.setDouble(4, updatedPrice);
            preparedStatement.setString(5, updatedCarRegistration);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            // Close the database    connection.close();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
}
