package com.jims.dto;

public class UserDTO {
    // Scope - default scope
    private String userid;
    private String password;

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

}
