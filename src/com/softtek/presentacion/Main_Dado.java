package com.softtek.presentacion;

import com.softtek.modelo.Dado;

public class Main_Dado {

    public static void main(String[] args) {

        Dado dado = new Dado();

        System.out.println(dado.lanzarDado());

        String resultado = dado.dibujarDado();
        System.out.println(resultado);
    }

}
