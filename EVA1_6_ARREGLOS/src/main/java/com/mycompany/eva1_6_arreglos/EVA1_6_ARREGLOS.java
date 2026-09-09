/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_arreglos;

/**
 *
 * @author chanc
 */
public class EVA1_6_ARREGLOS {

    public static void main(String[] args) {

        int[] datos = new int[100];

        System.out.println(datos);

        for (int i = 0; i < datos.length; i++) {
            datos[i] = -(int) (Math.random() * 100);
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
    }
}