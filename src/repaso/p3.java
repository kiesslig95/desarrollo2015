/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author german
 */
public class p3 {
    public static double menores(int []a,int cont,int suma){
        double prom;
        if (cont ==a.length){
            prom=suma/cont;
        }else{
            suma=suma+ a[cont];
            prom=menores(a,cont+1,suma);
            if(a[cont]<prom){
                System.out.println( a[cont] +" promedio "+ prom + "");
            }
        }
        return prom;
    }
    public static void main(String[] args) {
        int []a={10,5,4,7,11,1};
        int cont=0;
        int suma=0;
        double x;
        //System.out.println(menores(a,cont,suma));
        x=menores(a,cont,suma);
    }
}
