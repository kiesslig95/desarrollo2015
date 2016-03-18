/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_7;
import utiles.TecladoIn;
/**
 *
 * @author german
 */
public class punto6a {
    /*6. Dada una secuencia de caracteres (finalizada en “.”) ingresada por teclado, escribir planteos
     recursivos, desarrollar sus correspondientes métodos y realizar la traza de cada inciso:
     a) Mostrar en orden inverso todos los caracteres de la secuencia distintos a un caracter dado.
     */
    public static String i(String vacio,char c){
        char b;
        System.out.println("ingrese caracter");
        b=TecladoIn.readLineNonwhiteChar();
        if (b!='.'){
            if(b!=c){
            vacio= i(vacio,c)+b;
            }else{
                vacio=i(vacio,c);
            }
        }
        return vacio;
    }
    public static void main(String[] args) {
        String vacio="";
        char c;
        c='c';
        System.out.println(i(vacio,c));
    }
}
