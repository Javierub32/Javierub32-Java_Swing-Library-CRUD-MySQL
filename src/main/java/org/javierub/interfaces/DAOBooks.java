package org.javierub.interfaces;

import org.javierub.models.Books;

import java.util.List;

public interface DAOBooks {
    public void insert(Books book) throws Exception;
    public void update(Books book) throws Exception;
    public void delete(Books book) throws Exception;
    public List<Books> select(Books book) throws Exception;
}
