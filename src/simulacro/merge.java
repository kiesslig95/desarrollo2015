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
public class merge {

    public static void mergesort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(A, izq, m);
            mergesort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; 
        for (i = izq; i <= der; i++) 
        {
            B[i] = A[i];
        }

        i = izq;
        j = m + 1;
        k = izq;
        while (i <= m && j <= der) 
        {
            if (B[i] <= B[j]) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }
        while (i <= m)
        {
            A[k++] = B[i++]; 
        }
    }
    public static void mostrar(int[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int []a={3,12,1,2,1,5,9};
        int izq,der;
        izq=0;
        der=a.length-1;
        mergesort(a,izq,der);
        mostrar(a);
    }
}
