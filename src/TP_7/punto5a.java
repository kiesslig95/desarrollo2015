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
public class punto5a {
    /*Dada una secuencia S de números enteros positivos (finalizada en 0, que no se considera parte de
     *la secuencia) ingresados por teclado, escribir planteos recursivos, sus correspondientes métodos,
     *y realizar la traza para la secuencia 2 5 3 6 12 3 0 en los siguientes incisos:
     *a) Calcular cuántos enteros múltiplos de 4 hay en la secuencia.
     */

    public static int m(int n, int cont) {
        if (n != 0) {
            if (n % 4 == 0) {
                cont++;
                System.out.println("ingrese un numero entero positivo");
                n = TecladoIn.readInt();
                cont = m(n, cont);
            } else {
                System.out.println("ingrese un numero entero positivo");
                n = TecladoIn.readInt();
                cont = m(n, cont);
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        int cont = 0, n;
        System.out.println("ingrese un numero entero positivo");
        n = TecladoIn.readInt();
        System.out.println(m(n, cont));

    }
}
