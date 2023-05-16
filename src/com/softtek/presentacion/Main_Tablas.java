package com.softtek.presentacion;

import com.softtek.modelo.Tablas;
public class Main_Tablas {

    public static void main(String[] args) {

        int numero = 8;

        Tablas resultado = new Tablas(numero);

        System.out.println("Tabla del " + numero);
        System.out.println(resultado.tablasMultiplicar());

    }
}
