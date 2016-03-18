/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal2014;

/**
 *
 * @author german
 */
public class pnto1_2 {
    /*
    1. ARREGLOS. Desarrolle un algoritmo eficiente para verificar si dos arreglos pasados por
parámetro son iguales.
   
    */
    public static boolean iguales(int []a,int [] b){
        boolean igual=true;
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                if(a[i]!=b[i]){
                    igual=false;
                }
            }
        }else{
            igual=false;
        }
        return igual;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
        int []b={1,2,3,4,5,6,7};
        System.out.println(iguales(a,b));
    }
}
