package com.teraflop.user;

import com.teraflop.db.Datasource;
import com.teraflop.db.FileDB;

import java.io.Serializable;
import java.util.List;

public class UserList implements Serializable {
    private List<User> userList;
    private static UserList instance;

    private UserList(Datasource<User> source) {
        this.userList = source.readList();
    }
    public static UserList createUserList() {
        if (instance == null) {
            instance = new UserList(new FileDB<User>("user.db"));
        }
        return instance;
    }
}