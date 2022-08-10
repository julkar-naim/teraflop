package com.teraflop.user;

import java.io.Serializable;

public class User implements Serializable {

    private String id;
    private String name;
    private String username;
    private String email;
    private String password;
    private boolean adminStatus;


    public void setAdminStatus (boolean adminStatus) { this.adminStatus = adminStatus; }
    public boolean isAdmin() { return this.adminStatus; }
    public String getPassword() { return this.password; }
    public void setPassword(String password) { this.password = password; }
    public  String getId() { return this.id; }
    public  void setId(String id) { this.id = id; }
    public  String getName() { return this.name; }
    public  void setName(String name) { this.name = name; }
    public  void setEmail(String email) { this.email  = email; }
    public  String getEmail() { return this.email; }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", adminStatus=" + adminStatus +
                '}';
    }
}
