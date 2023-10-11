CREATE TABLE ReturnTable (
    returnID INT AUTO_INCREMENT PRIMARY KEY,
    rentID INT,
    carReturnedDate DATE,
    delay INT,
    fine DECIMAL(10, 2),  
    totalfee DECIMAL(10, 2),  
    FOREIGN KEY (rentID) REFERENCES RentHistory(rentID)
   
)AUTO_INCREMENT = 1000;


CREATE TABLE RentHistory(
    rentID INT AUTO_INCREMENT PRIMARY KEY,
    carRegistration VARCHAR(20),
    customerID VARCHAR(20),
    rentDate DATE,
    returnDate DATE,
    rentFee DECIMAL(10, 2),
    FOREIGN KEY (carRegistration) REFERENCES Car(carRegistration),
    FOREIGN KEY (customerID) REFERENCES Customer(customerID)
)AUTO_INCREMENT = 1000;



CREATE TABLE Rent(
    rentID INT AUTO_INCREMENT PRIMARY KEY,
    carRegistration VARCHAR(20),
    customerID VARCHAR(20),
    rentDate DATE,
    returnDate DATE,
    rentFee DECIMAL(10, 2)
  
)AUTO_INCREMENT = 1000;


CREATE TABLE Customer (
    customerID VARCHAR(20) PRIMARY KEY,
    customerName VARCHAR(100),
    Address VARCHAR(255),
    phone VARCHAR(20)
);


CREATE TABLE Car (
    carRegistration VARCHAR(20) PRIMARY KEY,
    brand VARCHAR(50),
    model VARCHAR(50),
    status VARCHAR(20),
    price DECIMAL(10, 2)
);


CREATE TABLE Users (
    userID INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    employeeName VARCHAR(100)
);

INSERT INTO Users (username, password, employeeName) VALUES
    ('user1', '1111', 'John Doe'),
    ('user2', '2222', 'Jane Smith'),
    ('user3', '3333', 'Bob Johnson');

