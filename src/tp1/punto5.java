package tp1;

import utiles.TecladoIn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author german
 */
public class punto5 {

    public static boolean verificacion(char elemento, String conjunto) {
        int cont = 0, largoConj;
        boolean okey = true;
        char caracterConj;
        largoConj = conjunto.length();
        while (largoConj > cont) {
            caracterConj = conjunto.charAt(cont);
            if (elemento == caracterConj) {
                okey = false;
            }
            cont++;
        }
        return okey;
    }

    public static String union(String conjuntoA, String conjuntoB) {
        String conjuntoUnion;
        char elemento;
        int cont = 0, largoConj;
        conjuntoUnion = conjuntoA;
        largoConj = conjuntoUnion.length();
        while (largoConj > cont) {
            elemento = conjuntoB.charAt(cont);
            if (verificacion(elemento, conjuntoUnion)) {
                conjuntoUnion = conjuntoUnion + elemento;
            }
            cont++;
        }
        return conjuntoUnion;
    }

    public static String interseccion(String conjuntoA, String conjuntoB) {
        String conjuntoInter;
        char elemento;
        int cont = 0, largoConj;
        conjuntoInter = "";
        largoConj = conjuntoA.length();
        while (largoConj > cont) {
            elemento = conjuntoB.charAt(cont);
            if (!verificacion(elemento, conjuntoA)) {
                conjuntoInter = conjuntoInter + elemento;
            }
            cont++;
        }
        return conjuntoInter;
    }

    public static String diferencia(String conjuntoA, String conjuntoB) {
        String conjDif = "";
        boolean condicion=true;
        int cont , largoConj, cont1 = 0;
        char caracter, elemento;
        largoConj = conjuntoA.length();
        while (cont1 < largoConj) {
            cont=0;
            elemento = conjuntoA.charAt(cont1);
            System.out.println(elemento);
            while (cont < largoConj && condicion) {
                caracter = conjuntoB.charAt(cont);
                System.out.println(caracter + " caracter");
                if (elemento == caracter) {
                    condicion= false;
                }
                cont++;
            }
            
            if (condicion){
                conjDif = conjDif + elemento;
            }
            condicion= true;
            cont1++;
        }
        System.out.println(conjDif + " conjDif");
        return conjDif;
    }

    public static String conjunto(int largo, boolean distincionConj) {
        int cont = 0;
        char elemento;
        String conjunto = "";
        boolean verificador = true;
        //largo ingresa por teclado
        while (cont < largo) {
            if (distincionConj) {
                System.out.print("Ingrese elemento conjunto A");
                elemento = TecladoIn.readNonwhiteChar();
            } else {
                System.out.print("Ingrese elementos conjunto B");
                elemento = TecladoIn.readNonwhiteChar();
            }
            do {
                if (verificacion(elemento, conjunto)) {
                    conjunto = conjunto + elemento;
                    verificador = false;
                } else {
                    System.out.println("El elemento ya pertenece al conjunto, ingrese un nuevo elemento");
                    elemento = TecladoIn.readNonwhiteChar();
                    if(verificacion(elemento,conjunto)){
                        conjunto=conjunto + elemento;
                        verificador = false;
                    }
                }
            } while (verificador);
            cont++;
        }
        return conjunto;

    }

    public static void main(String[] args) {
        int tamañoConj;
        boolean conjA = true, conjB = false;
        //mejor pasar un String
        String conjuntoA, conjuntoB;
        char opcion;
        System.out.println("Ingrese la de que tamaño desea que sean los conjuntos");
        tamañoConj = TecladoIn.readInt();
        conjuntoA = conjunto(tamañoConj, conjA);
        conjuntoB = conjunto(tamañoConj, conjB);
        do {
            System.out.println("Seleccione las operaciones a realizar:\n"
                    + "a : union entre conjuntos. \n"
                    + "b : inteseccion entre conjuntos. \n"
                    + "c : diferencia entre conjuntos. \n"
                    + "d : ingresar nuevos conjuntos. \n"
                    + "q : finalizar");
            opcion = TecladoIn.readNonwhiteChar();
            if (opcion == 'a') {
                System.out.println(union(conjuntoA, conjuntoB));
            }
            if (opcion == 'b') {
                System.out.println(interseccion(conjuntoA, conjuntoB));
            }
            if (opcion == 'c') {
                System.out.println(diferencia(conjuntoA, conjuntoB));
            }
            if (opcion == 'd') {
                System.out.println("Ingrese la de que tamaño desea que sean los conjuntos");
                tamañoConj = TecladoIn.readInt();
                conjuntoA = conjunto(tamañoConj, conjA);
                conjuntoB = conjunto(tamañoConj, conjB);
            }
        } while (opcion != 'q');
    }
}
