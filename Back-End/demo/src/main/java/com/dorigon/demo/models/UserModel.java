package com.dorigon.demo.models;

public class UserModel {

    String userId;
    String Name;
    String userEmail;
    String userUf;
    String userCity;
    String userPassword;
    Boolean isLogged;

    String userToken;

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getName() {
        return Name;
    }

    public Boolean getLogged() {
        return isLogged;
    }

    public void setLogged(Boolean logged) {
        isLogged = logged;
    }




    public String getUserId() {
        return userId;
    }

    public String setUserId(String userId) {
        this.userId = userId;
    }

    public String geName() {
        return Name;
    }

    public void setName(String userName) {
        this.Name = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserUf() {
        return userUf;
    }

    public void setUserUf(String userUf) {
        this.userUf = userUf;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
