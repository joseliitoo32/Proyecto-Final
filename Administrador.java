package model;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Administrador extends Usuario {
    public Administrador(int idUsuario, String nombreCompleto, String email, String username, String password, String estado) {
        super(idUsuario, nombreCompleto, email, username, password, estado);
    }

    public void gestionarUsuarios() {
        System.out.println("Gestionando usuarios...");
    }

    public void añadirUsuario() {
        System.out.println("Usuario añadido.");
    }

    public void editarUsuario() {
        System.out.println("Usuario editado.");
    }

    public void dardeBaja() {
        System.out.println("Usuario dado de baja.");
    }

    public void generarReporte() {
        System.out.println("Reporte generado.");
    }

// Crear archivo de deuda
    public void crearDeuda() {

        try {
            FileWriter archivo = new FileWriter("deudas.txt");

            archivo.write("tienes un pago pendiente");

            archivo.close();

            System.out.println("Archivo creado.");

        } catch (IOException e) {

            System.out.println("Error al crear el archivo.");
        }
    }

    
    @Override
    public String getDetalles() {
        return "Administrador: " + nombreCompleto;
    }
}
