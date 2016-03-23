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
public class Pila_1 {

    //atributos
    private Nodo tope;

    //constructores
    public Pila_1() {
        this.tope = null;
    }

    //observadores
    public boolean estaVacia() {
        return tope == null;
    }

    @Override
    public String toString() {
        String s = "";
        if (this.tope == null) {
            s = "esta vacia";
        } else {
            s = "[";
            Nodo aux = tope;
            while (aux != null) {
                s = s + " " + aux.getElemento();
                aux = aux.getEnlace();
                if (aux == null) {
                    s += "]";
                }
            }
        }
        return s;
    }

    public boolean apilar(int elemento) {
        boolean confirmar = true;
        Nodo nuevoNodo = new Nodo(elemento, this.tope);
        this.tope = nuevoNodo;
        return confirmar;
    }

    public boolean desapilar() {
        boolean confirm;
        if (estaVacia()) {
            confirm = false;
        } else {
            this.tope = tope.getEnlace();
            confirm = true;
        }
        return confirm;
    }

    public int obtenerTope() {
        int elem;
        if (tope == null) {
            elem = Integer.MAX_VALUE;
        } else {
            elem = tope.getElemento();
        }
        return elem;
    }

    public void vaciar() {
        tope = null;
    }

    //propios de tipo
    public Pila_1 clonar() {
        Pila_1 clon = new Pila_1();
        Nodo aux = this.tope;
        if (aux != null) {
            Nodo nuevo = new Nodo(aux.getElemento(), null);
            clon.tope = nuevo;
            Nodo aux2 = clon.tope;
            while (aux.getEnlace() != null) {
                aux = aux.getEnlace();
                nuevo = new Nodo(aux.getElemento(), null);
                aux2.setEnlace(nuevo);
                aux2 = aux2.getEnlace();
            }
        }
        return clon;
    }

}
