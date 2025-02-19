package com.example.Jobportal.securityconfigs.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

;

@Entity(name = "userpasswords")
public class User {
    @Id
    String employeeid;
    String userName;
    String userPassword;

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
