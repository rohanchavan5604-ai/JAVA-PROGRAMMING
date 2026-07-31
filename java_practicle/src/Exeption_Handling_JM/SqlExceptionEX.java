package Exeption_Handling_JM;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlExceptionEX {

    public static void main(String[] args) {

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/meetai",
                    "root",
                    "//Password");

            System.out.println("Connected to DB");

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}