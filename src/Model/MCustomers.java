/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Controller.ContCustomerData;
/**
 *
 * @author Hp
 */
public class MCustomers {
    
     public boolean saveCustomer(String customerID, String customerName, String address, int phone) {
        try {
            // Establish a database connection
           Connection connection = DbConnection.getConnection();

            // Define the SQL query to insert the customer into the database
            String sql = "INSERT INTO Customer (CustomerID, CustomerName, Address, phone) VALUES (?, ?, ?, ?)";

            // Prepare the statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerID);
            preparedStatement.setString(2, customerName);
            preparedStatement.setString(3, address);
            preparedStatement.setInt(4, phone);

            // Execute the insert
            int rowsAffected = preparedStatement.executeUpdate();

            // Close the database connection
            connection.close();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
     
     
      public List<ContCustomerData> getAllCustomerData() {
        List<ContCustomerData> customerDataList = new ArrayList<>();

        try (Connection connection = DbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT customerID, customerName, address, phone FROM Customer");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                String customerID = resultSet.getString("customerID");
                String customerName = resultSet.getString("customerName");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
              

                ContCustomerData customerData = new ContCustomerData(customerID, customerName, address, phone);
                customerDataList.add(customerData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return customerDataList;
    }
      
      
     public boolean deleteCustomer(String CustomerID) {
        try (Connection connection = DbConnection.getConnection()){
            // Define the SQL query to delete the car
            String sql = "DELETE FROM Customer WHERE CustomerID = ?";
            
            // Prepare the SQL statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, CustomerID);
            
            // Execute the SQL query and get the number of affected rows
            int rowsAffected = preparedStatement.executeUpdate();
            
            return rowsAffected > 0;
        } catch (SQLException ex) {
// Handle any database-related exceptions here
                        return false;
        }
    } 
     
     
       public boolean updateCustomer(String updatedCustomerID, String updatedCustomerName, String updatedAddress, int updatedPhone) {
        try {
            // Establish a database connection
           Connection connection = DbConnection.getConnection();

            // Define the SQL query to update the record in the database
            String sql = "UPDATE Customer SET CustomerName=?, Address=?, Phone=? WHERE CustomerID=?";

            // Prepare the statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, updatedCustomerName);
            preparedStatement.setString(2, updatedAddress);
            preparedStatement.setInt(3, updatedPhone);
            preparedStatement.setString(4, updatedCustomerID);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            // Close the database    connection.close();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
}
