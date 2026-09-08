/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval_5_paso_parametros;

/**
 *
 * @author chanc
 */
public class EVAL_5_PASO_PARAMETROS {

  public static void main(String[] args) {

        int i = 5;

        System.out.println("Valor de i = " + i);

        incrementar(i);

        System.out.println("Valor de i (despues de incrementar) = " + i);
    }

    public static void incrementar(int valor) {
        valor++;
    }
}