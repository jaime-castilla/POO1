package com.softtek.modelo;

import java.sql.SQLOutput;
import java.util.Random;

public class Dado {

    //Atributos
    private Random aleatorio = new Random();
    private int puntos;

    //Contructor vacio.
    public Dado(){

    }
    //Contructor lleno.
    public Dado(int puntos){
        this.puntos = puntos;
    }

    //Metodos.
    public int lanzarDado(){

        puntos = aleatorio.nextInt(6) + 1;
        return puntos;
    }

    public String dibujarDado(){

        String cadena = "";

        if(puntos == 1){
            System.out.println("\n * \n");
        }
        else if(puntos == 2){
            System.out.println("\n * \n * \n");
        }
        else if(puntos == 3){
            System.out.println("\n * \n * \n * \n");
        }
        else if(puntos == 4){
            System.out.println("\n *  * \n *  * \n");
        }
        else if(puntos == 5){
            System.out.println("\n *  * \n  * \n *  * \n");
        }
        else if(puntos == 6){
            System.out.println("\n *  *  * \n *  *  * \n");
        }
        return cadena;

    }

}
