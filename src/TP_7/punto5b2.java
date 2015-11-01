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
public class punto5b2 {

    public static int max(int n, int m) {

        if (!(n == 0)) {
            if (n > m) {
                m = n;
                System.out.println("ingrese un numero entero positivo");
                n = TecladoIn.readInt();
                m=max(n, m);
            } else {
                System.out.println("ingrese un numero entero positivo");
                n = TecladoIn.readInt();
                m=max(n, m);
            }
        }
        return m;
    }
    public static void main(String[] args) {
        // almacena el maximo numero entero infresado
        int m,n;
        m=0;
        System.out.println("ingrese un numero  entero positivo");
        n=TecladoIn.readInt();
        System.out.println("el maximo es" + max(n,m));
    }

}
