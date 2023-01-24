package com.vehicleRequest.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if(connection!=null) {
            return connection;
        }

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/vehiclerequestusers?allowPublicKeyRetrieval=true&useSSL=false";

        String root = "root";
        String password = "Morado@123";

        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url,root,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
