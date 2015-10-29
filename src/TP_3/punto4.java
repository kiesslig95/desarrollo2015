package TP_3;

import utiles.TecladoIn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author german
 */
public class punto4 {

    public static void mostrar(int[][] a) {
        int i, j;
        for (i = 0; (i < a.length); i++) {
            for (j = 0; j < a[0].length; j++) {
                System.out.print("| " + a[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static int[][] creacion() {
        int j, i;
        int[][] B;
        B = new int[12][14];
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 14; j++) {
                System.out.println("Ingrese el numero de expedientes del del mes : " + i + 1 + " y años " + 2000 + i);
                B[i][j] = TecladoIn.readLineInt();
            }
        }
        return B;
    }

    public static int sumaCol(int[][] a, int col) {
        int i, suma;
        suma = 0;
        for (i = 0; i < a[0].length; i++) {
            suma = suma + a[i][col];
        }
        return suma;
    }
    public static int sumaTotal(int [][]A){
        int i,j,suma;
        suma=0;
        for (i=0;i<12;i++){
            for(j=0;j<14;j++){
                suma=suma+ A[i][j];
            }
        }
        return suma;
    }

    public static int segunAño(int[][] A, int año) {
        int res;
        res = 15;
        switch (año) {
            case 2000:
                res = 0;
                break;
            case 2001:
                res = 1;
                break;
            case 2002:
                res = 2;
                break;
            case 2003:
                res = 3;
                break;
            case 2004:
                res = 4;
                break;
            case 2005:
                res = 5;
                break;
            case 2006:
                res = 6;
                break;
            case 2007:
                res = 7;
                break;
            case 2008:
                res = 8;
                break;
            case 2009:
                res = 9;
                break;
            case 2010:
                res = 10;
                break;
            case 2011:
                res = 11;
                break;
            case 2012:
                res = 12;
                break;
            case 2013:
                res = 13;
                break;
            case 2014:
                res = 14;
                break;
        }
        return res;
    }

    public static void opcion(char x, int[][] A, int año) {
        int col,res;
        switch (x) {
            case 'a':
                mostrar(A);
                break;
            case 'b':
                col = segunAño(año,A);
                //preguntar que hice 
                System.out.println("La cantidad de expediente del año " + año + " son " + sumaCol(A, col));
                break;
            case 'c':
                break;
            case 'd':
                break;
            case 'e':
                break;
            case 'f':
                break;
            case 'g':
                break;
            case 'h':
                break;
            case 'i':
                break;
            case 'j':
                break;
            case 'q':
                break;
            default:
                System.out.println("la opcion ingresada no es valida");
        }
    }

    public static void main(String[] args) {
        /*algoritmo de almaenaje de expedientes de cada me por un año
         */
        int[][] exped;
        exped = new int[12][14];
        char opcion;

    }

    private static int segunAño(int año, int[][] A) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
