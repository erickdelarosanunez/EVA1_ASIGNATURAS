/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_paso_parametros;

/**
 *
 * @author chanc
 */
public class EVA1_5_PASO_PARAMETROS {
 public static void main(String[] args) {

        int i = 5;

        System.out.println(i);
        System.out.println("valor de i = " + i);

        increment(i);

        System.out.println("valor de i (despues de incrementar) = " + i);

        prueba prueba = new prueba();

        System.out.println("valor de prueba = " + prueba.y);

        incrementarob(prueba);

        System.out.println("valor de prueba (despues de incrementar) = " + prueba.y);
    }

    public static void increment(int valor) {
        valor++;
    }

    public static void incrementarob(prueba objeto) {
        objeto.y++;
    }
}

class prueba {
    int y = 5;
}