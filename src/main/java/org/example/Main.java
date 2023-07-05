package org.example;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo-2023-1", "root", "DB2023mysql*");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM estudiante");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}