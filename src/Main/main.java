/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class main {

    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cons = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/quanlycuahang",
                    "phpmyadmin",
                    "uitkhoa2019");

            Statement stmt = cons.createStatement();
            ResultSet rs = stmt.executeQuery("select * from cthd");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
            }
            cons.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
