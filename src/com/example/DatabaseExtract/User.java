/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.DatabaseExtract;

/**
 *
 * @author HOME
 */
public class User {
    
    private int userId;
    private String userFirstName;
    private String userLastName;
    private Role userRoleId;
    private String userContact;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public Role getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Role userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }
    
    
}
