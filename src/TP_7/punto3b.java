/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_7;

/**
 *
 * @author german
 */
public class punto3b {

    public static int busDig(int n, int t,int cont) {
        int aux, i;
        i = n % 10;
        aux =cont;
        if (n < t) {
            if (i == t) {
                cont++;
            }
        } else {
            if (i == t) {
                cont++;
            }
            aux = busDig(n / 10, t,cont);
        }
        return aux;
    }

    public static void main(String[] args) {
        int n, t, aux,cont;
        cont =0;
        t = 3;
        n = 1324334;
        aux = busDig(n, t,cont);
        System.out.println(aux);
    }
}
