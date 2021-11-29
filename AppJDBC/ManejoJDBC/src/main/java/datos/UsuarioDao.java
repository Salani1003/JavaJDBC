package datos;

import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;

public interface UsuarioDao {

    public List<UsuarioDTO> select()throws SQLException;
    public int insert(UsuarioDTO usuario)throws SQLException;
    public int update(UsuarioDTO usuario)throws SQLException;
    public int delete(UsuarioDTO usuario)throws SQLException;
    
}
