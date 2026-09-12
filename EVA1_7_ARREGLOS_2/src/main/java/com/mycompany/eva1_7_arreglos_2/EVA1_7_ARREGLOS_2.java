/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_arreglos_2;

/**
 *
 * @author chanc
 */
public class EVA1_7_ARREGLOS_2 {

    public static void main(String[] args) {

        int[] original = new int[10];

        System.out.println(original);

        for (int i = 0; i < original.length; i++) { // LLENAR CON DATOS ALEATORIOS
            original[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < original.length; i++) { // IMPRIMIR
            System.out.print("[" + original[i] + "]");
        }

        System.out.println("");

        // CAMBIAR EL TAMAÑO (NO SE PUEDE)
        original = new int[5];

        System.out.println(original);

        for (int i = 0; i < original.length; i++) { // IMPRIMIR ARREGLO "MODIFICADO"
            System.out.print("[" + original[i] + "]");
        }
    }
}