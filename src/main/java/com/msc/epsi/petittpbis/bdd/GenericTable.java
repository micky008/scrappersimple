package com.msc.epsi.petittpbis.bdd;

import java.util.List;

public interface GenericTable<T> {

    T selectById();

    boolean insert(T table2);

    int insert(List<T> table2);

    boolean update(T table2);

    int update(List<T> table2);

    boolean delete(T table2);

    int delete(List<T> table2);

}
