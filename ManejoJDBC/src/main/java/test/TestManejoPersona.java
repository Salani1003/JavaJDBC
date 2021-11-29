package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersona {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        Persona nuevaPersona = new Persona("PEPE", "GOMEZ", "PEPEGOMEZ@gmail.com", "58777");

        //personaDao.insertar(nuevaPersona);

        /*  for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
      
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
         */
        
        /*System.out.println("ACTUALIZAR PERSONA");

        Persona nuevaPersona2 = new Persona(6, "GLORIA", "CHESTER", "jChestes@mail.com", "7894561233");
        personaDao.actualizar(nuevaPersona2);

        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });*/
        
        System.out.println("ELIMINAR PERSONA");
        
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        
        

    }
}
