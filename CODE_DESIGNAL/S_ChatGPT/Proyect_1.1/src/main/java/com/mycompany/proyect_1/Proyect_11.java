/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Scanner;

/**
 * Write a function that returns the sum of two numbers.
 * @author Luciano Gatti
 */
public class Proyect_11 {
    /*Write a function that returns the sum of two numbers.*/
    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);
        int a, b, result;
        System.out.println("INGRESE EL PRIMER NUMERO: ");
        a = index.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO: ");
        b = index.nextInt();
        result = solution(a,b);
        System.out.println(result);
    }
    
    public static int solution(int param1, int param2) {
        return param1 + param2;
    }   
}
