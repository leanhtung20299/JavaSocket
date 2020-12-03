/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author PT-LS
 */
public class UserDAO extends DAO{
    public UserDAO() {
        super();
    }

    public Account checkUser(Account user)  {

        String sql = "SELECT * from account where username = ? AND password = ?";
        try{ 
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            Account acc = new Account();
            if (rs.next()) {
                acc.setName(rs.getString("name"));      
                acc.setUsername(rs.getString("username"));
                acc.setScore(rs.getFloat("score"));
               return acc;
            }              
        } catch (Exception e) {
           
        }
        
        return null;
    }

     
//    public Account searchAccount(String user){
//        String query = "Select * FROM account WHERE username ='"
//                + user + "'";
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            Account acc = new Account();
//            if (rs.next()) {
//                acc.setName(rs.getString("name"));      
//                acc.setUsername(rs.getString("username"));
//                acc.setScore(rs.getFloat("score"));
////                acc.setPassword(rs.getString("password"));
//                acc.setEmail(rs.getString("email"));
////                acc.setGender(rs.getBoolean("gender"));
////                acc.setAddress(rs.getString("address"));
////                acc.setBirthday(rs.getString("birthday"));
////                acc.setPhone(rs.getString("phone"));
////                acc.setStatus(rs.getBoolean("status"));      
//            }
//            return acc;
//        } catch (Exception e) {
//        }       
//        return null;
//    }
}
