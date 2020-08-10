package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionPooling {

    private DBConnectionPooling(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\databases\\kristensDB.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

            statement.close();
            conn.close();
        }catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    private static DBConnectionPooling instance = new DBConnectionPooling();;

    public static DBConnectionPooling getInstance(){
        return instance;
    }
}
