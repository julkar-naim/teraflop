package com.teraflop.db;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FileDBTest {

    @Test
    public void readFromDBAndWrite() {
        List<String> list = new ArrayList<>();
        FileDB<String> filedb = new FileDB<>("user.db");

        list.add("this is a new string");
        filedb.wirteList(list);

        List<String> deserializedObject = filedb.readList();

        assertNotNull(deserializedObject);
    }
}