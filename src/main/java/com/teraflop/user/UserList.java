package com.teraflop.user;

import java.util.List;

public class UserList<T> {
    private List<? extends T> list;

    UserList(List<? extends T> list) {
        this.list = list;
    }

    public List<? extends T> getUserList() {
        return this.list;
    }
    public void deleteUser(T u) {

    }

}
