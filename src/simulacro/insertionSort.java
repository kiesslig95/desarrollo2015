/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacro;

/**
 *
 * @author german
 */
public class insertionSort {
    public static void insercion(int []a){
        int i,j,temp;
        for(i=1;i<=a.length-1;i++){
            temp=a[i];
            j=i;
            while(j>0 && temp<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
    }
    public static void main(String[] args) {
        int []a={5, 7, 1 , 6, 3, 4};
        insercion(a);
        int i;
        for(i=0;i<=a.length-1;i++){
            System.out.print(a[i]);
        }
    }
}
