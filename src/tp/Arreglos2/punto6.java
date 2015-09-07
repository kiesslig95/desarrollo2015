package Tp.Arreglos2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ,
 */
public class punto6 {

    public static void selectionSort(String[] args) {
        int[] a = {5, 8, 9, 12, 34};
        int i, j, min;
        j = 0;
        for (i = 0; j <= a.length - 2; i++) {
            min = i;
            for (j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            
        }
    }

}
