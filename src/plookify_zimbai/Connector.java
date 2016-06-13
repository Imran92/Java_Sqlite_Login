/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plookify_zimbai;

import java.sql.*;

/**
 *
 * @author Abdul-Malek
 */
public class Connector {

    public static Connection connect() {
        Connection c = null;
        try {
            
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:plookify.db");
        
        } catch (Exception e) {
            
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        
        }
        return c;
    }
}
