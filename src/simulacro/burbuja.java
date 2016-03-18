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
public class burbuja {
    /*
    el funcionamiento de burbuja para ordenar crecientemente es hacer flotar metaforcamente el valor mas grande
    */
    public static void burbuja(int []a){
       int i,j,aux;
        for ( i = 0; i <= a.length-2; i++) {
            for(j=0;j<=a.length-2-i;j++){
                if(a[j]>a[j+1]){
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }
    }
     public static void main(String[] args) {
        int []a={5, 7, 1 , 6, 3, 4};
        burbuja(a);
        int i;
        for(i=0;i<=a.length-1;i++){
            System.out.print(a[i]);
        }
    }
}
