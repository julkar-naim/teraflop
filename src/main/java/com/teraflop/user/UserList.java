package com.teraflop.user;

import com.teraflop.util.Exceptions.UserNotFoundException;

import java.io.Serializable;
import java.util.List;

public class UserList implements Serializable {
    private List<User> users;
    private static UserList instance;

    public void reset() {
        this.users.clear();
        instance = null;
    }

    public static UserList createUserList() {
        if (instance == null)
            instance = new UserList(Datasource.getUserFromDB());
        return instance;
    }

    private UserList(List<User> users) {
        this.users = users;
    }

}