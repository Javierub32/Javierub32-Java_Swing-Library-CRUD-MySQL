package org.javierub.library;

import org.javierub.db.Database;
import org.javierub.interfaces.DAOUsers;
import org.javierub.models.Users;

import java.sql.PreparedStatement;
import java.util.List;

public class DAOUsersImpl extends Database implements DAOUsers {

    @Override
    public void insert(Users user) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO users(name, last_name_p, last_name_m, domicilio, tel) VALUES(?,?,?,?,?);");
            st.setString(1, user.getName());
            st.setString(2, user.getLast_name_p());
            st.setString(3, user.getLast_name_m());
            st.setString(4, user.getDomicilio());
            st.setString(5, user.getTelefono());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void update(Users user) throws Exception {

    }

    @Override
    public void delete(Users user) throws Exception {

    }

    @Override
    public List<Users> select(Users user) throws Exception {
        return List.of();
    }
}
