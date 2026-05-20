package model;

public abstract class Usuario {
    protected int idUsuario;
    protected String nombreCompleto;
    protected String email;
    protected String username;
    protected String password;
    protected String estado;

    public Usuario(int idUsuario, String nombreCompleto, String email, String username, String password, String estado) {
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.username = username;
        this.password = password;
        this.estado = estado;
    }

    public abstract String getDetalles();
}