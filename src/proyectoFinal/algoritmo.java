/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal;

import utiles.TecladoIn;

/**
 *
 * @author Carlos Kiessling
 */
public class algoritmo {

    public static String cambio(String recorteTexto) {
        // TODO code application logic here
        String modificacion;
        char caracModif, simple, caracter;
        int contador, longitud;
        System.out.println("Ingrese el caracter que desea cambiar del texto");
        caracter = TecladoIn.readLineNonwhiteChar();
        contador = 0;
        modificacion = "";
        caracModif = '_';
        longitud = recorteTexto.length();
        while (contador < longitud) {
            simple = recorteTexto.charAt(contador);
            if (simple == caracter) {
                simple = caracModif;
            }
            contador++;
            modificacion = modificacion + simple;
        }
        return modificacion;

    }

    public static boolean capicua(String palabra) {
        // TODO code application logic here
        boolean encontrado;
        char caracter1, caracter2;
        int ini, fin;
        encontrado = true;
        ini = 0;
        fin = palabra.length();
        if (fin == 1) {
            encontrado = false;
        }
        fin--;
        while (fin >= ini && encontrado) {
            caracter1 = palabra.charAt(ini);
            caracter2 = palabra.charAt(fin);
            if (caracter1 != caracter2) {
                encontrado = false;
            } else {
                ini++;
                fin--;
            }
        }
        return encontrado;
    }

    public static void segunSeleccion(char opcion, String recorteTexto) {
        int longitud;
        String modificacion;
        switch (opcion) {
            case 'a':
                longitud = recorteTexto.length();
                System.out.println("El texto ingresado tiene un longitud de : " + longitud);
                break;
            case 'b':
                tieneCapicua(recorteTexto);
                break;
            case 'c':
                tieneAdyacente(recorteTexto);
                break;
            case 'd':
                modificacion = cambio(recorteTexto);
                System.out.println("El texto modificado es: " + modificacion);
                break;
            case 'q':
                break;
        }
    }

    public static boolean adyacente(String palabra) {
        // TODO code application logic here
        char caracter1, caracter2;
        boolean encontrado, textoFalso;
        int primer, fin;
        encontrado = true;
        primer = 0;
        textoFalso = true;
        fin = palabra.length() - 1;
        if (fin == 1) {
            textoFalso = false;
        }
        while (encontrado && textoFalso && fin > primer) {
            caracter1 = palabra.charAt(primer);
            caracter2 = palabra.charAt(primer + 1);
            if (caracter1 == 'a' || caracter1 == 'e' || caracter1 == 'i' || caracter1 == 'o' || caracter1 == 'u') {
                if (caracter2 == 'a' || caracter2 == 'e' || caracter2 == 'i' || caracter2 == 'o' || caracter2 == 'u') {
                    encontrado = false;
                }
            }
            primer++;
        }
        encontrado = !encontrado;
        return encontrado;
    }

    public static void tieneCapicua(String recorteTexto) {
        // TODO code application logic here
        int contador, longitud;
        boolean noEncontrado;
        String palabra;
        char caracterPal;
        noEncontrado = true;

        contador = 0;
        palabra = "";

        longitud = recorteTexto.length() - 1;
        do {
            caracterPal = 'a';
            while (caracterPal != ' ' && contador <= longitud) {
                caracterPal = recorteTexto.charAt(contador);
                palabra = palabra + caracterPal;
                contador++;
            }
            palabra = palabra.trim();
            if (capicua(palabra)) {
                System.out.println("El texto ingresado tiene una palabra capicua");
                noEncontrado = false;
            }
            palabra = "";
        } while (contador <= longitud && noEncontrado);
        if (noEncontrado) {
            System.out.println("El texto ingresado no tiene ninguna palabra capicua");

        }

    }

    public static void tieneAdyacente(String recorteTexto) {
        // TODO code application logic here
        int contador, longitud;
        boolean noEncontrado;
        String palabra;
        char caracterPal;
        noEncontrado = true;

        contador = 0;
        palabra = "";

        longitud = recorteTexto.length() - 1;
        do {
            caracterPal = 'a';
            while (caracterPal != ' ' && contador <= longitud) {
                caracterPal = recorteTexto.charAt(contador);
                palabra = palabra + caracterPal;
                contador++;
            }
            palabra = palabra.trim();
            if (adyacente(palabra)) {
                System.out.println("El texto ingresado tiene una palabra dos vocales adyacentes");
                noEncontrado = false;
            }
            palabra = "";
        } while (contador <= longitud && noEncontrado);
        if (noEncontrado) {
            System.out.println("El texto ingresado no tiene ninguna palabra con dos vocales adyacentes");

        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        char opcion;
        String texto;
        String recorteTexto;
        int punto;
        boolean noFinAlgoritmo, noTexto;
        noFinAlgoritmo = true;

        while (noFinAlgoritmo) {
            System.out.println("Ingrese un texto finalizado en punto");
            texto = TecladoIn.readLine();
            noTexto = true;
            do {
                System.out.println("Elija una de las siguientes opciones : \n"
                        + "a : calcular la longitud del texto ingresado \n"
                        + "b : determinar si el texto ingresado tiene alguna palabra capicua \n"
                        + "c : determinar si el texto ingresado tiene alguna palabra con dos vocales adyacentes \n"
                        + "d : para cambiar un caracter del texto \n"
                        + "e : si desea ingresar un nuevo texto \n"
                        + "f : para ver que texto a ingresado \n"
                        + "q : si desea finalizar");
                opcion = TecladoIn.readLineNonwhiteChar();
                punto = texto.indexOf(".");
                recorteTexto = texto.substring(0, punto);
                if (opcion == 'f') {
                    System.out.println("el texto ingresado es:" + texto);
                }
                if (opcion == 'e') {
                    noTexto = false;
                }
                if (opcion == 'q') {
                    noFinAlgoritmo = false;
                }
                segunSeleccion(opcion, recorteTexto);
            } while (noFinAlgoritmo && noTexto);
        }
    }
}
