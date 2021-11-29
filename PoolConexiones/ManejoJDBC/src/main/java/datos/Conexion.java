package datos;

import java.sql.*;
import javax.sql.*;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    // EN ESTA CLASE VAMOS A HACER TODO LO QUE SE REFIERA A LA CONECCION CON LA BASE DE DATOS
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "1234";

    public static DataSource getDataSource(){
        BasicDataSource ds =new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        //definimos el tamaña inicial de pool
        ds.setInitialSize(5);
        return ds;
    }

    
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
