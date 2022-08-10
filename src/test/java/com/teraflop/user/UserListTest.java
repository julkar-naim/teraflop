package com.teraflop.user;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserListTest {

    @Test
    public void getUserListFromDB() {
        UserList users = UserList.createUserList();
        System.out.println(users);
        assertNotNull(users);
    }

}