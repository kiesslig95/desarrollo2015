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
public class punto2_2 {
    /*
    2. BUSQUEDA BINARIA. Implemente el método de busqueda binaria que busque una palabra
dentro de un arreglo de String dentro de String . Indique la eficiencia del algoritmo
obteniendo el orden ejecución.
    */
    public static int busquedaBinaria(int []a,int n){
        int i,j,aux,medio,resultado;
        i=0;
        resultado=-1;
        j=a.length-1;
        while(i<j){
            medio=(i+j)/2;
            if(a[medio]== n){
                i=j+1;
                resultado=medio;
            }else{
                if(a[medio]<n){
                    i=medio+1;
                }else{
                    j=medio-1;
                }
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int []a={1,5,6,7,8,9,11,22,33,44};
        int n=33;
        System.out.println(a[busquedaBinaria(a,n)]);
    }
}
