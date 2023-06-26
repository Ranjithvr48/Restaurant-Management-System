# Restaurant Management System

This is a Restaurant Management System application built using Java and Spring Boot. It provides RESTful APIs for managing restaurants.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Data Flow](#data-flow)
- [Data Structure Used](#data-structure-used)


## Features

- Get a list of all restaurants
- Get a specific restaurant by ID
- Add new restaurants
- Update existing restaurants
- Delete restaurants

## Prerequisites

- Java Development Kit (JDK) 20 or later
- Apache Maven
- Git
- Dependencies:
     - Spring Web
     - H2 database
     - Spring Data Jpa   

## Data Flow

The data flow in the project is as follows:

  1. Controller

     - `RestaurantController`: Handles incoming HTTP requests related to restaurants. It defines various methods for handling CRUD operations on restaurants.


   3. Repository

      - `RestaurantRepo`: Provides methods for accessing and manipulating the restaurant data. It uses an in-memory `restaurantMap` as a storage mechanism.

   4. Model

      - `Restaurant`: Represents a restaurant. It has attributes such as ID, name, address, phone number, specialty, and total staff count.

  

## Data Structure Used

- `Map<Integer, Restaurant>`: Used as an in-memory storage for storing restaurant objects. The restaurant ID is used as the key.

## Project Summary

The project demonstrates the use of Java and the Spring framework for building a restaurant management system. It follows a simple architecture where the controller handles incoming requests, the service provides business logic, and the repository interacts with the data storage. The project includes input validation using annotations, dependency injection, and RESTful API design principles.





## API Endpoints

The following API endpoints are available:

- `GET /restaurants`: To Get All Restraunts.

- `GET /restaurants/search/{id}`: To Get One Restraunts by Id.

- `Post /restaurants/add` To Add New Restraunts.

- `PUT /restaurants/update/{id}`
To update the Restraunt Info.

- `DELETE /restaurants/delete/{id}`
To delete the Restraunt.




## License
This project is not licensed.
