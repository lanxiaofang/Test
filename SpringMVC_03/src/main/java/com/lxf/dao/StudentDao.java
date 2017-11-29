package com.lxf.dao;

import com.lxf.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

    public int getmax() {
        int n = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBHelp.getConnection();
            ps = con.prepareStatement("select MAX(sid) from student");
            rs = ps.executeQuery();
            if (rs.next()) {
                n = rs.getInt (1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return n+1;
    }

    public int regist(Student student) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int n = 0;
        try {
            con = DBHelp.getConnection();
            ps = con.prepareStatement("INSERT INTO student VALUES (?,?,?,?)");
            ps.setInt(1, getmax());
            ps.setString(2, student.getSname());
            ps.setString(3, student.getSpwd());
            ps.setString(4, student.getSpictrue());
            n = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return n;
    }

    public int login(Student student){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int n = 0;
        try {
            con = DBHelp.getConnection();
            ps = con.prepareStatement("select * from student where sname = '"+student.getSname()+"'  && spwd = '"+student.getSpwd()+"'");
            rs = ps.executeQuery();
            if(rs.next()){
                n = 1;
            }
            System.out.println(n);
        } catch (Exception e) {
            System.out.println(e);
        }
        return n;
    }








}
