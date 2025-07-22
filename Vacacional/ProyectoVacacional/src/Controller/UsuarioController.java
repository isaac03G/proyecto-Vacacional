package Controller;

import Model.Usuario;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioController extends Usuario {

    public UsuarioController(String nombre, int edad, int identificacion, int estrato) {
        super(nombre, edad, identificacion, estrato);
    }

    public void PedirUsuario() {
        Scanner datosUsuario = new Scanner(System.in);

        nombre = datosUsuario.nextLine();
        edad = datosUsuario.nextInt();
        identificacion = datosUsuario.nextInt();
        estrato = datosUsuario.nextInt();

    }

    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void creacionLista(String nombre, int edad, int identificacion, int estrato) {

        Usuario nuevoUsuario;
        nuevoUsuario = new Usuario(nombre, edad, identificacion, estrato) {
        };
        listaUsuarios.add(nuevoUsuario);

    }

    public void crearArchivo() {

        try {
            File archivo = new File("C://Users//isaac//OneDrive//Documentos");
            // profe, recuerde cambiar la ubicacion del archivo (esta predestinado para que se guarde en "documentos")

            if (archivo.createNewFile()) {

                System.out.println("el archivo ya existe....");

            } else {
                System.out.println("archivo creado: " + archivo.getName());
                System.out.println("ruta del archivo: " + archivo.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("ocurrio un error....");
            e.printStackTrace();
        }

    }

    public void guardarInfoArchivo() {

        try {
            FileWriter archivo = new FileWriter("Usuarios.txt");
            PrintWriter escritor = new PrintWriter(archivo);
            escritor.println("NOMBRE: " + nombre);
            escritor.println("EDAD: " + edad);
            escritor.println("IDENTIFICACION: " + identificacion);
            escritor.println("ESTRATO: " + estrato);
            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void actualizarUsuario(int idBuscado, String nuevoNombre, int nuevaEdad, int nuevoEstrato) {

        for (Usuario u : listaUsuarios) {
            if (u.getIdentificacion() == idBuscado) {
                u.setNombre(nuevoNombre);
                u.setEdad(nuevaEdad);
                u.setEstrato(nuevoEstrato);
                return;

            }
        }
    }

    

}
