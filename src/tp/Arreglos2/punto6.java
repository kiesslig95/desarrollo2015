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

    public static void main(String[] args) {
        int[] a = {5,12,9,34,8};
        int i, j, min,tmp;
        for (i = 0; i <= a.length -1 ; i++) {
            min = i;
            for (j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
            System.out.println(a[i]);
        }
    }

}
