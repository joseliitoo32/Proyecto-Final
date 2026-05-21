package model;

import java.util.ArrayList;
import java.util.List;

public class RutinaPecho implements Rutina {
    private String nombre;
    private List<Ejercicio> ejercicios;

    public RutinaPecho(String nombre) {
        this.nombre = nombre;
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ej) {
        this.ejercicios.add(ej);
    }

    @Override
    public void realizarEjercicio(Ejercicio ejercicio) {
        System.out.println("Realizando ejercicio de Pecho: " + ejercicio.getNombre());
    }

    // --- GETTERS Y SETTERS ---
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }
}