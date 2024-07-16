package org.javierub.interfaces;

import org.javierub.models.Users;

import java.util.List;

public interface DAOUsers {
    public void insert(Users user) throws Exception;
    public void update(Users user) throws Exception;
    public void delete(Users user) throws Exception;
    public List<Users> select() throws Exception;
}
