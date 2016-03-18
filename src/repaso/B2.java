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
public class B2 {
     public static int posicion(String pal,int cont,char car){
        int pos;
          if(cont>=0) {
              if(car != pal.charAt(cont)){
                pos= posicion(pal,cont -1,car);
              }else{
                  pos=cont+1;
              }
          }else{
              pos=-1;
          }
          return pos;
        }
    public static void main(String[] args) {
        // TODO code application logic here
       String pal;
       int cont;
       char car;
       car= 'a';
       pal= "hola como estas?";
       cont=pal.length()-1;
        System.out.println(posicion(pal,cont,car));
    }
    
}
