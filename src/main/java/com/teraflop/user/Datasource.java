package com.teraflop.user;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Datasource {

    @SuppressWarnings("unchecked")
    public static ArrayList<User> getUserFromDB () {
        ArrayList<User> users = new ArrayList<>();
        try {
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("user.db")));
            users = (ArrayList<User>) in.readObject();
            in.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void save(List<User> userList) {
        try (FileOutputStream file = new FileOutputStream("user.db")){
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(userList);
            out.flush();
            out.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
