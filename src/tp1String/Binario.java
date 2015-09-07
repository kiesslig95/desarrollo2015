package tp1String;

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
public class Binario {

    public static boolean verificacion(String numero) {
        int largo, cont;
        boolean correcto = true;
        char caracter;
        cont = 0;
        largo = numero.length();

        while (correcto && (cont != largo)) {
            caracter = numero.charAt(cont);
            //System.out.println(caracter);
            if (caracter != '0' && caracter != '1') {
                correcto = false;
            } else {
            }
            cont++;
        }
        return correcto;
    }

    public static String complemento2(String numero) {
        char elemento;
        String conjCompl2 = "", conj="";
        boolean encontrado = true;
        int largo;
        largo = numero.length();
        while (encontrado && largo != -1) {
            elemento = numero.charAt(largo - 1);
            if (elemento == '1' && encontrado) {
                encontrado = false;
                conj = numero.substring(0, largo - 1);
                conj= complemento(conj);
            } 
            conjCompl2 = elemento + conjCompl2;
            largo--;
        }
        conjCompl2 = conj + conjCompl2;
        return conjCompl2;
    }

    public static String complemento(String numero) {
        String comple;
        char a, b;
        int largo,cont=0;
        comple = "";
        largo = numero.length();
        largo--;
        do {
            a = numero.charAt(cont);
            if (a == '1') {
                a = '0';
            } else {
                a = '1';
            }
            comple = (comple + a);
            cont++;
        } while (cont <= largo);
        return comple;
    }

    public static int decimal(String numero) {
        int largo, decimal, suma = 0, poten, cont;
        char caracter;
        largo = numero.length();
        decimal = 0;
        poten = largo - 1;
        cont = 0;
        do {
            caracter = numero.charAt(cont);

            if (caracter == '1') {
                suma = (int) Math.pow(2, poten);
            }
            decimal = decimal + suma;
            poten--;
            cont++;
            suma = 0;
        } while (poten != -1);
        return decimal;
    }

    public static void main(String[] args) {
        char opcion;
        String numero;
        boolean numCorrecto;
        do {
            System.out.println("ingrese un numero binario");
            numero = TecladoIn.readLine();
            numCorrecto = verificacion(numero);
            //System.out.println(numCorrecto);
            if (numCorrecto == false) {
                System.out.println("El numero binario ingresado es incorrecto");
                numCorrecto = true;
            } else {
                numCorrecto = false;
            }
        } while (numCorrecto);
        do {
            System.out.println("Elija una de las siguientes opciones : \n"
                    + "a : calcular el numero ingresado en decimal \n"
                    + "b : obtener el complemento a uno del numero ingresado \n"
                    + "c : obtener el complemento a dos del numero binarion \n"
                    + "d : si desea ingresar un nuevo numero binario \n"
                    + "q : si desea finalizar");
            opcion = TecladoIn.readLineNonwhiteChar();
            if (opcion == 'a') {
                System.out.println("El numero binario ingresado en decimal es:" + decimal(numero));
            }
            if (opcion == 'b') {
                System.out.println("El complemento a uno del numero binario ingresado es:" + complemento(numero));
            }
            if (opcion == 'c') {
                System.out.println("El complemento a dos del numero binario ingresado es: " + complemento2(numero));
            }
            if (opcion == 'd') {
                System.out.println("ingrese un numero binario");
                numero = TecladoIn.readLine();
                numCorrecto = verificacion(numero);
                if (numCorrecto == false) {
                    System.out.println(" El numero binario ingresado es incorrecto");
                }
            }
        } while (opcion != 'q');
    }
}
