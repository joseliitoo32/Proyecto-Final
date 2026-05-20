package model;

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

    @Override
    public String getDetalles() {
        return "Administrador: " + nombreCompleto;
    }
}