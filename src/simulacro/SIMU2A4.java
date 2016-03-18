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
public class SIMU2A4 {
    public static String i(String a,String inv,int j){
        char c;
        int pos;
        c=a.charAt(j);
        pos=a.length()-1;
        if(pos>j){
            inv=c+i(a,inv,j+1)+c;
        }else{
            inv=c+inv + c;
        }
        
        return inv;
    
    }
    public static void main(String[] args) {
        String inv="";
        String a="casa";
        int i;
        
        i=0;
        System.out.println(i(a,inv,i));
    }
    
}
