package com.fishpro.thymeleaf.dto;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author 86171
 */
public class Student {
    private int studentId;
    private String name;
    private Date birthday;
    private String department;
    private String dormitory;

    public Student(int studentId, String name, Date birthday, String department, String dormitory) {
        this.studentId = studentId;
        this.name = name;
        this.birthday = birthday;
        this.department = department;
        this.dormitory = dormitory;
    }
    public Student(){

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", department='" + department + '\'' +
                ", dormitory=" + dormitory +
                '}';
    }
}
