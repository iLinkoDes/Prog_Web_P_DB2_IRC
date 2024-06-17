/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexionMySQL {
    
    private Connection conn;
    private String bd;
    private String host;
    private String port;
    
    public ConexionMySQL(){
        bd = "universidad";
        host = "localhost";
        port = "3306";
        conn = null;
    }

    private boolean setDriver(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return true;
        }catch(ClassNotFoundException ex){
            return false;
        }
    }
    
    public Connection getConnection() throws SQLException{
        if(setDriver()){
            String URL = "jdb:mysql://"+host+":"+port+"/"+bd;
            conn = DriverManager.getConnection(URL, "root", "");
        }
        return conn;
    }
}
