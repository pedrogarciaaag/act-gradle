package act.gradle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import act.gradle.App.Usuario;

public class App {

        public static class Usuario {

                String nombre;
                String email;

                
                static List<Usuario> listaUsuarios = new ArrayList<>();
                // listaUsuarios = new ArrayList<>();

                public Usuario(String nombre, String email) {
                        this.nombre = nombre;
                        this.email = email;
                }

                public static void registrar_usuari(Usuario nuevo_usuario) {
                        listaUsuarios.add(nuevo_usuario);
                        // return listaUsuarios;
                }

                public static void eliminar_usuari(String nuevo_usuario) {

                        for (int i = 0; i < listaUsuarios.size(); i++) {
                                if (listaUsuarios.get(i).nombre.equals(nuevo_usuario)) {
                                        listaUsuarios.remove(i);
                                }

                        }
                }

                public static List<Usuario> getGestioUsuaris() {
                        return listaUsuarios;
                }

        }

        public static class Llibre {

                String nombre;
                String autor;

                static List<Llibre> listaLibros = new ArrayList<>();;
                // listaUsuarios = new ArrayList<>();

                public Llibre(String nombre, String autor) {
                        this.nombre = nombre;
                        this.autor = autor;
                }

                public static void afegir_llibre(Llibre nuevo_libro) {
                        listaLibros.add(nuevo_libro);
                        // return listaLibros;
                }

                public static void eliminar_llibre(String nuevo_libro) {
                        for (int i = 0; i < listaLibros.size(); i++) {
                                if(listaLibros.get(i).nombre.equals(nuevo_libro)){
                                listaLibros.remove(i);
                                }
                                
                            }
                }

                public static List<Llibre> getGestioLlibres() {
                        return listaLibros;
                }

        }

        public static class Lectura {

                static List<Llibre> librosleidos;
                static HashMap<Usuario, List<Llibre>> Leidos = new HashMap<>();

                static void llegirLectura(Usuario usuario, Llibre libro) {

                        if (!Leidos.containsKey(usuario)) {
                                librosleidos = new ArrayList<>();
                                Leidos.put(usuario, librosleidos);
                        }

                        Leidos.get(usuario).add(libro);

                }

                static List<Llibre> mostrarLectura(Usuario usuario) {

                        return Leidos.get(usuario);
                }

        }

}
