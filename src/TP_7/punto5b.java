/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_7;

/**
 *
 * @author german
 */
public class punto5b {
    //b) Determinar el máximo entero perteneciente a la secuencia.   
    public static int max(String a,int l,int m){
        int aux,i;
        i=a.indexOf(m, l);
        if (l>=0){
            aux=a.(int)substring(m, i);//preguntar
            if(aux>m){
                m=aux;
                m=max(a,l-1,m);
            }else{
                m=max(a,l-1,m);
            }
        }
        return m;
    }
    public static void main(String[] args) {
        String a="2 5 4 6 1 12 3 0";
        int l = a.length()-2;
        int m=0;
        System.out.println(max(a,l,m));

    }
}
