package com.teraflop.app;

import com.teraflop.user.User;
import com.teraflop.user.UserAction;

import javax.sql.DataSource;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        UserAction userAction = new UserAction(new ArrayList<User>());

        System.out.println(userAction.getUserList());
    }
}
