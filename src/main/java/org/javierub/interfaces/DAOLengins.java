package org.javierub.interfaces;

import org.javierub.models.Lendings;

import java.util.List;

public interface DAOLengins {
    public void insert(Lendings lending) throws Exception;
    public void update(Lendings lending) throws Exception;
    //public void delete(Lendings lending) throws Exception;
    public List<Lendings> select(Lendings lending) throws Exception;
}
