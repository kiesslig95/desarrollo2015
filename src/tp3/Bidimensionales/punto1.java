/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.Bidimensionales;

import utiles.TecladoIn;

/**
 *
 * @author german
 */
public class punto1 {

    public static void mostrar(int[][] a) {
        int i, j;
        for (i = 0; (i < a.length); i++) {
            for (j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean cuadrado(int[][] a) {
        boolean cuadrado;
        cuadrado = (a.length == a[0].length);
        return cuadrado;
    }

    public static boolean triangSup(int[][] a) {
        int i, j;
        boolean encontrado;
        //preg prque no puedo llamar a cuadrado
        encontrado = false;
        i = 1;
        while (!encontrado && i < a.length) {
            j = 0;
            // preg si hace falta poner el [0]
            while (!encontrado && j < a[0].length) {
                if (i > j && i != j && a[i][j] != 0) {
                    encontrado = true;
                }
                j++;
            }
            i++;
        }
        return !encontrado;
    }

    public static boolean diagonal(int[][] a) {
        int i, j;
        boolean encontrado = false;
        i = 0;
        while (!encontrado && i < a.length) {
            j = 0;
            while (!encontrado && j < a.length) {
                if (i < j && i != j && a[i][j] != 0) {
                    encontrado = true;
                }
                j++;
            }
            i++;
        }
        return !encontrado;
    }

    public static int[][] suma(int[][] a, int[][] b) {
        int[][] suma;
        int i, j, longF, longC;
        longF = a.length;
        longC = a[0].length;
        suma = new int[longF][longC];
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];

            }

        }
        return suma;
    }

    public static int[][] escalar(int[][] a, int k) {
        int i, j;
        int[][] e;
        e = new int[a.length][a[0].length];
        for (i = 0; i < a[0].length; i++) {
            for (j = 0; j < a.length; j++) {
                e[i][j] = k * a[i][j];
            }
        }
        return e;
    }

    public static int[][] transponer(int[][] a) {
        int i, j, suma;
        int[][] t;
        t = new int[a[0].length][a.length];
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                t[i][j] = a[j][i];
            }
        }
        return t;
    }

    public static int sumaFila(int[][] a, int fila) {
        int j, suma;
        suma = 0;
        for (j = 0; j < a.length; j++) {
            suma = suma + a[fila][j];
        }
        return suma;
    }

    public static int sumaCol(int[][] a, int col) {
        int i, suma;
        suma = 0;
        for (i = 0; i < a[0].length; i++) {
            suma = suma + a[i][col];
        }
        return suma;
    }

    public static int[][] multiplicacion(int[][] a, int[][] b) {
        int[][] m;
        int mult, i, j, l, suma, longB, longA;
        longA = a[0].length;
        longB = b.length;
        m = new int[a.length][b[0].length];
        if (longA == longB) {
            for (i = 0; i < a.length; i++) {
                for (l = 0; l < longA; l++) {
                    suma = 0;
                    for (j = 0; j < b[0].length; j++) {
                        mult = a[i][j] * b[j][i];
                        suma = suma + mult;
                    }
                }
            }
        }
        return m;
    }

    public static int[][] creacion() {
        int filas, col, i, j;
        int[][] B;
        System.out.println("Ingrese el numero de filas que tiene la matriz");
        filas = TecladoIn.readLineInt();
        System.out.println("Ingrese el numero de columnas de su matriz");
        col = TecladoIn.readLineInt();
        B = new int[filas][col];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("ingrese el elemento de la fila: " + i + " y columna: " + j);
                B[i][j] = TecladoIn.readLineInt();
            }
        }
        return B;
    }

    public static void opcion(char x, int[][] A) {
        int j, i, filas, col, k, sumF, sumC, longA, longB;
        int[][] B;
        int[][] res;
        switch (x) {
            case 'a':
                mostrar(A);
                break;
            case 'b':
                System.out.println("La matriz ingresada es cuadrado: " + cuadrado(A));
                break;
            case 'c':
                System.out.println("La matrix ingresada es triangular Superior : " + triangSup(A));
                break;
            case 'd':
                System.out.println("La matriz ingresada es diagonal: " + diagonal(A));
                break;
            case 'e':
                B = creacion();
                if (cuadrado(B)) {
                    System.out.print("La matriz resultante de la suma es ");
                    mostrar(suma(A, B));
                } else {
                    System.out.println("no es cuadrada");
                }
                break;
            case 'f':
                System.out.println("Ingrese el escalar a multimplicar");
                k = TecladoIn.readLineInt();
                escalar(A, k);
                break;
            case 'g':
                mostrar(transponer(A));
                break;
            case 'h':
                System.out.println("Ingrese en que fila quiere sumar sus elementos");
                sumF = TecladoIn.readInt();
                System.out.println("la suma de los elementos es " + sumaFila(A, sumF));
                break;
            case 'i':
                System.out.println("Ingrese en que fila quiere sumar sus elementos");
                sumC = TecladoIn.readInt();
                System.out.println("la suma de los elementos es " + sumaCol(A, sumC));
                break;
            case 'j':
                B = creacion();
                longA = A[0].length;
                longB = B.length;
                if (longA == longB) {
                    mostrar(multiplicacion(A, B));
                } else {
                    System.out.println("El numero de comlumnas de la primer matriz es diferentes al numero de filas de la segunda matriz ");
                }
                break;
            case 'q':
                System.out.println("Gracias por utilizar este algoritmo");
                break;
            default:
                System.out.println("la opcion ingresada no es valida");
        }
    }

    public static void main(String[] args) {
        /*este algoritmo permite trabajar con matrices para ....
         */
        char a, b, c, d, e, f, g, h, i, j, q, opcion;
        int filas, colum, ii, jj;
        int[][] A;
        int[][] B;
        A = creacion();
        do {
            System.out.println("Eleja las que desea hacer con la matriz ingresda \n"
                    + "a : mostrar matriz \n"
                    + "b : ver si es de orden cuadrado (n x n) \n"
                    + "c : ver si es triangular superior \n"
                    + "d : ver si es diagonal \n"
                    + "e : sumar dos matrices \n"
                    + "f : hacer producto escalar \n"
                    + "g : transponer matriz a^t \n"
                    + "h : sumar elementos de una fila \n"
                    + "i : sumar elementos de una columna \n"
                    + "j : multimplicar dos matrices \n"
                    + "q : si desea terminar");
            opcion = TecladoIn.readLineNonwhiteChar();
            opcion(opcion, A);
        } while (opcion != 'q');
    }

}
