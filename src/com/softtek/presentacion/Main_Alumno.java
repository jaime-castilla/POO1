package com.softtek.presentacion;

import com.softtek.modelo.Alumno;
public class Main_Alumno {

    public static void main(String[] args) {

        Alumno nota = new Alumno("Pedro Perez", 3);
        nota.notafinal(8,0);
        nota.notafinal(7,1);
        nota.notafinal(6,2);

        System.out.println("El alumno " + nota.getNombreCompleto() + " tiene un promedio de " + nota.promedio());
        System.out.println("Las calificaciones de sus parciasles son: " + nota.mostrarCalificaciones());

    }
}
