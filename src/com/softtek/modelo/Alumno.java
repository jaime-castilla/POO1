package com.softtek.modelo;

public class Alumno {

    //Atributos
    private String nombreCompleto;
    private double parciales[];

    //Constructor lleno.
    public Alumno(String nombreCompleto, int parciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[parciales];
    }
    //Constructor vacio.
    public Alumno() {

    }


    //Metodos ???????????????????????????????.
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public double[] getParciales() {
        return parciales;
    }
    public void setParciales(double[] parciales) {
        this.parciales = parciales;
    }

    //Metodos.
    public double promedio() {
        double suma = 0;
        for (int i = 0; i < parciales.length; i++) {
            suma += parciales[i];
        }
        return suma / parciales.length;
    }

    public String mostrarCalificaciones() {
        String calificaciones = "";
        for (int i = 0; i < parciales.length; i++) {
            calificaciones += parciales[i] + ", ";
        }
        return calificaciones;
    }

    public void notafinal(double nota, int posicionParcial) {

        parciales[posicionParcial] = nota;
        }



}
