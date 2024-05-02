package act.gradle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    @Test
    public void testGestio_usuaris() {
        //Creamos un nou usuari y le asignamos el nombre y su correo electronico
        App.Usuario nou_usuari = new App.Usuario("Miguel Angel", "MiguelAngel@cide.com");

        //Registramos el nou usuari 
        App.Usuario.registrar_usuari(nou_usuari);
        assertTrue(App.Usuario.getGestioUsuaris().contains(nou_usuari));

        //Eliminamos el nou usuri a partir de su nombre
        App.Usuario.eliminar_usuari("Miguel Angel");
        assertFalse(App.Usuario.getGestioUsuaris().contains(nou_usuari));
    }

    @Test
    public void testGestio_llibres() {
        //Creamos un nou llibre y le asignamos el nombre y su autor
        App.Llibre nou_llibre = new App.Llibre("El principito", "Antoine de Saint-Exupéry");

        //Añadimos el nou llibre
        App.Llibre.afegir_llibre(nou_llibre);
        assertTrue(App.Llibre.getGestioLlibres().contains(nou_llibre));

        //Eliminamos el libro a partir del titol
        App.Llibre.eliminar_llibre("El principito");
        assertFalse(App.Llibre.getGestioLlibres().contains(nou_llibre));
    }
    @Test
    public void testGestio_lectura() {
        //Creamos un nou usuari y le asignamos el nombre y su correo electronico
        App.Usuario nou_usuari = new App.Usuario("Miguel Angel", "MiguelAngel@cide.com");

        //Creamos un nou llibre y le asignamos el nombre y su autor
        App.Llibre nou_llibre = new App.Llibre("El principito", "Antoine de Saint-Exupéry");

        //Marcamos el libro como leido por parte del usuario
        App.Lectura.llegirLectura(nou_usuari, nou_llibre);
        //Si el libro se ha marcado como leido, se mostrara que el usuari ha leido el libro
        assertTrue(App.Lectura.mostrarLectura(nou_usuari).contains(nou_llibre));
    }
}
