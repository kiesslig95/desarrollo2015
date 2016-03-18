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
public class punto4a {
    public static boolean e(int []v,int n,int long1){
        int i;
        boolean cont,a; 
        if( long1>=0){
            a=true;
            if(v[long1]==n){
                cont=false;
            }else{
                cont=e(v,n,long1-1);
                if(!cont){
                    a=cont;
                }
            }
        }else{
            a=true;
        }
        return !a;
    }
    public static void main(String[] args) {
        int []v={9, 7, 0, -1, 0, 10};
        int n,long1;
        boolean c;
        n=8;
        long1=v.length-1;
        c=e(v,n,long1);
        System.out.println(c);
        
        for (int i: v)
            System.out.print(" " + i);
    }
    
}
