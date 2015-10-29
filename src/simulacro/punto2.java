/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro;

import utiles.TecladoIn;
import java.util.Random;

/**
 *
 * @author german
 */
public class punto2 {

    public static char[][] matris1() {
        char[][] a;
        a = new char[2][2];
        a[0][0] = 'a';
        a[0][1] = 'b';
        a[1][0] = 'b';
        a[1][1] = 'e';
        return a;
    }

    public static char[][] matris2() {
        char[][] a;
        a = new char[3][3];
        a[0][0] = 'a';
        a[0][1] = 'b';
        a[0][2] = 'c';
        a[1][0] = 'd';
        a[1][1] = 'e';
        a[1][2] = 'f';
        a[2][0] = 'g';
        a[2][1] = 'h';
        a[2][0] = 'i';

        return a;
    }

    public static char[][] cargaRandom(int largo, char[][] a) {
        int i, j, x;
        char y;
        for (i = 0; i < largo; i++) {
            for (j = 0; j < largo; j++) {
                x = (int) (Math.random() * 60 + 70);
                System.out.println(x);
                y = (char) x;
                a[i][j] = y;
            }
        }
        return a;
    }

    public static char[][] matris3() {
        char[][] a;
        char[][] b;
        int largo = 4;
        a = new char[4][4];
        b = cargaRandom(largo, a);
        return b;
    }

    public static char[][] matris4() {
        char[][] a;
        int i, j, largo, x;
        largo = 5;
        char y;
        Random r = new Random();
        a = new char[5][5];
        for (i = 0; i < largo; i++) {
            for (j = 0; j < largo; j++) {
                x = r.nextInt(25) + 65;
                System.out.println(x);
                y = (char) x;
                a[i][j] = y;
            }
        }
        return a;
    }

    public static boolean diagonal(char[][] m) {
        int i, j;
        boolean dif = false;
        i = m.length - 1;
        j = 0;
        while (i > 0 && !dif) {
            if (m[i][j] != m[i - 1][j + 1]) {
                dif = true;
            }
            i--;
            j++;
        }
        return !dif;
    }

    public static void mostrar(char[][] a) {
        int i, j;
        for (i = 0; (i < a.length); i++) {
            for (j = 0; j < a[0].length; j++) {
                System.out.print("| " + a[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        char[][] m;
        m = matris4();
        System.out.println("matriz ");
        mostrar(m);
        System.out.println("la matriz es " + diagonal(m));
    }
}
