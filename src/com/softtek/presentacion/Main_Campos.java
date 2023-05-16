package com.softtek.presentacion;

import com.softtek.modelo.campos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main_Campos {
    public static void main(String[] args) {

        //Declaracion de objeto.
        campos resultado = new campos();

        System.out.println("El valor de X es: " + resultado.muestra());
        System.out.println("Despues de incrementar X, su valor es: " + resultado.incrementa());


        //Declaracion de objeto e inicializado.
        campos resultado1 = new campos(5);

        System.out.println("El valor de X es: " + resultado1.muestra());
        System.out.println("Despues de incrementar X, su valor es: " + resultado1.incrementa());



    }
}