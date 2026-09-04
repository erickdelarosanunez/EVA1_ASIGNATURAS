/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval_2_stack;

/**
 *
 * @author chanc
 */
public class EVAL_2_STACK {

    public static void main(String[] args) {
        System.out.println("INICIA main");
        A();
        System.out.println("TERMINA main");
    }

    public static void A() {
        System.out.println("INICIA A()");
        B();
        System.out.println("TERMINA A()");
    }

    public static void B() {
        System.out.println("INICIA B()");
        int i = 5;
        double d = 5.5;
        System.out.println("TERMINA A()");
    }
}