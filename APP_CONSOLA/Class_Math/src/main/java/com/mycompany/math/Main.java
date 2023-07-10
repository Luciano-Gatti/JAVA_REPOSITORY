/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.math;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Main {
    public static void main(String[] args) {
    
        Scanner index = new Scanner (System.in);
        int x, y, ang;
        double sin, cos, tan, atan, atan2, exp, log, pi, eps;   
        
        System.out.println("Ingrese el valor de x: ");
        x = index.nextInt();
        System.out.println("Ingrese el valor de y: ");
        y = index.nextInt();
        System.out.println("Ingrese el valor del angulo: ");
        ang = index.nextInt();
        
        sin = Math.sin(ang);
        cos = Math.cos(ang);
        tan = Math.tan(ang);
        atan = Math.atan(ang);
        atan2 = Math.atan2(y, x);
        exp = Math.exp(x);
        log = Math.log(y);
        pi = Math.PI;
        eps = Math.E;
        
        System.out.println("\n**Resultados**");
        System.out.println("Seno: "+sin+"\nCoseno: "+cos+"\nTangente: "+tan);
        System.out.println("Arcotangente: "+atan+"\nAngulo en radianes: "+atan2);
        System.out.println("Numero de Euler :"+exp+"\nLogaritmo: "+log);
        System.out.println("PI: "+pi+"\nBase de los logaritmos naturales: "+eps);
    }
}
