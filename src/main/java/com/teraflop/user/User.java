package com.teraflop.user;

public abstract class User {
    protected String id;
    protected String name;
    protected String username;
    protected String email;
    protected String password;


    public String getPassword() { return this.password; }
    public void setPassword(String password) { this.password = password; }
    public  String getId() { return this.id; }
    public  void setId(String id) { this.id = id; }
    public  String getName() { return this.name; }
    public  void setName(String name) { this.name = name; }
    public  void setEmail(String email) { this.email  = email; }
    public  String getEmail() { return this.email; }
}
