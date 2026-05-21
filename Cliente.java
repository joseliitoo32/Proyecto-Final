package model;

import java.time.LocalDate;

public class Cliente extends Usuario {
    private String tipoSuscripcion;
    private LocalDate fechaUltimoPago;

    public Cliente(int idUsuario, String nombreCompleto, String email, String username,
                   String password, String estado, String tipoSuscripcion, LocalDate fechaUltimoPago) {
        super(idUsuario, nombreCompleto, email, username, password, estado);
        this.tipoSuscripcion = tipoSuscripcion;
        this.fechaUltimoPago = fechaUltimoPago;
    }

    public void verProgreso() {
        System.out.println("Mostrando el progreso del cliente.");
    }

    public void verCalendario() {
        System.out.println("Mostrando el calendario de rutinas.");
    }

    public void seleccionarRutina() {
        System.out.println("Rutina seleccionada.");
    }

    @Override
    public String getDetalles() {
        return "Cliente: " + nombreCompleto + " (" + tipoSuscripcion + ")";
    }

    // --- GETTERS Y SETTERS ---
    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public LocalDate getFechaUltimoPago() {
        return fechaUltimoPago;
    }

    public void setFechaUltimoPago(LocalDate fechaUltimoPago) {
        this.fechaUltimoPago = fechaUltimoPago;
    }
}