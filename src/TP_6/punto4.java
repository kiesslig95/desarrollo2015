/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_6;

/**
 *
 * @author german
 */
public class punto4 {
    /*reciba como datos
de entrada dos arreglos de enteros ordenados en forma creciente, de dimensiones n y m
respectivamente, y obtenga un tercer arreglo, también ordenado en forma creciente, de
dimensión n+m
    */

    public static int[] suma(int[] a, int[] b) {
        int[] c;
        int i, j, l, k,d;
        boolean cont = true;
        l = a.length + b.length;
        c = new int[l];
        i = 0;
        j = 0;
        k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }

            k++;
        }
        if (i < a.length) {
            for (d = i; d < a.length; d++) {
                c[k] = a[d];
                k++;
            }
        } else {
            for (d = j; d < b.length; d++) {
                c[k]=b[d];
                k++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] A = {3,5, 7, 10, 15};
        int[] B = {5, 6, 7,9,99};
        int[] C;

        C = suma(A, B);

        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
