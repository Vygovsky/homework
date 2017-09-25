package lesson16.task2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;

/**
 * Created by Roman_v on 18.09.2017.

public class UserDao {
    private Connection connection;

    public String getPasswordByLogin(String login) {
        String password = null;
        Statement statement = null;
        try {
            connection = BdConection.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select password from user where login=" + login);
            while (resultSet.next()) {
                password = resultSet.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            BdConection.close(connection);
        }
        return password;
    }

    public static void main(String[] args) {
        UserDao user = new UserDao();
        String pass = user.getPasswordByLogin("milkina");
        System.out.println(pass);

    }
}
*/