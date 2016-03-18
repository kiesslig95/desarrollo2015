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
public class punto4b {
    public static boolean o(int[]v,int l){
        boolean c;
        if(l>0){
            if(!(v[l]>=v[l-1])){
                c=false;
            }else{
                c=o(v,l-1);
                
            }
        }else{
            c=true;
        }
        return c;
    }
    public static void main(String[]args){
        int []v={1,5,7,8};
        int l;
        l=v.length-1;
        System.out.println(o(v,l));
    }
}
