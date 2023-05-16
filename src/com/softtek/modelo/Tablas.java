package com.softtek.modelo;

public class Tablas {

    private int numero;

    //Método.
    public String tablasMultiplicar() {

        String resultado = "";

        for(int i = 0; i <= 10; i++){

            resultado = resultado + numero + " * " + i + " = " + (numero * i) + "\n";
        }
        return resultado;

    }
    //Constructor vacio.
    public Tablas() {

    }
    //Constructor lleno.
    public Tablas(int numero) {
        this.numero = numero;
    }

}
