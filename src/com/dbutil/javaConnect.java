/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dbutil;

/**
 *
 * @author Subik
 */
import java.sql.*;
import javax.swing.*;
public class javaConnect {
    Connection conn = null;
    public static Connection ConnecrDb(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
    System.out.println("connection Established");
    return conn;
    
    }catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Not Connected");
        return null;
    }
    }
    
    
    
}