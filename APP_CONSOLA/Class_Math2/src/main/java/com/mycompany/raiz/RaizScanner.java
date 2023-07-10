/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.raiz;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class RaizScanner {
    public static void main(String[] args) {
        Scanner index = new Scanner (System.in);
        double raiz, x;
        
        System.out.println("Introduce un número: ");
        x = index.nextDouble();
        raiz = Math.sqrt(x);
        System.out.println("La raiz de "+x+" es :"+raiz);
    }
}
