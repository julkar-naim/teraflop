package com.teraflop.user;

import com.teraflop.util.Exceptions.UserNotFoundException;

import java.util.List;

public class UserAction {
    private List<User> users;

    public UserAction(List<User> list) {
        this.users = list;
    }

    public List<User> getUserList() { return this.users = Datasource.getUserFromDB(); }

    public void deleteUser(String userId) throws UserNotFoundException {
        for (User user: this.users) {
            if (user.getId().equals(userId)) {
                this.users.remove(user);
                return;
            }
        }
        throw new UserNotFoundException();
    }
    public void signUp(String id, String name, String email, String password, boolean adminStatus) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setAdminStatus(adminStatus);
        this.users.add(user);
        Datasource.save(this.users);
    }
}
