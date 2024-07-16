package org.javierub.library;

import org.javierub.db.Database;
import org.javierub.interfaces.DAOUsers;
import org.javierub.models.Users;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
    public List<Users> select() throws Exception {
        List<Users> lista = null;
        try {
            this.conectar();
            PreparedStatement st = this.connection.prepareStatement("SELECT * FROM users;");

            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Users user = new Users();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setLast_name_p(rs.getString("last_name_p"));
                user.setLast_name_m(rs.getString("last_name_m"));
                user.setDomicilio(rs.getString("domicilio"));
                user.setTelefono(rs.getString("tel"));
                user.setSanctions(rs.getInt("sanctions"));
                user.setSanc_money(rs.getInt("sanc_money"));
                lista.add(user);
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lista;
    }
}
