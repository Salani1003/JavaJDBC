package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersona {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDao = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona();

            cambioPersona.setIdPersona(6);
            cambioPersona.setNombre("Pablito bebe");
            cambioPersona.setApellido("Salani");
            cambioPersona.setMail("Psalani@gmail.com");
            
            personaDao.actualizar(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Alej");
            nuevaPersona.setApellido("Spinelli");
            nuevaPersona.setMail("aspinelli@mail.con");
            personaDao.insertar(nuevaPersona);
            
            conexion.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}
