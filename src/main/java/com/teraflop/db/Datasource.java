package com.teraflop.user;

import java.util.List;

interface Datasource<T> {
    void wirteList(List<T> list);
    List<T> readList();
}