# Vehicle DB

A Hibernate-based Java project for managing vehicle data. This application allows users to perform basic CRUD (Create, Read, Update, Delete) operations on a vehicle database. The project is built using the Hibernate ORM framework and MySQL for persistent data storage.

## Features
- Add new vehicles
- View all vehicles
- Update vehicle details
- Delete vehicles from the database

## Technologies Used
- **Java**: Core programming language for business logic
- **Hibernate**: ORM framework for mapping Java objects to MySQL database tables
- **MySQL**: Relational database for storing vehicle records
- **Maven**: For project build and dependency management
- **HQL**: Hibernate Query Language for interacting with the database

## Vehicle Details
The vehicle table contains the following fields:
- **vehicleID**: Unique identifier for each vehicle (Primary Key)
- **vehicleName**: Name of the vehicle
- **vehicleType**: Type of the vehicle (e.g., Car, Bike)
- **manufacturer**: The company that made the vehicle
- **price**: Price of the vehicle

## Prerequisites
1. Install **MySQL** and set up the database.
2. Install **Maven** to manage dependencies.
3. Install a **JDK** (Java Development Kit).

## Database Setup

1. Open MySQL and create the database and table:
   ```sql
   CREATE DATABASE vehicle_db;
   USE vehicle_db;

   CREATE TABLE vehicles (
       vehicleID INT PRIMARY KEY AUTO_INCREMENT,
       vehicleName VARCHAR(100),
       vehicleType VARCHAR(50),
       manufacturer VARCHAR(100),
       price DOUBLE
   );
