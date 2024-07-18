package org.javierub.interfaces;

import org.javierub.models.Users;

import java.util.List;

public interface DAOUsers {
    public void insert(Users user) throws Exception;
    public void update(Users user) throws Exception;
    public void delete(int userId) throws Exception;
    public List<Users> select(String name) throws Exception;
    public Users selectById(int userId) throws Exception;
}
