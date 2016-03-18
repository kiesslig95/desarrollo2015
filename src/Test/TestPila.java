/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import clases.Pila;

/**
 *
 * @author german
 */
public class TestPila {
    public static void main(String[] args) {
        Pila clon;
        Pila verif= new Pila();
        verif.apilar(34);
        verif.apilar(5);
        verif.apilar(100);
        
        System.out.println(verif.estaVacia());
        verif.leerTodo();
        System.out.println(" clon");
        clon= verif.clonar();
        clon.leerTodo();
        verif.apilar(10);
        System.out.println("clon");
        clon.leerTodo();
        System.out.println("original");
        verif.leerTodo();
    }
}
