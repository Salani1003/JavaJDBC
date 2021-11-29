package test;

import java.sql.*;

public class TestMysqlJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "1234");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT idPersona, nombre, apellido, mail, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {
                System.out.println("idPersona : " + resultado.getInt("idPersona"));
                System.out.println("Nombre : " + resultado.getString("nombre"));
                System.out.println("Apellido: "+ resultado.getString("apellido"));
                System.out.println("Email: " + resultado.getString("mail"));
                System.out.println("Telefono: " +resultado.getString("telefono"));
                System.out.println("");
                
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
