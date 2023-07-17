/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyect_1;

import java.util.Scanner;

/**
 * Given the string, check if it is a palindrome.
 * @author Luciano Gatti with ChatGPT
 */
public class Proyect_13 {

    public static void main(String[] args) {
        String textoEntrada;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el texto: ");
            textoEntrada = scanner.nextLine();
        }
        if (solution(textoEntrada)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

    public static boolean solution(String inputString) {
        boolean control = true;
        char[] caracteres = inputString.toLowerCase().toCharArray();
        int izq = 0;
        int dere = caracteres.length - 1;

        while (izq < dere) {
            if (caracteres[izq] != caracteres[dere]) {
                control = false;
                break;
            }
            izq++;
            dere--;
        }
        return control;
    }
}
