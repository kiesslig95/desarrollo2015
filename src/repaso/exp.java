/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author german
 */
public class exp {

    public static int olongo(int num, int cont) {
        int resp = 0;
        if (num >= cont * cont + 1) {
            if (num == cont * (cont + 1)) {
                resp = 1;
            } else {
                resp = olongo(num, cont + 1);
            }
        }

        return resp;
    }

    public static void main(String[] args) {
        int num = 40;
        int cont = 1;

        System.out.println(olongo(num, cont));

    }
}
