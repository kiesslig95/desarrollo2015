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
public class seleccionSort {
    public static void seleccion(int []a){
        int i,j,min,aux;
        for ( i = 0; i <=a.length-1; i++) {
            min=i;
            for(j=1+i;j<=a.length-1;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            aux=a[i];
            a[i]=a[min];
            a[min]=aux;
        }
    }
    public static void main(String[] args) {
        int []a={5, 7, 1 , 6, 3, 4};
        seleccion(a);
        int i;
        for(i=0;i<=a.length-1;i++){
            System.out.print(a[i]);
        }
    }
}
