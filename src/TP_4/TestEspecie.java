/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_4;

import clases.Especie;
import utiles.TecladoIn;

/**
 *
 * @author german
 */
public class TestEspecie {

    public static Especie ingresarDatos() {
        Especie e = new Especie("");
        System.out.println("Nombre de la especie: ");
        String nombre = TecladoIn.readLine();
        System.out.println("Poblacion actual: ");
        int poblacion = TecladoIn.readLineInt();
        System.out.println("Tasa de creciminte: ");
        double tasa = TecladoIn.readLineDouble();
        e.setNombre(nombre);
        e.setPoblacion(poblacion);
        e.setTsaCrec(tasa);
        return e;
    }

    public static int anios(Especie e1, Especie e2) {
        boolean supera;
        int anios;
        supera = false;
        anios = 0;
        if (!e1.equals(e2)) {
            while (!supera) {
                if (e1.poblacionProyectada(anios) < e2.poblacionProyectada(anios)) {
                    supera = true;
                } else {
                    anios = anios + 1;
                    System.out.println("rino "+e1.poblacionProyectada(anios));
                    System.out.println("ele "+e2.poblacionProyectada(anios));
                }
            }
        } else {
            System.out.println(" las especies ingresadas son las mismas");
        }
        return anios;
    }

    public static void main(String[] args) {
        Especie e1, e2;
        System.out.println("ingrese primera especie");
        e1 = ingresarDatos();
        System.out.println("ingrese segunda especie");
        e2 = ingresarDatos();
        System.out.println("En " + anios(e1, e2) + " la poblacion de la especie de " + e2.getNombre() + " sera mayor a la de la especie de " + e1.getNombre());
    }
}
