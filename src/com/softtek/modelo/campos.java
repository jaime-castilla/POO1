package com.softtek.modelo;

public class campos {
    //Atributo.
    private int x;

    //Métodos.
     public int muestra() {

         return x;
     }
     public int incrementa(){

         return  ++x;

     }
     //Constructor lleno.
     public campos(int x) {
         this.x = x;
     }
     //Constructor vacio.
     public campos() {

     }
}


