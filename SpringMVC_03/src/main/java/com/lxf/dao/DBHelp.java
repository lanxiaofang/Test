package com.lxf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBHelp {

    public static Connection getConnection(){
        Connection connection = null;
        String url = "jdbc:mysql://mysql.lanlj.com/lanxiaofang";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,"lanxiaofang","L983770299");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void colese(ResultSet rs, PreparedStatement ps, Connection con){
        try{
            rs.close();
            ps.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }










}
