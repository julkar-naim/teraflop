package com.teraflop.db;

import java.util.List;

public interface Datasource<T> {
    void wirteList(List<T> list);
    List<T> readList();
}