package com.lxf.entity;

public class Student {

    private int sid;
    private String sname;
    private String spwd;
    private String spictrue;

    public Student() {
    }

    public Student(int sid, String sname, String spwd, String spictrue) {
        this.sid = sid;
        this.sname = sname;
        this.spwd = spwd;
        this.spictrue = spictrue;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", spwd='" + spwd + '\'' +
                ", spictrue='" + spictrue + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSpwd() {
        return spwd;
    }

    public void setSpwd(String spwd) {
        this.spwd = spwd;
    }

    public String getSpictrue() {
        return spictrue;
    }

    public void setSpictrue(String spictrue) {
        this.spictrue = spictrue;
    }
}
