/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_7;

import utiles.TecladoIn;

/**
 *
 * @author german
 */
public class punto6b {

    //b) Determinar la cantidad de veces que aparece un carácter dado en la secuencia
    public static int c(int cant, int n) {
        int m;
        System.out.println("ingrese un numero entero positivo");
        m = TecladoIn.readInt();
        if (m != 0) {
            if (m == n) {
                cant = cant + 1;
                cant = c(cant, n);
            } else {
                cant = c(cant, n);
            }
        }
        return cant;
    }
    public static void main(String[] args) {
        int cant,n;
        cant=0;
        n=4;
        System.out.println(n+" se repite "+ c(cant,n));
    }
}
