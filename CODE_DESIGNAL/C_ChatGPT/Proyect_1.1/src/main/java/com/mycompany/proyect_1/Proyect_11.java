/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Scanner;

/**
 * Write a function that returns the sum of two numbers.
 * @author Luciano Gatti with ChatGPT
 */
public class Proyect_11 {

    public static void main(String[] args) {
        int primerNumero, segundoNumero, resultado;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("INGRESE EL PRIMER NUMERO: ");
            primerNumero = scanner.nextInt();
            System.out.println("INGRESE EL SEGUNDO NUMERO: ");
            segundoNumero = scanner.nextInt();
        }// Cerrar el objeto Scanner

        resultado = solution(primerNumero, segundoNumero);
        System.out.println(resultado);
    }

    public static int solution(int param1, int param2) {
        return param1 + param2;
    }
}
