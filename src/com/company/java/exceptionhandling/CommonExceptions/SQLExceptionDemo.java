package com.company.java.exceptionhandling.CommonExceptions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionDemo {

    public static void main(String[] args) {

        try {

            Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/test",
                            "root",
                            "wrongpassword");

            System.out.println("Connected");

        } catch (SQLException e) {
            System.out.println("Database Connection Failed");
            System.out.println(e);
        }
    }
}