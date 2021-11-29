package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        
        UsuarioDAO  usuario = new UsuarioDAO();
        List <Usuario> usuarios = usuario.seleccionar();
        Usuario nuevoUsuario = new Usuario(1,"Ale", "Pipita17");
//        
//        usuarios.forEach(user->{
//            System.out.println("Usuario = " + user);
//        });



//        UsuarioDAO usuario = new UsuarioDAO();
//        Usuario nuevoUsuario = new Usuario("Alejandra", "Pipita17");
//        
//        usuario.insertar(nuevoUsuario);


          //usuario.actualizar(nuevoUsuario);
          usuario.eliminar(new Usuario(2));
    }

}
