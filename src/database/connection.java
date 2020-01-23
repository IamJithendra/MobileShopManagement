/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jithendra,ebin
 */
public class connection {
public static Connection getConnection(){
    Connection c=null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost/mobiles","root","password");
        // Display Connection Successfull Message
        System.out.println("Connected Successfully");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
    return c;
}
}
