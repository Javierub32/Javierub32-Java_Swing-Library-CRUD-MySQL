/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javierub.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
        final String JDBC_DRIVER = "org.postgresql.Driver";
        final String JDBC_URL = "jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:6543/postgres";
        final String USER = "postgres.infnxkadbnhdulrfpext";
        final String PASS = "JuQikUrYOf0HN7WF";
        protected Connection connection;
        
        public void conectar(){
            try {
                // Cargar y registrar el driver JDBC de PostgreSQL
                Class.forName("org.postgresql.Driver");

                // Establecer la conexión
                connection = DriverManager.getConnection(JDBC_URL, USER, PASS);

                // Si la conexión es exitosa, imprime un mensaje
                System.out.println(JDBC_DRIVER);
            } catch (ClassNotFoundException e) {
                System.out.println("No se pudo encontrar el driver JDBC.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("No se pudo establecer la conexión a la base de datos.");
                e.printStackTrace();
            }
        }
        
        public void cerrar(){
            try {
                if(connection != null && !connection.isClosed()){
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("No se pudo cerrar la conexión a la base de datos.");
                e.printStackTrace();
            }
        }
}

