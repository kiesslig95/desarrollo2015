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
public class Fpunto2 {
    /*
     2. RECURSIVIDAD: Implementar en Java un método recursivo eficiente verificarOrden, que reciba un arreglo de
     enteros y verifique si están ordenados en forma decreciente. Realice la traza. Ejemplo, para (4,3,5,7,9) debe
     devolver falso.
     */

    public static boolean verifOrd(int[] a, int i) {
        boolean ord;

        if (i < a.length - 1) {
            if (a[i + 1] <= a[i]) {
                ord = verifOrd(a, i + 1);
            } else {
                ord = false;
            }
        }else{
            ord=true;
        }

        return ord;
    }

    public static void main(String[] args) {
        int[] a = {9,4,3,2,1,0};
        int i = 0;
        System.out.println(verifOrd(a, i));
    }
}
