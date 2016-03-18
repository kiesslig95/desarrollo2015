/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro;

/**
 *
 * @author german
 */
public class heap {

    public static int heapMax(int[] a, int l ,int i) {
        int j, aux,aux2;
        aux2=i;
        j = i * 2 - 1;
        if (j <= l) {
            if (a[i-1] < a[j]) {
                aux = a[i -1];
                a[i -1] = a[j];
                a[j] = aux;
                aux2=-1;
            }
        }
        j = i * 2;
        if (j <= l) {
            if (a[i - 1] < a[j]) {
                aux = a[i - 1];
                a[i - 1] = a[j];
                a[j] = aux;
                aux2=-1;
            }
        }
        if (aux2!= i){
            i=0;
        }
        return i;
    }

    public static void heapOrd(int[] a, int l) {
        int aux, i;
        i = 0;
        aux = a[i];
        a[i] = a[l];
        a[l] = aux;
    }

    public static void heapSort(int[] a, int l) {
        if (l > 0) {
            for (int k = 1; k < l; k++) {
                k=heapMax(a, l,k);
            }
            heapOrd(a, l);
            heapSort(a, l - 1);
        }

    }

    public static void mostrar(int[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 1, 5, 23, 12, 14, 7};
        int l, i;
        i = 0;
        l = a.length - 1;
        heapSort(a, l);
        mostrar(a);

    }
}
