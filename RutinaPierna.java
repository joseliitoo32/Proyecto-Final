package model;

import java.util.ArrayList;
import java.util.List;

public class RutinaPierna implements Rutina {
    private String nombre;
    private List<Ejercicio> ejercicios;

    public RutinaPierna(String nombre) {
        this.nombre = nombre;
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ej) {
        this.ejercicios.add(ej);
    }

    @Override
    public void realizarEjercicio(Ejercicio ejercicio) {
        System.out.println("Realizando ejercicio de Pierna: " + ejercicio.getNombre());
    }
}