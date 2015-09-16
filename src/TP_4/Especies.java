/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_4;
/**
 *
 * @author german
 */
public class Especies {
    private String nombre;
    private int poblacion;
    private double tasaDeCrecimiento;
    public Especies(String n){
        nombre=n;
    }
    public Especies(String n,int pobl,double tsaCrec){
        nombre=n;
        poblacion=pobl;
        tasaDeCrecimiento=tsaCrec;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPoblacion(){
        return poblacion;
    }
    public double getTasaCrec(){
        return tasaDeCrecimiento;
    }
    public String todoTexto(){
        return "nombre "+ nombre+"\n"+"poblacion "+ poblacion+"\n"+"tasa de crecimiento "+tasaDeCrecimiento;
    }
    public void setPoblacion(int pobl){
        poblacion=pobl;
    }
    public void setTsaCrec(double tsaCrec){
        tasaDeCrecimiento=tsaCrec;
    }
    public double poblacionProyectada(int anios){
        int i;
        double res;
        res =poblacion;
        for(i=1;i<=anios;i++){
            res=(res*tasaDeCrecimiento*anios);
        }
        return res;
    }
}
