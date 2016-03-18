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
public class Fpunto1 {
    /*
    1. ORDENAMIENTO Y EFICIENCIA. Dado el siguiente arreglo: 5, 7, 1 , 6, 3, 4 ordénelo paso a paso de mayor
a menor utilizando el algoritmo de burbuja mejorado. Implemente dicho algoritmo y Especifique cómo
determina la eficiencia.
    */
    public static void burbujaM(int []a){
        int i,j,n,aux;
        boolean seguir;
        i=0;
        n=a.length-1;
        seguir=true;
        while(seguir){
            seguir=false;
            for(j=0;j<n-i;j++){
                if(a[j+1]<a[j]){
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                    seguir=true;
                }
            }
            i++;
        }
    }
    
    public static void main(String[] args) {
        int []a={5, 7, 1 , 6, 3, 4};
        burbujaM(a);
        int i;
        for(i=0;i<=a.length-1;i++){
            System.out.print(a[i]);
        }
    }
}
