/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal2014;

import Din.NodoBin;

/**
 *
 * @author german
 */
public class Arbol {

    private NodoBin raiz;

    public Arbol() {
        raiz = null;
    }

    private NodoBin obtener(NodoBin nodo, int elem) {
        NodoBin nodoObt = null;
        if (nodo != null) {
            if (nodo.getElemento() == elem) {
                nodoObt = nodo;
            } else {
                nodoObt = obtener(nodo.getIzq(), elem);
                if (nodoObt == null) {
                    nodoObt = obtener(nodo.getDer(), elem);
                }
            }
        }
        return nodoObt;
    }

    public boolean insertar(int elem, int padre, char posicion) {
        boolean exito = true;
        NodoBin nuevo = new NodoBin(elem);
        if (this.raiz == null) {
            this.raiz = nuevo;
        } else {
            NodoBin nodoP = obtener(this.raiz, padre);
            if (nodoP != null) {
                if (posicion == 'D' && nodoP.getDer() == null) {
                    nodoP.setDer(nuevo);
                } else {
                    if (posicion == 'I' && nodoP.getIzq() == null) {
                        nodoP.setIzq(nuevo);
                    } else {
                        exito = false;
                    }
                }
            } else {
                exito = false;
            }
        }
        return exito;
    }

    public boolean esVacio() {
        return (this.raiz == null);
    }

    public int padre(int elem) {
        return buscarPadre(raiz, elem);
    }

    private int buscarPadre(NodoBin nodo, int elem) {
        int padre;
        if (nodo != null) {
            if (nodo.getIzq().getElemento() == elem) {
                padre = nodo.getElemento();
            } else {
                padre = buscarPadre(nodo.getIzq(), elem);
                if (padre == 0 && nodo.getDer().getElemento() == elem) {
                    padre = nodo.getElemento();
                } else {
                    padre = buscarPadre(nodo.getDer(), elem);
                }
            }
        } else {
            padre = Integer.MAX_VALUE;
        }
        return padre;
    }

    public int padre2(int elem) {
        int padre = Integer.MAX_VALUE;
        boolean exito = true, exito2 = true;
        NodoBin nodo = raiz;
        while (exito) {
            if (nodo.getDer().getElemento() == elem) {
                padre = nodo.getElemento();
                exito = false;
                exito2 = false;
            } else {
                if (nodo.getDer() != null) {
                    nodo = nodo.getDer();
                } else {
                    exito = false;
                }
            }
        }
        while (exito2) {
            if (nodo.getIzq().getElemento() == elem) {
                padre = nodo.getElemento();
                exito2 = false;
            } else {
                if (nodo.getIzq() != null) {
                    nodo = nodo.getIzq();
                } else {
                    exito2 = false;
                }
            }
        }
        return padre;
    }

    public int altura() {
        return calAlt(raiz);
    }

    private int calAlt(NodoBin nodo) {
        int alt1 = -1, alt2 = -1;
        if (nodo.getIzq() != null) {
            alt1 = calAlt(nodo.getIzq()) + 1;
        }
        if (nodo.getDer() != null) {
            alt2 = calAlt(nodo.getDer()) + 1;
        }
        if (alt1 < alt2) {
            alt1 = alt2;
        }
        return alt1;
    }

    private int calAlt2(NodoBin nodo, int nivel) {
        int alt, alt1;
        if (nodo.getIzq() != null) {
            alt = calAlt2(nodo.getDer(), nivel + 1);
        } else {
            alt = nivel;
        }
        if (nodo.getDer() != null) {
            alt1 = calAlt2(nodo.getIzq(), nivel + 1);
        } else {
            alt1 = nivel;
        }
        if (alt < alt1) {
            alt = alt1;
        }
        return alt;
    }

    private int buscar(int elem, NodoBin nodo, int nivel) {
        int auxN = -1;
        if (nodo != null) {
            if (nodo.getElemento() != elem) {
                auxN = buscar(elem, nodo.getIzq(), nivel + 1);
                if (auxN == -1) {
                    auxN = buscar(elem, nodo.getDer(), nivel + 1);
                }
            } else {
                auxN = nivel;
            }
        }
        return auxN;
    }

    public int nivel(int elem) {
        NodoBin nodo = raiz;
        int nivel = 0;
        nivel = buscar(elem, nodo, nivel);
        return nivel;
    }

    public void vaciar() {
        raiz = null;
    }

    public String toString() {
        String s;
        if (this.raiz != null) {
            s = toStringAux(raiz);
        } else {
            s = "null";
        }
        return s;
    }

    private String toStringAux(NodoBin nodo) {
        String s = "" + nodo.getElemento();
        if (nodo.getIzq() != null) {
            s += " HI " + nodo.getIzq().getElemento();
        } else {
            s += " HI null ";
        }
        if (nodo.getDer() != null) {
            s += " HD " + nodo.getDer().getElemento()+"\n"
                    + "";
        } else {
            s += " HD null \n"
                    + "";
        }
        if (nodo.getIzq() != null) {
            s += toStringAux(nodo.getIzq());
        }
        if (nodo.getDer() != null) {
            s += toStringAux(nodo.getDer());
        }

        return s;
    }
    public Arbol clonInvertido(){
        Arbol invertido=new Arbol();
        NodoBin aux=new NodoBin(this.raiz.getElemento());
        invertido.raiz=aux;
        invertir(this.raiz,aux);
        return invertido;
    }
    private void invertir(NodoBin nodo,NodoBin inv){
        NodoBin nuevo;
        if(nodo.getIzq()!=null){
            nuevo=new NodoBin(nodo.getIzq().getElemento());
            inv.setDer(nuevo);
            invertir(nodo.getIzq(),nuevo);
        }
        if(nodo.getDer()!=null){
            nuevo=new NodoBin(nodo.getDer().getElemento());
            inv.setIzq(nuevo);
            invertir(nodo.getDer(),nuevo);
        }
    }
}
