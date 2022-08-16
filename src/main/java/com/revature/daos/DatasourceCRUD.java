package com.revature.daos;

import java.util.List;
import java.sql.SQLException;

public interface DatasourceCRUD<T> {
    void create(T t);
    T read(int id);
    List<T> readAll();
    void update(T t, Integer i);
    void delete(int id);
}
