package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            Usuario nuevoUsuario = new Usuario();
            
            nuevoUsuario.setUsuario("Salani");
            nuevoUsuario.setPassword("WACHI");
            usuarioDao.insertar(nuevoUsuario);
            
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(3);
            cambioUsuario.setUsuario("Alejandra");
            cambioUsuario.setPassword("Pipita17");
            
            usuarioDao.actualizar(cambioUsuario);
            
            conexion.commit();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollBack");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
