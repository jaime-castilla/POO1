package com.softtek.modelo;

public class Areas {

    //Metodos.
    public double areaCirculo(double radio) {

        return Math.PI * radio * radio;
    }
    public int areaRectangulo( int base, int altura) {

        return base * altura;
    }

    //Constructores.
    //Constructor vacio (solo el vacio porque la clase Areas no tiene atributos, el lleno es solo cuando tiene atributos la clase.
    public Areas() {

    }

}
