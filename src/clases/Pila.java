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
public class Pila {
    //atributos
    private int [] arreglo;
    private int tam;
    private int tope;
    //constructores
    private Pila(int tope,int tam,int []a){
        this.arreglo=a;
        this.tam=tam;
        this.tope=tope;
    }
    public Pila(){
        tam=10;
        tope=-1;
        arreglo=new int[tam];
    }
    
    //observadores
    public boolean estaVacia(){
        return tope == -1;
    }
    public void leerTodo(){
        if (estaVacia()){
            System.out.println(" pila vacia");
        }else{
            for(int i=0;i<=tope;i++){
                System.out.print(arreglo[i]+" ");
            }
            System.out.println();
        }
        
    }
    public boolean apilar(int elemento){
        boolean confirmar;
        if (tope==tam){
            confirmar=false;
        }else{
            arreglo[tope+1]=elemento;
            tope=tope+1;
            confirmar=true;
            
        }
        return confirmar;
    }
    public boolean desapilar(){
        boolean confirm;
        if(estaVacia()){
            confirm=false;
        }else{
            tope=tope-1;
            confirm=true;
        }
        return confirm;
    }
    public int obtenerTope(){
        return arreglo[tope];
    }
    public void vaciar(){
        tope=-1;
    }
    public Pila clonar(){
        Pila nueva= new Pila();
        
        nueva.arreglo=arreglo.clone();
        nueva.tope=tope;
        return nueva;
    }
    //propios de tipo
    
}
