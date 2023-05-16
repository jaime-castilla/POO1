package com.softtek.presentacion;

import com.softtek.modelo.Areas;

public class Main_Areas {

    public static void main(String[] args) {

        double radio = 3;
        int base = 4;
        int altura = 5;

        Areas resultado = new Areas();

        System.out.println("El area del círculo es: " + resultado.areaCirculo(radio));
        System.out.println("El area del rectángulo es: " + resultado.areaRectangulo(base, altura));

    }
}
