/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORM;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author 62812
 * 
 * 
 */


 
//public class koneksi {
//    public static Connection con;
//    public static Statement stm;
//    public static void main(String args[]){
//        try {
//            String url ="jdbc:mysql://localhost:3306/mahasiswa";
//            String user="root";
//            String pass="";
//            Class.forName("com.mysql.jdbc.Driver");
//            con =(Connection) DriverManager.getConnection(url,user,pass);
//            stm = con.createStatement();
//            System.out.println("koneksi berhasil;");
//        } catch (Exception e) {
//            System.err.println("koneksi gagal" +e.getMessage());
//        }
//    }
//
//    static java.sql.Connection getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//}

public class koneksi {
     public static Connection getConnection() {
        Connection connection = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mahasiswa";
        String user = "root";
        String password = "";
        if (connection == null) {
            try {
                Class.forName(driver);
                connection = (Connection) DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException error) {
               System.exit(0);
            }

        }
        return connection;
    }
}
