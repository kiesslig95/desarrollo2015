/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author german
 */
public class Nodo {
    //atributos
    private int elemento;
    private Nodo enlace;
 
    
    //constructores
    public Nodo(int elem,Nodo enlace){
        this.elemento=elem;
        this.enlace=enlace;
    }
    
    public int getElemento(){
        return elemento;
    }
    public void setElemento(int elemento){
        this.elemento=elemento;
    }
    public Nodo getEnlace(){
        return enlace;
    }
    public void setEnlace(Nodo enlace){
        this.enlace=enlace;
    }
    
}
