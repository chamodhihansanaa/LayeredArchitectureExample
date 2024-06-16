package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
 public ArrayList<CustomerDTO> loadAllCustomer() throws SQLException, ClassNotFoundException;

 public void saveCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException;

 public void updateCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException;

 public void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

 public boolean existsCustomer(String id) throws SQLException, ClassNotFoundException;

 public String generateNewId() throws SQLException, ClassNotFoundException;

 public ArrayList<String> loadAllCustomerId() throws SQLException, ClassNotFoundException;
}