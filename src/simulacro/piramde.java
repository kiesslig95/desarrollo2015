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
public class piramde {
    public static void main(String[] args) {
        int i,j,k,l;
        j=4;
        for ( i=j ; i >=1; i--) {
            if (i%2==0){
                for (k = i; k >=1;k --) {
                    System.out.print(k);
                }
            }else{
                for (l = 1; l<=i; l++) {
                    System.out.print(l);
                }
            }
            System.out.println("");
        }
    }
}
