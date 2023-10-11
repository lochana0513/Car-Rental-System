/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.ContReturnData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class MReturn {
    
    public Date getExpectedReturnDate(String rentID) {
    try (Connection connection = DbConnection.getConnection()) {
        String sql = "SELECT returnDate FROM Rent WHERE rentid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, rentID);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return resultSet.getDate("returnDate");
        }
    } catch (SQLException ex) {
        
    }
    return null;
    }
    
        
     private double carPrice;
     private double fine;
     public double calculateFine(int delayInDays,String selectedRentid) {

		  try {
        String selectedrentid = selectedRentid ;


        // Establish a database connection
        try (Connection connection = DbConnection.getConnection()) {
            // SQL query to retrieve the price of a car based on its registration number
       
	  String pricequery = "SELECT c.price FROM Car c JOIN Rent r ON c.carRegistration = r.carRegistration WHERE r.rentid = ?";
            
            // Create a PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(pricequery );
            preparedStatement.setString(1, selectedrentid );

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a result is found
            if (resultSet.next()) {
                carPrice = resultSet.getDouble("price");
                // You can now use the carPrice variable as needed
            } else {
              
            }

            // Close the database connection
        } catch (SQLException ex) {
        }
    } catch (Exception e) {
    }
    // Implement your fine calculation logic here
    // For example, you can charge a fixed amount per day of delay
	
      if (delayInDays > 0) {
              double finePerDay = (carPrice/100)*150; // Change this to your fine rate per day
              fine= delayInDays * finePerDay;
      }
      else
      {
          fine=0.0;
      }
      return fine;
    }
     
     private double rentFee;
     public double FindRentFee(String rentID)
     {
           try (Connection connection = DbConnection.getConnection()) {
        String sql = "SELECT rentFee FROM Rent WHERE rentid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, rentID);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
           return rentFee=resultSet.getDouble("rentFee");
         
        }
    } catch (SQLException ex) {
        
    }
    return rentFee;
     }

     
      public List<ContReturnData> getReturnData() {
        List<ContReturnData> returnDataList = new ArrayList<>();

        try (Connection connection = DbConnection.getConnection()){
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT returnid,rentid,carreturnedDate,delay, fine, totalfee FROM returntable");
             ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int returnid = resultSet.getInt("returnid");
                int rentid = resultSet.getInt("rentid");
                Date returnedDate = resultSet.getDate("carreturnedDate");
                int delay = resultSet.getInt("delay");  
                double fine = resultSet.getDouble("fine");
                double totalfee = resultSet.getDouble("totalfee");


                ContReturnData returnData = new ContReturnData(returnid, rentid, returnedDate, delay,fine, totalfee);
                returnDataList.add(returnData);
            }
        } catch (SQLException ex) {
        }

        return returnDataList;
    }
    
    
     
       public boolean saveReturn( int rentid,Date returnedDate, int delay, Double fine, Double totalfee) {
        try (Connection connection = DbConnection.getConnection()) {
            String sql = "INSERT INTO ReturnTable   (rentid , carreturnedDate , delay , fine,totalfee ) VALUES (?, ?, ?, ?,?)";
            String sql2 = "UPDATE Car SET status = 'Available' WHERE carRegistration = ( SELECT carRegistration FROM Rent WHERE rentid =?)";
            String sql3 = "DELETE FROM Rent WHERE rentID =?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
                 PreparedStatement preparedStatement3 = connection.prepareStatement(sql3)) {
            preparedStatement2.setInt(1, rentid);
            preparedStatement3.setInt(1, rentid);
           
            preparedStatement.setInt(1, rentid);
            preparedStatement.setDate(2, new java.sql.Date(returnedDate.getTime()));
            preparedStatement.setInt(3, delay);
            preparedStatement.setDouble(4, fine);
            preparedStatement.setDouble(5, totalfee);
            preparedStatement2.executeUpdate();
            preparedStatement3.executeUpdate();
            int rowsAffected = preparedStatement.executeUpdate();
               

                     return rowsAffected > 0;
            }
        } catch (SQLException ex) {
            return false;
        }
        
        
            }

     
    
    
}
