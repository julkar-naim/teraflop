package com.teraflop.db;

import java.io.*;
import java.util.List;

public class FileDB<T> implements Datasource<T> {
    private String filename;

    public FileDB (String filename) {
        this.filename = filename;
    }

    @Override
    public void wirteList(List<T> list) {
        try {
            FileOutputStream file = new FileOutputStream(this.filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(list);
            out.close();
            file.close();
        }
        catch(IOException ie) {
            ie.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> readList() {
        List<T> list = null;
        try {
            FileInputStream file = new FileInputStream(this.filename);
            ObjectInputStream in = new ObjectInputStream(file);
            list = (List<T>) in.readObject();
            file.close();
            in.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
