package model;

import java.util.ArrayList;
import java.util.List;

public class RutinaEspalda implements Rutina {
    private String nombre;
    private List<Ejercicio> ejercicios;

    public RutinaEspalda(String nombre) {
        this.nombre = nombre;
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ej) {
        this.ejercicios.add(ej);
    }

    @Override
    public void realizarEjercicio(Ejercicio ejercicio) {
        System.out.println("Realizando ejercicio de Espalda: " + ejercicio.getNombre());
    }
}