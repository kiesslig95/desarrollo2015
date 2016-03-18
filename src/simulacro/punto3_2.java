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
public class punto3_2 {
    /*
    3. RECURSIVIDAD. Dado una texto escribir un algoritmo recursivo para determinar la cantidad de
veces que aparece un caracter en el texto. Realice en papel la traza para buscar la letra “e” en el
texto: “este es un ejemplo”.
    */
    public static int caracter(String a,char n,int i){
        int cant;
        if (i<a.length()){
            if(a.charAt(i)==n){
                cant=1+caracter(a,n,i+1);
            }else
                cant=caracter(a,n,i+1);
        }else{
            cant=0;
        }
        return cant;
        
    }
    public static void main(String[] args) {
        String a="este es el ejemploe";
        char n='e';
        int i=0;
        System.out.println("cant = "+ caracter(a,n,i));
    }
}
