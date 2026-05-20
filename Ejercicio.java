package model;

public class Ejercicio {
    private String nombre;
    private int series;
    private int repeticiones;
    private double peso;

    public Ejercicio(String nombre, int series, int repeticiones, double peso) {
        this.nombre = nombre;
        this.series = series;
        this.repeticiones = repeticiones;
        this.peso = peso;
    }

    public String getNombre() { return nombre; }
    public int getSeries() { return series; }
    public int getRepeticiones() { return repeticiones; }
    public double getPeso() { return peso; }
}