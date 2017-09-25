package lesson16.task2.dao;

import lesson7.task4.com.company.professions.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Roman_v on 25.09.2017.
 */
public class BdConetSmot {
    private final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/shoptosport?SSL=false";
    private final String DB_LOGIN = "root";
    private final String DB_PASSWORD = "admin";

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
            System.out.println("Connect OK");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Connect ERROR");
        }
     return connection;
    }
}
