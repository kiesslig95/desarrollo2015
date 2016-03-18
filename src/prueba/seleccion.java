/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author german
 */
public class seleccion {

    public static void seleccion(int[] a) {
        /*
         busca el min elemento dentro del arreglo y luego lo ubica en i que seria su 
         posicion correrta hasta quedar ordenado O(n^2)
         */
        int i, j, aux, min;
        for (i = 0; i < a.length; i++) {
            min = i;
            for (j = i; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            aux = a[i];
            a[i] = a[min];
            a[min] = aux;
        }
    }

    public static void burbuja(int[] a) {
        /*
         en termino de burbujas eleva aquellas que sean de mayor tamaño
         */
        int i, j, aux;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1-i; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }

    }

    public static void insercion(int[] a) {
        /*
         se genera un sopuesto conjunto ordenado , en el que se van ingresando elemento del arreglo y ordendo esto
         va pasando dentro del arreglo
         */
        int i, j, aux, temp;
        for (i = 1; i < a.length; i++) {
            temp = a[i];
            j = i;
            while (j > 0 && temp < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }

            a[j] = temp;
        }
    }

    public static void burbujaM(int[] a) {
        int i, j, aux;
        boolean ord = true;
        i = 0;
        while (ord) {
            ord = false;
            for (j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                    ord = true;
                }
            }
            i++;
        }
    }

    public static int busquedaB(int[] a, int n) {
        int pos, i, j, medio;
        pos = -1;
        i = 0;
        j = a.length - 1;
        while (i < j) {
            medio = (i + j) / 2;
            if (a[medio] == n) {
                pos = medio;
                i = j + 1;
            } else {
                if (a[medio] > n) {
                    j= medio + 1;
                } else {
                    i = medio - 1;
                }
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] a = {7, 5, 3, 8, 9, 2, 0, 4, 1};
        int pos, n = 3;
        burbuja(a);
        pos = busquedaB(a, n);
        for (int i = 0; i <a.length; i++) {
           System.out.print(a[i]);
        }
        if (pos == -1) {
            System.out.println("no esta");
        } else {
            System.out.println(a[pos]);
        }
    }
}
